
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class view_faculty extends javax.swing.JFrame {

    ArrayList<faculty_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public view_faculty() {
        initComponents();
        fill_combo();
        al = new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
      
        tm = new MyTableModel();
        jt = new JTable();
        jsp = new JScrollPane(jt);
       
        jsp.setBounds(10, 100, 900, 400);
        add(jsp);
        jt.setModel(tm);
        setVisible(true);
        setSize(950,600);
    }
    public void fill_arraylist() {
        al.clear();
        String fetch = client.fetch_faculty_data();
        
        StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String address = "";
            String qualification = "";
            String department = "";
            String email = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            address=st1.nextToken();
            qualification=st1.nextToken();
            department=st1.nextToken();
            email=st1.nextToken();
            photo=st1.nextToken();
            al.add(new faculty_data(name, fathers_name, mobile_no, address, qualification, department, email, photo));
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
                
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
     public class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();

        }

        @Override
        public int getColumnCount() {
            return 8;
        }

        @Override
        public String getColumnName(int i) {
            String col[] = {"NAME", "FATHER'S NAME", "MOBILE NO.", "ADDRESS", "QUALIFICATION","DEPARTMENT","EMAIL","PHOTO"};
            return col[i];
        }

        @Override
        public Object getValueAt(int i, int j) {

            //System.out.println(i);
            faculty_data fd = al.get(i);

            if(j==0)
            {
                return fd.name;
            }
            else if(j==1)
            {
                return fd.fathers_name;
            }
            else if(j==2)
            {
                return fd.mobile_no;
            }
            else if(j==3)
            {
                return fd.address;
            }
            else if(j==4)
            {
                return fd.qualification;
            }
            else if(j==5)
            {
                return fd.department;
            }
            else if(j==6)
            {
                return fd.email;
            }
            else
            {
                return fd.photo;
            }
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deletebt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        departmentcb = new javax.swing.JComboBox<>();
        viewbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW FACULTY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(8, 6, 940, 40);

        deletebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletebt.setText("DELETE");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt);
        deletebt.setBounds(360, 513, 110, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("CHOOSE DEPARTMENT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 210, 30);

        departmentcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department Name" }));
        getContentPane().add(departmentcb);
        departmentcb.setBounds(250, 62, 180, 30);

        viewbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        viewbt.setText("VIEW");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });
        getContentPane().add(viewbt);
        viewbt.setBounds(510, 60, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
         int i=jt.getSelectedRow();
        String email=(String)jt.getValueAt(i, 6);
        
        String ans=client.delete_faculty(email);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        view_faculty mc=new view_faculty();
    }//GEN-LAST:event_deletebtActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
        String department1=(String)departmentcb.getSelectedItem();
        String fetch=client.fetch_selected_faculty(department1);
        al.clear();
         StringTokenizer st = new StringTokenizer(fetch, ";");

        int n = st.countTokens();
        
            String name = "";
            String fathers_name = "";
            String mobile_no = "";
            String address = "";
            String qualification = "";
            String department = "";
            String email = "";
            String photo = "";
        for (int i = 1; i <= n; i++) 
        {
            String ans1 = st.nextToken();
            
            StringTokenizer st1 = new StringTokenizer(ans1, ",");
           
            name=st1.nextToken();
            fathers_name=st1.nextToken();
            mobile_no=st1.nextToken();
            address=st1.nextToken();
            qualification=st1.nextToken();
            department=st1.nextToken();
            email=st1.nextToken();
            photo=st1.nextToken();
            al.add(new faculty_data(name, fathers_name, mobile_no, address, qualification, department, email, photo));
        }
        tm.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(view_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_faculty().setVisible(true);
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
