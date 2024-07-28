import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
public class department_manager extends javax.swing.JFrame 
{
    ArrayList<department_data> al;
    MyTableModel tm;
    JTable jt;
    JScrollPane jsp;
    public department_manager() {
        
        al=new ArrayList<>();
        fill_arraylist();
        System.out.println(al);
        tm=new MyTableModel();
        jt=new JTable();
        jsp=new JScrollPane(jt);
       
        initComponents();
        jsp.setBounds(470, 90, 390, 420);
        add(jsp);
        jt.setModel(tm);
        setSize(1000,800);
        setVisible(true);
    }
    public  void fill_arraylist()
    {
        String fetch=client.fetch_data();
       
        StringTokenizer st=new StringTokenizer(fetch,";");
        
        int n=st.countTokens();
        for(int i=1;i<=n;i++)
        {
            String ans=st.nextToken();
           
             StringTokenizer st1=new StringTokenizer(ans,",");
             int m=st1.countTokens();
             int id=0;
             String department_name="";
             String description="";
             for(int j=1;j<=m;j++)
             {
                 if(j==1)
                 {
                     id=Integer.parseInt(st1.nextToken());
                 }
                 else if(j==2)
                 {
                    department_name=st1.nextToken();
                 }
                 else if(j==3)
                 {
                     description=st1.nextToken();
                 }
                 
             }
              al.add(new department_data(id,department_name,description));
        }
       
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        descriptionlb = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        namelb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionta = new javax.swing.JTextArea();
        deletebt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 20, 310, 40);

        descriptionlb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        descriptionlb.setText("Description");
        getContentPane().add(descriptionlb);
        descriptionlb.setBounds(20, 180, 100, 40);

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });
        getContentPane().add(nametf);
        nametf.setBounds(150, 100, 230, 40);

        namelb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        namelb.setText("Name");
        getContentPane().add(namelb);
        namelb.setBounds(20, 100, 100, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 100, 40);

        descriptionta.setColumns(20);
        descriptionta.setRows(5);
        jScrollPane1.setViewportView(descriptionta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 190, 230, 160);

        deletebt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        deletebt.setText("DELETE");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt);
        deletebt.setBounds(520, 530, 230, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD DEPARTMENT ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 20, 310, 40);

        addbt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addbt.setText("ADD");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt);
        addbt.setBounds(155, 410, 230, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed
   
    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
        String department_name=nametf.getText();
        String description=descriptionta.getText();
       
        if(department_name.isEmpty()||description.isEmpty())
        {
         JOptionPane.showMessageDialog(rootPane, "All fileds are Mandatory");
        }
        else
        {
            String result=client.add_department(department_name, description);
            if(result.trim().equals("exists"))
            {
                JOptionPane.showMessageDialog(rootPane, "Already Exist");
            }
            else if(result.trim().equals("success"))
            {
                
                JOptionPane.showMessageDialog(rootPane, "Success");
                dispose();
                department_manager dt=new department_manager();
                
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, result);
            }
            nametf.setText("");
            descriptionta.setText("");
            nametf.requestFocus();
        }
    }//GEN-LAST:event_addbtActionPerformed

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
        int i=jt.getSelectedRow();
        int id=(int)jt.getValueAt(i, 0);
        String ans=client.delete(id);
        JOptionPane.showMessageDialog(rootPane, ans);
        dispose();
        department_manager dm=new department_manager();
        
        
    }//GEN-LAST:event_deletebtActionPerformed
     public class MyTableModel extends AbstractTableModel
     {

        @Override
        public int getRowCount() {
           return al.size();
           
        }

        @Override
        public int getColumnCount() {
           return 3;
        }
        @Override
        public String getColumnName(int i) {
           String col[]={"id","department","description"};
           return col[i];
        }
        @Override
        public Object getValueAt(int i, int j) 
        {   
           
            //System.out.println(i);
            department_data dt=al.get(i);
            
            if(j==0)
            {
                return dt.id;
            }
            else if(j==1)
            {
                return dt.department_name;
            }
            else
            {
                return dt.description;
            }
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
            java.util.logging.Logger.getLogger(department_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(department_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(department_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(department_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new department_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JButton deletebt;
    private javax.swing.JLabel descriptionlb;
    private javax.swing.JTextArea descriptionta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelb;
    private javax.swing.JTextField nametf;
    // End of variables declaration//GEN-END:variables
}
