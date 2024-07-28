
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class view_students extends javax.swing.JFrame {

    ArrayList<student_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public view_students() {
        initComponents();
         al = new ArrayList<>();
        fill_combo();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 100, 970, 400);
        add(jsp);
        jt.setModel(tm);
        setVisible(true);
        setSize(1000,650);
    }
     public void fill_combo() {
        try {
            String ans = client.fill_combobox();
            
            StringTokenizer st = new StringTokenizer(ans, ",");
            int n = st.countTokens();
            System.out.println("Count " + n);
            
            for (int i = 0; i < n; i++) {
                String store = st.nextToken();
                
                departmentcb.addItem(store);
                
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
     public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_student_data();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String department = "";
            int course = 0;
            String semester = "";
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String email = "";
            String address = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            department=st1.nextToken();
            course=Integer.parseInt(st1.nextToken());
            semester=st1.nextToken();
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            email=st1.nextToken();
            address=st1.nextToken();
            photo=st1.nextToken();
            al.add(new student_data(department, course, semester, name, fathers_name, mobile_no, email, address, photo));
        }

    }
    public class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();

        }

        @Override
        public int getColumnCount() {
            return 9;
        }

        @Override
        public String getColumnName(int i) {
            String col[] = {"DEPARTMENT","COURSE","SEMESTER","NAME", "FATHER'S NAME", "MOBILE NO.", "EMAIL","ADDRESS","PHOTO"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

            //System.out.println(i);
            student_data sd = al.get(i);

            if(j==0)
            {
                return sd.department;
            }
            else if(j==1)
            {
                return sd.course;
            }
            else if(j==2)
            {
                return sd.semester;
            }
            else if(j==3)
            {
                return sd.name;
            }
            else if(j==4)
            {
                return sd.fathers_name;
            }
            else if(j==5)
            {
                return sd.mobile_no;
            }
            else if(j==6)
            {
                return sd.email;
            }
            else if(j==7)
            {
                return sd.address;
            }
            else
            {
                return sd.photo;
            }
        }

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        departmentcb = new javax.swing.JComboBox<>();
        deletebt = new javax.swing.JButton();
        viewbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW STUDENTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 960, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("CHOOSE DEPARTMENT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 200, 30);

        departmentcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        getContentPane().add(departmentcb);
        departmentcb.setBounds(300, 72, 210, 30);

        deletebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletebt.setText("DELETE");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt);
        deletebt.setBounds(440, 550, 110, 30);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("VIEW");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(580, 70, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
         int i=jt.getSelectedRow();
        String email=(String)jt.getValueAt(i, 6);
        
        String ans=client.delete_student(email);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        view_students vs=new view_students();
    }//GEN-LAST:event_deletebtActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
        al.clear();
        String department1=(String)departmentcb.getSelectedItem();
        String fetch = client.fetch_selected_student_data(department1);
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String department = "";
            int course = 0;
            String semester = "";
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String email = "";
            String address = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            department=st1.nextToken();
            course=Integer.parseInt(st1.nextToken());
            semester=st1.nextToken();
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            email=st1.nextToken();
            address=st1.nextToken();
            photo=st1.nextToken();
            al.add(new student_data(department, course, semester, name, fathers_name, mobile_no, email, address, photo));
        }
        tm.fireTableDataChanged();

    }//GEN-LAST:event_viewbtActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebt;
    private javax.swing.JComboBox<String> departmentcb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables
}
