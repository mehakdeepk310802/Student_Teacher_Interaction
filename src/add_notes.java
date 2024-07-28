
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class add_notes extends javax.swing.JFrame {

     File ph;
    JFileChooser jfc;
    String email;
    public add_notes(String email) {
        initComponents();
        this.email=email;
        buttonGroup1.add(pdfrb);
        buttonGroup1.add(audiorb);
        buttonGroup1.add(videorb);
        fill_combo_course();
        setVisible(true);
        setSize(500,600);
    }
     public void fill_combo_course() {
        try {
            String ans = client.fill_combo_course();
            
            StringTokenizer st = new StringTokenizer(ans, ",");
            int n = st.countTokens();
            
            
            for (int i = 0; i < n; i++) {
                String store = st.nextToken();
                
                coursecb.addItem(store);
                
                
            }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coursecb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        semestercb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        detailstf = new javax.swing.JTextField();
        topictf = new javax.swing.JTextField();
        videorb = new javax.swing.JRadioButton();
        pdfrb = new javax.swing.JRadioButton();
        audiorb = new javax.swing.JRadioButton();
        browsebt = new javax.swing.JButton();
        addbt = new javax.swing.JButton();
        photolb = new javax.swing.JLabel();
        viewbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NOTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 2, 470, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Course");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 130, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        coursecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursecbItemStateChanged(evt);
            }
        });
        getContentPane().add(coursecb);
        coursecb.setBounds(170, 70, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("File");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 370, 130, 30);

        semestercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10"}));
        getContentPane().add(semestercb);
        semestercb.setBounds(170, 130, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 130, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Topic");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 190, 130, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Details");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 130, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Type");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 320, 130, 30);
        getContentPane().add(detailstf);
        detailstf.setBounds(170, 250, 210, 30);
        getContentPane().add(topictf);
        topictf.setBounds(170, 192, 210, 30);

        videorb.setText("video");
        getContentPane().add(videorb);
        videorb.setBounds(330, 330, 60, 21);

        pdfrb.setText("pdf");
        pdfrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfrbActionPerformed(evt);
            }
        });
        getContentPane().add(pdfrb);
        pdfrb.setBounds(170, 330, 60, 21);

        audiorb.setText("audio");
        getContentPane().add(audiorb);
        audiorb.setBounds(240, 330, 60, 21);

        browsebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        browsebt.setText("Browse");
        browsebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtActionPerformed(evt);
            }
        });
        getContentPane().add(browsebt);
        browsebt.setBounds(180, 380, 110, 30);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("Add");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(180, 440, 110, 30);

        photolb.setText("jLabel8");
        getContentPane().add(photolb);
        photolb.setBounds(350, 380, 110, 90);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("View");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(180, 490, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void coursecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursecbItemStateChanged
        
    }//GEN-LAST:event_coursecbItemStateChanged

    private void browsebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebtActionPerformed
         jfc = new JFileChooser();
        FileNameExtensionFilter filterpdf = new FileNameExtensionFilter("Pdf Files", "pdf");
        FileNameExtensionFilter filteraudio = new FileNameExtensionFilter("Audio Files", "mp3");
        FileNameExtensionFilter filtervideo = new FileNameExtensionFilter("Video Files", "mp4");
        jfc.setAcceptAllFileFilterUsed(false);
        ImageIcon icon = null;
        if (pdfrb.isSelected()) {
            jfc.setFileFilter(filterpdf);
            icon = new ImageIcon("src/content/pdficon.png");
             String filetype = "Pdf";
        } else if (audiorb.isSelected()) {
            jfc.setFileFilter(filteraudio);
            icon = new ImageIcon("src/content/audioicon.png");
             String filetype = "Audio";
        } else {
            jfc.setFileFilter(filtervideo);
            icon = new ImageIcon("src/content/videoicon.png");
             String filetype = "Video";
        }

        int showOpenDialog = jfc.showOpenDialog(this);
        if (showOpenDialog == JFileChooser.APPROVE_OPTION) {
            ph = jfc.getSelectedFile();
            //photolb.setText(ph.getPath());
            photolb.setIcon(icon);
        }
    }//GEN-LAST:event_browsebtActionPerformed

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
       
        String id=(String)coursecb.getSelectedItem();
        
       int course=Integer.parseInt(id.charAt(0)+"");
      
       String teacher_id=email;
       
       String semester=(String)semestercb.getSelectedItem();
      
       String topic=topictf.getText();
       
       String details=detailstf.getText();
      
        SimpleDateFormat sdf=new SimpleDateFormat();
        String date=sdf.format(new Date());
       
        String type=" ";
       if(pdfrb.isSelected())
       {
           type="pdf";
       }
       else if(audiorb.isSelected())
       {
           type="audio";
       }
       else
       {
           type="video";
       }
      
       String path=ph.getPath();
      
       if(teacher_id.isEmpty()||topic.isEmpty()||details.isEmpty()||date.isEmpty()||type.isEmpty()||path.isEmpty()||course==0||semester.isEmpty())
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
             System.out.println("hello world1");
            String result=client.add_notes(teacher_id,topic,details,date,type,path,course,semester);
            System.out.println("hello world");
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

    private void pdfrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfrbActionPerformed
       
    }//GEN-LAST:event_pdfrbActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
       dispose();
       view_notes vn=new view_notes();
    }//GEN-LAST:event_viewbtActionPerformed

   
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
//            java.util.logging.Logger.getLogger(add_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(add_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(add_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(add_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new add_notes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JRadioButton audiorb;
    private javax.swing.JButton browsebt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JTextField detailstf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton pdfrb;
    private javax.swing.JLabel photolb;
    private javax.swing.JComboBox<String> semestercb;
    private javax.swing.JTextField topictf;
    private javax.swing.JRadioButton videorb;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables
}
