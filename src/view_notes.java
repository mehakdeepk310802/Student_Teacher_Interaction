
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class view_notes extends javax.swing.JFrame {

    ArrayList<notes_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public view_notes() {
        initComponents();
        fill_combo_course();
        
        al = new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 200, 900, 400);
        add(jsp);
        jt.setModel(tm);
        setVisible(true);
        setSize(950,870);
    }
     public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_notes_data();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String notes_id = "";
            String teacher_id = "";
            String topic = "";
            String details = "";
            String date = "";
            String type = "";
            String path = "";
            String course = "";
            String semester = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            System.out.println(ans1);
            StringTokenizer st1 = new StringTokenizer(ans1, "$");
           
            notes_id=st1.nextToken();
            teacher_id=st1.nextToken();
            topic=st1.nextToken();
            details=st1.nextToken();
            date=st1.nextToken();
            type=st1.nextToken();
            path=st1.nextToken();
            course=st1.nextToken();
            semester=st1.nextToken();
            al.add(new notes_data(notes_id, teacher_id, topic, details, date, type, path, course, semester));
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
            String col[] = {"NOTES ID", "TEACHER ID", "TITLE", "DETAIL", "DATE TIME","TYPE","FILE","COURSE","SEMESTER"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

           notes_data nd=al.get(i);
            if(j==0)
            {
                 return nd.notes_id;
            }
           else if(j==1)
            {
                return nd.teacher_id;
            }
            else if(j==2)
            {
                return nd.topic;
            }
            else if(j==3)
            {
                return nd.details;
            }
            else if(j==4)
            {
                return nd.date;
            }
            else if(j==5)
            {
                return nd.type;
            }
            else if(j==6)
            {
                return nd.path;
            }
            else if(j==7)
            {
                return nd.course;
            }
             else 
            {
                return nd.semester;
            }
            
        }

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coursecb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        semestercb = new javax.swing.JComboBox<>();
        Vviewbt = new javax.swing.JButton();
        deletebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW NOTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(8, 6, 860, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Course");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 60, 120, 30);

        coursecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        coursecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursecbItemStateChanged(evt);
            }
        });
        getContentPane().add(coursecb);
        coursecb.setBounds(340, 60, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 110, 120, 30);

        semestercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10", }));
        semestercb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semestercbItemStateChanged(evt);
            }
        });
        getContentPane().add(semestercb);
        semestercb.setBounds(340, 110, 210, 30);

        Vviewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Vviewbt.setText("VIEW");
        Vviewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VviewbtActionPerformed(evt);
            }
        });
        getContentPane().add(Vviewbt);
        Vviewbt.setBounds(340, 160, 210, 32);

        deletebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletebt.setText("DELETE");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt);
        deletebt.setBounds(390, 600, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semestercbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semestercbItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_semestercbItemStateChanged

    private void coursecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursecbItemStateChanged
       
//        if(evt.getStateChange()==evt.SELECTED)
//        {
//           String select=(String)coursecb.getSelectedItem();
//           System.out.println(select);
//         int fetch=Integer.parseInt(select.charAt(0)+"");
//            System.out.println(fetch);
//            fill_combo_semester(fetch);
//        }
    }//GEN-LAST:event_coursecbItemStateChanged

    private void VviewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VviewbtActionPerformed
         al.clear();
         System.out.println(al);
        String id=(String)coursecb.getSelectedItem();
         int course1=Integer.parseInt(id.charAt(0)+"");
         String semester1=(String)semestercb.getSelectedItem();
         String ans=client.fetch_selected_notes(course1+"",semester1);
         System.out.println(ans);
         StringTokenizer st = new StringTokenizer(ans, ";");

        int n = st.countTokens();
        
            String notes_id = "";
            String teacher_id = "";
            String topic = "";
            String details = "";
            String date = "";
            String type = "";
            String path = "";
            String course = "";
            String semester = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            System.out.println(ans1);
            StringTokenizer st1 = new StringTokenizer(ans1, "$");
           
            notes_id=st1.nextToken();
            teacher_id=st1.nextToken();
            topic=st1.nextToken();
            details=st1.nextToken();
            date=st1.nextToken();
            type=st1.nextToken();
            path=st1.nextToken();
            course=st1.nextToken();
            semester=st1.nextToken();
            al.add(new notes_data(notes_id, teacher_id, topic, details, date, type, path, course, semester));
        }
        tm.fireTableDataChanged();
    }//GEN-LAST:event_VviewbtActionPerformed

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
          int i=jt.getSelectedRow();
        String notes_id=(String)jt.getValueAt(i, 0);
        
        String ans=client.delete_notes(notes_id);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        view_notes vn=new view_notes();
    }//GEN-LAST:event_deletebtActionPerformed
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
   public void fill_combo_semester(int n)
    {
//         String ans=client.fill_combo_semester(n);
//         
//         semestercb.addItem(ans);
//         semestercb.setSelectedIndex(1);
    }
//    private void coursecbItemStateChanged(java.awt.event.ItemEvent evt) {                                          
//        System.out.println("hello");
//        if(evt.getStateChange()==evt.SELECTED)
//        {
//           String select=(String)coursecb.getSelectedItem();
//           System.out.println(select);
//         int fetch=Integer.parseInt(select.charAt(0)+"");
//            System.out.println(fetch);
//            fill_combo_semester(fetch);
//
//        }
//    }  
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
            java.util.logging.Logger.getLogger(view_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_notes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_notes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vviewbt;
    private javax.swing.JComboBox<String> coursecb;
    private javax.swing.JButton deletebt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> semestercb;
    // End of variables declaration//GEN-END:variables
}
