
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class manage_students extends javax.swing.JFrame  {

    File ph;
    JFileChooser jfc;
  
    public manage_students() {
        initComponents();
       
        fill_combo_dept();
        setVisible(true);
        setSize(850,650);
    }
    public void fill_combo_dept() {
        try {
            String ans = client.fill_combobox();
            
            StringTokenizer st = new StringTokenizer(ans, ",");
            int n = st.countTokens();
            System.out.println("Count " + n);
            
            for (int i = 0; i < n; i++) {
                String store = st.nextToken();
                
                dpcb.addItem(store);
                
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpcb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fathersnametf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mobilenotf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressta = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        viewbt = new javax.swing.JButton();
        browsebt = new javax.swing.JButton();
        coursecb = new javax.swing.JComboBox<>();
        semestercb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD STUDENTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(16, 6, 730, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Department");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 130, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Course");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 130, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 290, 130, 30);

        dpcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        dpcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dpcbItemStateChanged(evt);
            }
        });
        dpcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpcbActionPerformed(evt);
            }
        });
        getContentPane().add(dpcb);
        dpcb.setBounds(160, 70, 170, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Semester");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 210, 130, 30);
        getContentPane().add(nametf);
        nametf.setBounds(160, 290, 170, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Father's Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 370, 130, 30);
        getContentPane().add(fathersnametf);
        fathersnametf.setBounds(160, 370, 170, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Mobile No.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 70, 130, 30);
        getContentPane().add(mobilenotf);
        mobilenotf.setBounds(550, 70, 170, 30);
        getContentPane().add(emailtf);
        emailtf.setBounds(550, 140, 170, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 140, 130, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Photo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 370, 130, 30);

        addressta.setColumns(20);
        addressta.setRows(5);
        jScrollPane1.setViewportView(addressta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 210, 170, 110);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 210, 130, 30);

        photolb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        photolb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        photolb.setText("Preview");
        photolb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(photolb);
        photolb.setBounds(550, 370, 170, 100);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("ADD");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(200, 520, 110, 30);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("VIEW");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(370, 520, 110, 30);

        browsebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        browsebt.setText("BROWSE");
        browsebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtActionPerformed(evt);
            }
        });
        getContentPane().add(browsebt);
        browsebt.setBounds(580, 490, 110, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        getContentPane().add(coursecb);
        coursecb.setBounds(160, 140, 170, 30);

        semestercb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester","1","2","3","4","5","6","7","8","9","10", }));
        getContentPane().add(semestercb1);
        semestercb1.setBounds(160, 210, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
       String department=(String)dpcb.getSelectedItem();
       String course_temp=(String)coursecb.getSelectedItem();
       StringTokenizer st=new StringTokenizer(course_temp);
       int course=0;
       course=Integer.parseInt(st.nextToken());
       String semester=(String)semestercb1.getSelectedItem();
       String name=nametf.getText();
       String fathers_name=fathersnametf.getText();
       String mobile_no=mobilenotf.getText();
       String email=emailtf.getText();
       String address=addressta.getText();
      
       
      
       
       if(department.isEmpty()||course==0||semester.isEmpty()||name.isEmpty()||fathers_name.isEmpty()||mobile_no.isEmpty()||address.isEmpty()||email.isEmpty()||ph == null)
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
            String result=client.add_students(department,course,semester,name, fathers_name, mobile_no,email,address, ph);
            if(result.trim().equals("exists"))
            {
                JOptionPane.showMessageDialog(rootPane, "Already Exist");
            }
            else if(result.trim().equals("success"))
            {
                JOptionPane.showMessageDialog(rootPane, "Success");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        }
        dpcb.setSelectedIndex(0);
        coursecb.setSelectedIndex(0);
        semestercb1.setSelectedIndex(0);
        nametf.setText("");
        fathersnametf.setText("");
        mobilenotf.setText("");
        emailtf.setText("");
        addressta.setText("");
        photolb.setIcon(null);
        photolb.setText("preview");
       
    }//GEN-LAST:event_addbtActionPerformed

    private void browsebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebtActionPerformed
         jfc=new JFileChooser();
       int ans=jfc.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION)
       {
           ph=jfc.getSelectedFile();
           ImageIcon ic = new ImageIcon(ph.getPath());
          
          Image img = ic.getImage().getScaledInstance(photolb.getWidth(), photolb.               getHeight(), Image.SCALE_SMOOTH);
          
          ImageIcon ic1 = new ImageIcon(img);
          photolb.setIcon(ic1);
       }
    }//GEN-LAST:event_browsebtActionPerformed
    public void fill_combo_course(String department)
    {
        String ans=client.fetch_courses_for_combo(department);
        
        StringTokenizer st=new StringTokenizer(ans,";");
        int n=st.countTokens();
        for(int i=1;i<=n;i++)
        {
            coursecb.addItem(st.nextToken());
        }
        
    }
    private void dpcbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dpcbItemStateChanged
        
        if(evt.getStateChange()==evt.SELECTED)
        {
            fill_combo_course((String)evt.getItem());
        }    
    }//GEN-LAST:event_dpcbItemStateChanged

    private void dpcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpcbActionPerformed
        
    }//GEN-LAST:event_dpcbActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
        dispose();
        view_students vs=new view_students();
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
            java.util.logging.Logger.getLogger(manage_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JTextArea addressta;
    private javax.swing.JButton browsebt;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JComboBox<String> dpcb;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField fathersnametf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobilenotf;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel photolb;
    private javax.swing.JComboBox<String> semestercb1;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables

    
}
