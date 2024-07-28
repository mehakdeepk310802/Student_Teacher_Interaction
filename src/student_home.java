
import java.util.StringTokenizer;


public class student_home extends javax.swing.JFrame {

    
    public student_home(String email) {
        initComponents();
        fetch_student_info(email);
        setVisible(true);
        setSize(800,800);
    }
    public void fetch_student_info(String email)
    {
         String ans=client.fetch_student_info(email);
        StringTokenizer st=new StringTokenizer(ans,",");
        
            departmentlb.setText(st.nextToken());
            courselb.setText(st.nextToken());
            semesterlb.setText(st.nextToken());
            namelb.setText(st.nextToken());
            fathers_namelb.setText(st.nextToken());
             mobile_nolb.setText(st.nextToken());
            emaillb.setText(st.nextToken());
            addresslb.setText("<html>"+st.nextToken()+"</html>");
           
            
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semesterlb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addresslb = new javax.swing.JLabel();
        departmentlb = new javax.swing.JLabel();
        courselb = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        namelb = new javax.swing.JLabel();
        fathers_namelb = new javax.swing.JLabel();
        mobile_nolb = new javax.swing.JLabel();
        emaillb = new javax.swing.JLabel();
        chatbt = new javax.swing.JButton();
        change_passwordbt = new javax.swing.JButton();
        view_notesbt = new javax.swing.JButton();
        assigmentbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT HOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(7, 10, 740, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT TASK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 70, 360, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STUDENT INFORMATION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 76, 360, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 510, 140, 30);

        semesterlb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        semesterlb.setText("sm");
        getContentPane().add(semesterlb);
        semesterlb.setBounds(190, 240, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Course");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 140, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Semester");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 240, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 290, 140, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Father's Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 340, 140, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Mobile No.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 390, 140, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 450, 140, 30);

        addresslb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addresslb.setText("ad");
        addresslb.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(addresslb);
        addresslb.setBounds(190, 510, 210, 90);

        departmentlb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        departmentlb.setText("dp");
        getContentPane().add(departmentlb);
        departmentlb.setBounds(190, 140, 200, 30);

        courselb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        courselb.setText("cr");
        getContentPane().add(courselb);
        courselb.setBounds(190, 190, 200, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setText("Department");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 140, 140, 30);

        namelb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        namelb.setText("nm");
        getContentPane().add(namelb);
        namelb.setBounds(190, 290, 190, 30);

        fathers_namelb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        fathers_namelb.setText("fn");
        getContentPane().add(fathers_namelb);
        fathers_namelb.setBounds(190, 340, 190, 30);

        mobile_nolb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        mobile_nolb.setText("mn");
        getContentPane().add(mobile_nolb);
        mobile_nolb.setBounds(190, 390, 190, 30);

        emaillb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        emaillb.setText("em");
        getContentPane().add(emaillb);
        emaillb.setBounds(190, 450, 230, 30);

        chatbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        chatbt.setText("Chat");
        getContentPane().add(chatbt);
        chatbt.setBounds(480, 290, 180, 30);

        change_passwordbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        change_passwordbt.setText("Change Password");
        getContentPane().add(change_passwordbt);
        change_passwordbt.setBounds(480, 140, 180, 30);

        view_notesbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        view_notesbt.setText("View Notes");
        getContentPane().add(view_notesbt);
        view_notesbt.setBounds(480, 190, 180, 30);

        assigmentbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        assigmentbt.setText("Assignment");
        getContentPane().add(assigmentbt);
        assigmentbt.setBounds(480, 240, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(student_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new student_home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslb;
    private javax.swing.JButton assigmentbt;
    private javax.swing.JButton change_passwordbt;
    private javax.swing.JButton chatbt;
    private javax.swing.JLabel courselb;
    private javax.swing.JLabel departmentlb;
    private javax.swing.JLabel emaillb;
    private javax.swing.JLabel fathers_namelb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mobile_nolb;
    private javax.swing.JLabel namelb;
    private javax.swing.JLabel semesterlb;
    private javax.swing.JButton view_notesbt;
    // End of variables declaration//GEN-END:variables
}
