
import java.awt.Image;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class manage_faculty extends javax.swing.JFrame {

     File ph;
    JFileChooser jfc;
  
    public manage_faculty() {
        initComponents();
        fill_combo();
        setVisible(true);
        setSize(770,570);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fathers_nametf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobile_notf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qualificationtf = new javax.swing.JTextField();
        photolb1 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adressta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        departmentcb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();
        browsebt1 = new javax.swing.JButton();
        viewbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD FACULTY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 750, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 76, 120, 30);
        getContentPane().add(nametf);
        nametf.setBounds(170, 70, 180, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 130, 30);
        getContentPane().add(fathers_nametf);
        fathers_nametf.setBounds(170, 130, 180, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Mobile No.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 130, 30);
        getContentPane().add(mobile_notf);
        mobile_notf.setBounds(170, 200, 180, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Department");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 130, 130, 30);
        getContentPane().add(qualificationtf);
        qualificationtf.setBounds(540, 70, 180, 40);

        photolb1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        photolb1.setText("Preview");
        getContentPane().add(photolb1);
        photolb1.setBounds(550, 280, 170, 110);
        getContentPane().add(emailtf);
        emailtf.setBounds(540, 200, 180, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 130, 30);

        adressta.setColumns(20);
        adressta.setRows(5);
        jScrollPane1.setViewportView(adressta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 280, 190, 130);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Qualification");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 70, 130, 30);

        departmentcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department Name"}));
        departmentcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentcbActionPerformed(evt);
            }
        });
        getContentPane().add(departmentcb);
        departmentcb.setBounds(540, 130, 180, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 200, 120, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Photo");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 270, 110, 30);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("ADD");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(390, 470, 120, 30);

        browsebt1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        browsebt1.setText("BROWSE");
        browsebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebt1ActionPerformed(evt);
            }
        });
        getContentPane().add(browsebt1);
        browsebt1.setBounds(580, 430, 120, 30);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("VIEW");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(210, 470, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departmentcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentcbActionPerformed

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
    private void browsebt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebt1ActionPerformed
       jfc=new JFileChooser();
       int ans=jfc.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION)
       {
           ph=jfc.getSelectedFile();
           ImageIcon ic = new ImageIcon(ph.getPath());
          
          Image img = ic.getImage().getScaledInstance(photolb1.getWidth(), photolb1.               getHeight(), Image.SCALE_SMOOTH);
          
          ImageIcon ic1 = new ImageIcon(img);
          photolb1.setIcon(ic1);
       }
    }//GEN-LAST:event_browsebt1ActionPerformed

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
       String name=nametf.getText();
       String fathers_name=fathers_nametf.getText();
       String mobile_no=mobile_notf.getText();
       String address=adressta.getText();
       String qualification=qualificationtf.getText();
       String department=(String)departmentcb.getSelectedItem();
       String email=emailtf.getText();
       
       if(name.isEmpty()||fathers_name.isEmpty()||mobile_no.isEmpty()||address.isEmpty()||qualification.isEmpty()||department.isEmpty()||email.isEmpty()||ph == null)
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
            String result=client.add_faculty(name, fathers_name, mobile_no, address,qualification,department,email, ph);
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
    }//GEN-LAST:event_addbtActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
        dispose();
        view_faculty vf=new view_faculty();
    }//GEN-LAST:event_viewbtActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(manage_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JTextArea adressta;
    private javax.swing.JButton browsebt1;
    private javax.swing.JComboBox<String> departmentcb;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField fathers_nametf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile_notf;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel photolb1;
    private javax.swing.JTextField qualificationtf;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables
}
