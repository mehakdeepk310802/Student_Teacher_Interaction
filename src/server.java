
import com.vmm.JHTTPServer;
import java.io.IOException;
import java.util.Properties;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class server extends JHTTPServer
{
    server(int port)  throws IOException
    {
        super(port);
    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) {
        
        
        if(uri.equals("/signup"))
        {
            String username=parms.getProperty("username");
            String email=parms.getProperty("email");
            String password=parms.getProperty("password");
            String phone=parms.getProperty("phone");
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from signup where email='"+email+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    String photoname=saveFileOnServerWithRandomName(files, parms, "photo", "src/uploads/");
                    rs.moveToInsertRow();
                    rs.updateString("username",username);
                    rs.updateString("email",email);
                    rs.updateString("password",password);
                    rs.updateString("phone",phone);
                    rs.updateString("photo","src/uploads/"+photoname);
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
        else if(uri.equals("/user_login"))
        {
           
            String email=parms.getProperty("email");
            String password=parms.getProperty("password");
           
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from signup where email='"+email+"' and password='"+password+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "sucess");
                }
                else
                {
                   
                     return new Response(HTTP_OK, "text/plain", "invalid passwrod or id");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
         else if(uri.equals("/admin_login"))
        {
           
            String username=parms.getProperty("username");
            String password=parms.getProperty("password");
           
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from admin where username='"+username+"' and password='"+password+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "sucess");
                }
                else
                {
                   
                     return new Response(HTTP_OK, "text/plain", "invalid passwrod or id");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
         else if(uri.equals("/delete"))
         {
             int id=Integer.parseInt(parms.getProperty("id"));
             try
        {
            ResultSet rs=DBLoader.executeQuery("select * from department where id='"+id+"'");
            if(rs.next())
            {
                rs.deleteRow();
                 return new Response(HTTP_OK, "text/plain", "removed sucessfully");
            }
            else
            {
                 return new Response(HTTP_OK, "text/plain", "fail to delete");
            }
           
           
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         }
         
        else if(uri.equals("/delete_course"))
         {
             int id=Integer.parseInt(parms.getProperty("id"));
             System.out.println(id);
             try
        {
            ResultSet rs=DBLoader.executeQuery("select * from courses where id='"+id+"'");
            if(rs.next())
            {
                rs.deleteRow();
                 return new Response(HTTP_OK, "text/plain", "removed sucessfully");
            }
            else
            {
                 return new Response(HTTP_OK, "text/plain", "fail to delete");
            }
           
           
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         }
        
        else if(uri.equals("/delete_faculty"))
         {
             String email=parms.getProperty("email");
             
             try
        {
            ResultSet rs=DBLoader.executeQuery("select * from faculty where email='"+email+"'");
            if(rs.next())
            {
                rs.deleteRow();
                 return new Response(HTTP_OK, "text/plain", "removed sucessfully");
            }
            else
            {
                 return new Response(HTTP_OK, "text/plain", "fail to delete");
            }
           
           
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         }
        
         else if(uri.equals("/delete_student"))
         {
             String email=parms.getProperty("email");
             
             try
        {
            ResultSet rs=DBLoader.executeQuery("select * from students where email='"+email+"'");
            if(rs.next())
            {
                rs.deleteRow();
                 return new Response(HTTP_OK, "text/plain", "removed sucessfully");
            }
            else
            {
                 return new Response(HTTP_OK, "text/plain", "fail to delete");
            }
           
           
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         }
         
        else if(uri.equals("/delete_notes"))
         {
             int notes_id=Integer.parseInt(parms.getProperty("notes_id"));
             
             
             try
        {
            ResultSet rs=DBLoader.executeQuery("select * from notes where notes_id="+notes_id);
            if(rs.next())
            {
                rs.deleteRow();
                 return new Response(HTTP_OK, "text/plain", "removed sucessfully");
            }
            else
            {
                 return new Response(HTTP_OK, "text/plain", "fail to delete");
            }
           
           
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         }
        else if(uri.equals("/add_dept"))
        {
            String department_name=parms.getProperty("department_name");
            String description=parms.getProperty("description");
            
            
            try
            {
              
                ResultSet rs=DBLoader.executeQuery("select * from department where department_name='"+department_name+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    
                    rs.moveToInsertRow();
                    rs.updateString("department_name",department_name);
                    rs.updateString("description",description);
                   
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
         else if(uri.equals("/add_course"))
        {
            String course_name=parms.getProperty("course_name");
            String department_name=parms.getProperty("department_name");
            String semester=parms.getProperty("semester");
            String description=parms.getProperty("description");
            
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from courses where course_name='"+course_name+"' and department_name='"+department_name+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    
                    rs.moveToInsertRow();
                    rs.updateString("course_name",course_name);
                    rs.updateString("department_name",department_name);
                    rs.updateString("semester",semester);
                    rs.updateString("description",description);
                   
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_data"))
        {
           
            try
            { 
                 ArrayList<department_data> al=new ArrayList<>();
                ResultSet rs=DBLoader.executeQuery("select * from department");
                String ans="";
                 while(rs.next())
                {
                    int id=rs.getInt("id");
                    String department_name=rs.getString("department_name");
                    String description=rs.getString("description");
                    ans=ans+id+","+department_name+","+description+";";
//                   
                }
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        
        else if(uri.equals("/fetch_all_courses"))
        {
           
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from courses");
                String ans="";
                
                 while(rs.next())
                {
                    int id=rs.getInt("id");
                    String course_name=rs.getString("course_name");

                    String department_name=rs.getString("department_name");
                    String semester=rs.getString("semester");
                    String description=rs.getString("description");
                    ans=ans+id+","+course_name+","+department_name+","+semester+","+description+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        else if(uri.equals("/fetch_courses_for_combo"))
        {
            System.out.println("hello");
            String department=parms.getProperty("department");
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from courses where department_name='"+department+"'");
                String ans="";
                
                 while(rs.next())
                {
                    int id=rs.getInt("id");
                    String course_name=rs.getString("course_name");

                   
                    ans=ans+id+" "+course_name+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
         else if(uri.equals("/fetch_faculty_data"))
        {
           
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from faculty");
                String ans="";
                
                 while(rs.next())
                {
                    
                    String name=rs.getString("name");

                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String address=rs.getString("address");
                    String qualification=rs.getString("qualification");
                    String department=rs.getString("department");
                    String email=rs.getString("email");
                    String photo=rs.getString("photo");
                    
                    ans=ans+name+","+fathers_name+","+mobile_no+","+address+","+qualification+","+department+","+email+","+photo+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        else if(uri.equals("/fetch_student_data"))
        {
           
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from students");
                String ans="";
                
                 while(rs.next())
                {
                    String department=rs.getString("department");
                    int course=rs.getInt("course");
                    String semester=rs.getString("semester");
                    String name=rs.getString("name");
                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String email=rs.getString("email");
                    String address=rs.getString("address");
                    String photo=rs.getString("photo");
                    
                    ans=ans+department+","+course+","+semester+","+name+","+fathers_name+","+mobile_no+","+email+","+address+","+photo+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(uri.equals("/fetch_notes_data"))
        {
           try
            {
                ResultSet rs=DBLoader.executeQuery("select * from notes");
                String ans="";
               
                    while(rs.next())
                    {
                    String notes_id=rs.getInt("notes_id")+"";
                    String teacher_id=rs.getString("teacher_id");
                    String topic=rs.getString("title");
                    String details=rs.getString("detail");
                    String date=rs.getString("date_time");
                    String type=rs.getString("type");
                    String path=rs.getString("file");
                    String course=rs.getInt("course")+"";
                    String semester=rs.getString("semester");
                    
                    ans=ans+notes_id+"$"+teacher_id+"$"+topic+"$"+details+"$"+date+"$"+type+"$"+path+"$"+course+"$"+semester+";";
                    
                    }
                    System.out.println(ans);
                    
                     return new Response(HTTP_OK, "text/plain", ans);
            }
            
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_selected_student_data"))
        {
           String department1=parms.getProperty("department1");
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from students where department='"+department1+"'");
                String ans="";
                
                 while(rs.next())
                {
                    String department=rs.getString("department");
                    int course=rs.getInt("course");
                    String semester=rs.getString("semester");
                    String name=rs.getString("name");
                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String email=rs.getString("email");
                    String address=rs.getString("address");
                    String photo=rs.getString("photo");
                    
                    ans=ans+department+","+course+","+semester+","+name+","+fathers_name+","+mobile_no+","+email+","+address+","+photo+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_selected_notes"))
        {
            System.out.println("hello");
           String course1=parms.getProperty("course1");
           int course_id=Integer.parseInt(course1);
           String semester1=parms.getProperty("semester1");
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from notes where semester='"+semester1+"' and course=" +course_id);
                String ans="";
                
                 while(rs.next())
                {
                    int notes_id=rs.getInt("notes_id");
                    String teacher_id=rs.getString("teacher_id");
                    String title=rs.getString("title");
                    String detail=rs.getString("detail");
                    String date_time=rs.getString("date_time");
                    String type=rs.getString("type");
                    String file=rs.getString("file");
                    int course=rs.getInt("course");
                    String semester=rs.getString("semester");
                    
                    ans=ans+notes_id+"$"+teacher_id+"$"+title+"$"+detail+"$"+date_time+"$"+type+"$"+file+"$"+course+"$"+semester+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_selected_faculty"))
        {
            String department1=parms.getProperty("department1");
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from faculty where department='"+department1+"'");
                String ans="";
                
                 while(rs.next())
                {
                    
                    String name=rs.getString("name");

                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String address=rs.getString("address");
                    String qualification=rs.getString("qualification");
                    String department=rs.getString("department");
                    String email=rs.getString("email");
                    String photo=rs.getString("photo");
                    
                    ans=ans+name+","+fathers_name+","+mobile_no+","+address+","+qualification+","+department+","+email+","+photo+";";
                    
//                   
                }
                 System.out.println(ans);
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_selected_courses"))
        {
           String department_name1=parms.getProperty("department_name1");
            try
            { 
                
                ResultSet rs=DBLoader.executeQuery("select * from courses where department_name='"+department_name1+"'");
                String ans="";
                  while(rs.next())
                {
                    int id=rs.getInt("id");
                    String course_name=rs.getString("course_name");

                    String department_name=rs.getString("department_name");
                    String semester=rs.getString("semester");
                    String description=rs.getString("description");
                    ans=ans+id+","+course_name+","+department_name+","+semester+","+description+";";
                    
//                   
                }
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        else if(uri.equals("/fill_combobox"))
        {
           
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from department");
                String ans="";
                 while(rs.next())
                {
                    
                    String department_name=rs.getString("department_name");
                    
                    ans=ans+department_name+",";
                    
                }
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fill_combo_course"))
        {
           
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from courses");
                String ans="";
                 while(rs.next())
                {
                    
                    int id=rs.getInt("id");
                    String course_name=rs.getString("course_name");
                    String department=rs.getString("department_name");
                    ans=ans+id+" "+course_name+" "+department+",";
                    
                }
                return new Response(HTTP_OK, "text/plain",ans);
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fill_combo_semester"))
        {
            int id=Integer.parseInt(parms.getProperty("id"));
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from courses where id='"+id+"'");
                
                if(rs.next())
                {
                    
                    
                    String semester=rs.getString("semester");
                    return new Response(HTTP_OK, "text/plain",semester);
                    
                }
               
                
            
            
           
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/faculty_login"))
        {
           String email=parms.getProperty("email");
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from faculty where email='"+email+"'");
                int otp=0;
                 if(rs.next())
                 {
                     otp=(int)(Math.random()*10000);
                     System.out.println(otp);
                 }
                return new Response(HTTP_OK, "text/plain",otp+"");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/student_login"))
        {
           String email=parms.getProperty("email");
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from students where email='"+email+"'");
                int otp=0;
                 if(rs.next())
                 {
                     otp=(int)(Math.random()*10000);
                     System.out.println(otp);
                 }
                return new Response(HTTP_OK, "text/plain",otp+"");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_faculty_info"))
        {
             System.out.println("hello");
           String email1=parms.getProperty("email");
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from faculty where email='"+email1+"'");
                String ans="";
                
                 while(rs.next())
                {
                    
                    String name=rs.getString("name");

                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String address=rs.getString("address");
                    String qualification=rs.getString("qualification");
                    String department=rs.getString("department");
                    String email=rs.getString("email");
                   
                    
                    ans=ans+name+","+fathers_name+","+department+","+email+","+qualification+","+mobile_no+","+address;
                    System.out.println(ans);
                }
                return new Response(HTTP_OK, "text/plain",ans);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(uri.equals("/fetch_student_info"))
        {
             System.out.println("hello");
           String email1=parms.getProperty("email");
            try
            { 
                ResultSet rs=DBLoader.executeQuery("select * from students where email='"+email1+"'");
                String ans="";
                
                 while(rs.next())
                {
                    String department=rs.getString("department");
                    String course=rs.getString("course");
                    String semester=rs.getString("semester");
                    String name=rs.getString("name");
                    String fathers_name=rs.getString("fathers_name");
                    String mobile_no=rs.getString("mobile_no");
                    String email=rs.getString("email");
                    String address=rs.getString("address");
                    
                    
                   
                    
                    ans=ans+department+","+course+","+semester+","+name+","+fathers_name+","+mobile_no+","+email+","+address;
                    System.out.println(ans);
                }
                return new Response(HTTP_OK, "text/plain",ans);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        if(uri.equals("/add_faculty"))
        {
            String name=parms.getProperty("name");
            String fathers_name=parms.getProperty("fathers_name");
            String mobile_no=parms.getProperty("mobile_no");
            String address=parms.getProperty("address");
            String qualification=parms.getProperty("qualification");
            String department=parms.getProperty("department");
            String email=parms.getProperty("email");
            
            
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from faculty where email='"+email+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    String photoname=saveFileOnServerWithRandomName(files, parms, "photo", "src/upload_faculty/");
                    rs.moveToInsertRow();
                    rs.updateString("name",name);
                    rs.updateString("fathers_name",fathers_name);
                    rs.updateString("mobile_no",mobile_no);
                    rs.updateString("address",address);
                    rs.updateString("qualification",qualification);
                    rs.updateString("department",department);
                    rs.updateString("email",email);
                    rs.updateString("photo","src/upload_faculty/"+photoname);
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
         if(uri.equals("/add_notes"))
        {
            System.out.println("hello2");
            String teacher_id=parms.getProperty("teacher_id");
            String topic=parms.getProperty("topic");
            String details=parms.getProperty("details");
            String date=parms.getProperty("date");
            String type=parms.getProperty("type");
            String path=parms.getProperty("path");
            int course=Integer.parseInt(parms.getProperty("course"));
            String semester=parms.getProperty("semester");
            
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from notes where title='"+topic+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    
                    rs.moveToInsertRow();
                    rs.updateString("teacher_id",teacher_id);
                    rs.updateString("title",topic);
                    rs.updateString("detail",details);
                    rs.updateString("date_time",date);
                    rs.updateString("type",type);
                    rs.updateString("file",path);
                    rs.updateInt("course",course);
                    rs.updateString("semester",semester);
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
        if(uri.equals("/add_students"))
        {
            String department=parms.getProperty("department");
            String course_temp=parms.getProperty("course");
            int course=Integer.parseInt(course_temp);
            String semester=parms.getProperty("semester");
            String name=parms.getProperty("name");
            String fathers_name=parms.getProperty("fathers_name");
            String mobile_no=parms.getProperty("mobile_no");
            String email=parms.getProperty("email");
            String address=parms.getProperty("address");
           
            
            
            
            try
            {
                ResultSet rs=DBLoader.executeQuery("select * from students where email='"+email+"'");
                if(rs.next())
                {
                    return new Response(HTTP_OK, "text/plain", "exist");
                }
                else
                {
                    String photoname=saveFileOnServerWithRandomName(files, parms, "photo", "src/upload_students/");
                    rs.moveToInsertRow();
                    rs.updateString("department",department);
                    rs.updateInt("course",course);
                    rs.updateString("semester",semester);
                    rs.updateString("name",name);
                    rs.updateString("fathers_name",fathers_name);
                    rs.updateString("mobile_no",mobile_no);
                    rs.updateString("email",email);
                    rs.updateString("address",address);
                    rs.updateString("photo","src/upload_students/"+photoname);
                    rs.insertRow();
                    
                     return new Response(HTTP_OK, "text/plain", "success");
                }
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }

        return null;
           
       }
       
    
}
