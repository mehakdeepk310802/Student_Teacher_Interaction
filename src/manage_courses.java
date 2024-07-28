
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.JComboBox.*;
public class manage_courses extends javax.swing.JFrame {

    ArrayList<course_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;

    public manage_courses() {

        initComponents();
        fill_combo();
        al = new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(460, 162, 550, 380);
        add(jsp);
        jt.setModel(tm);

        setSize(1100, 700);
        setVisible(true);
    }

    public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_all_courses();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        int id = 0;
            String department_name = "";
            String description = "";
            String course_name = "";
            String semester = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            int m = st1.countTokens();
            
            
            id = Integer.parseInt(st1.nextToken());
                
            course_name = st1.nextToken();
                
            department_name = st1.nextToken();
                
            semester = st1.nextToken();
                
            description = st1.nextToken();
            al.add(new course_data(id, course_name, department_name, semester, description));
        }

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
                departmentcb1.addItem(store);
                
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deletebt = new javax.swing.JButton();
        viewbt = new javax.swing.JButton();
        addbt = new javax.swing.JButton();
        departmentcb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionta = new javax.swing.JTextArea();
        semestertf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        departmentcb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE COURSES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 12, 920, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIEW COURSE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 60, 330, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD COURSE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 70, 330, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 310, 100, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 90, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Department");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 120, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Semester");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 90, 30);

        deletebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletebt.setText("DELETE");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt);
        deletebt.setBounds(670, 550, 150, 40);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("VIEW");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(800, 110, 100, 32);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("ADD");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(170, 490, 130, 40);

        departmentcb.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        departmentcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department"}));
        getContentPane().add(departmentcb);
        departmentcb.setBounds(140, 190, 210, 30);

        descriptionta.setColumns(20);
        descriptionta.setRows(5);
        jScrollPane1.setViewportView(descriptionta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 320, 220, 140);
        getContentPane().add(semestertf);
        semestertf.setBounds(140, 250, 210, 30);
        getContentPane().add(nametf);
        nametf.setBounds(140, 140, 210, 30);

        departmentcb1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        departmentcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department"}));
        getContentPane().add(departmentcb1);
        departmentcb1.setBounds(600, 110, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
        String department_name = (String) departmentcb.getSelectedItem();
        String course_name = nametf.getText();
        String semester = semestertf.getText();
        String description = descriptionta.getText();

        if (department_name.isEmpty() || description.isEmpty() || semester.isEmpty() || course_name.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        } else {
            String result = client.add_course(course_name, department_name, semester, description);
            if (result.trim().equals("exists")) {
                JOptionPane.showMessageDialog(rootPane, "Already Exist");
            } else if (result.trim().equals("success")) {

                JOptionPane.showMessageDialog(rootPane, "Success");
                dispose();
                manage_courses mc = new manage_courses();

            } else {
                JOptionPane.showMessageDialog(rootPane, result);
            }
            nametf.setText("");
            descriptionta.setText("");
            semestertf.setText("");
            nametf.requestFocus();
    }//GEN-LAST:event_addbtActionPerformed
 }
    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
       
        String department_name1=(String)departmentcb1.getSelectedItem();
        String fetch=client.fetch_selected_courses(department_name1);
        al.clear();
         StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        int id = 0;
            String department_name = "";
            String description = "";
            String course_name = "";
            String semester = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            int m = st1.countTokens();
            
            
            id = Integer.parseInt(st1.nextToken());
                
            course_name = st1.nextToken();
                
            department_name = st1.nextToken();
                
            semester = st1.nextToken();
                
            description = st1.nextToken();
            al.add(new course_data(id, course_name, department_name, semester, description));
        }
        
        tm.fireTableDataChanged();
        
    }//GEN-LAST:event_viewbtActionPerformed

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
         int i=jt.getSelectedRow();
        int id=(int)jt.getValueAt(i, 0);
        String ans=client.delete_course(id);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        manage_courses mc=new manage_courses();
    }//GEN-LAST:event_deletebtActionPerformed
    

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
            java.util.logging.Logger.getLogger(manage_courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_courses().setVisible(true);
            }
        });
    }

    public class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();

        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public String getColumnName(int i) {
            String col[] = {"ID", "COURSE", "DEPARTMENT", "SEMESTER", "DESCRIPTION"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

            //System.out.println(i);
            course_data cd = al.get(i);

            if (j == 0) {
                return cd.id;
            } else if (j == 1) {
                return cd.course_name;
            } else if (j == 2) {
                return cd.department_name;
            } else if (j == 3) {
                return cd.semester;
            } else {
                return cd.description;
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JButton deletebt;
    private javax.swing.JComboBox<String> departmentcb;
    private javax.swing.JComboBox<String> departmentcb1;
    private javax.swing.JTextArea descriptionta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField semestertf;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables
}
