
import javax.swing.JOptionPane;


public class student_login extends javax.swing.JFrame {

 
    public student_login() {
        initComponents();
        setVisible(true);
        setSize(500,400);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        otpbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(2, 4, 420, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 90, 30);
        getContentPane().add(emailtf);
        emailtf.setBounds(130, 100, 200, 30);

        otpbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        otpbt.setText("SEND OTP");
        otpbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpbtActionPerformed(evt);
            }
        });
        getContentPane().add(otpbt);
        otpbt.setBounds(160, 160, 120, 30);

        pack();
    }// </editor-fold>                        

    private void otpbtActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String email=emailtf.getText();
        String ans=client.student_login(email);
        ans=ans.trim();
        String value=JOptionPane.showInputDialog("OTP");
        if(ans.equals(value))
        {
            JOptionPane.showMessageDialog(rootPane, "Login Successfull");
            dispose();
            student_home sh=new student_home(email);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Invalid OTP");
        }
    }                                     

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
            java.util.logging.Logger.getLogger(faculty_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(faculty_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(faculty_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(faculty_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField emailtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton otpbt;
    // End of variables declaration                   
}
