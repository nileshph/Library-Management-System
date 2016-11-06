/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FineReport extends javax.swing.JFrame {
       public static double FineAmt; 
       public static int btFlag = 0;
    /**
     * Creates new form FineReport
     */
    public FineReport() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fines and overdue book report");

        jLabel2.setText("Card Id");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan Id", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan Id", "ISBN", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Pay Fines");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Result: ");

        jLabel4.setText("Unpaid Fine: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel1))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String response = "";
        clearTableData(jTable1);
        clearTableData(jTable2);
        btFlag = 1;
        FineAmt = 0;
        if(jTextField1.getText().trim().length()>0)
        {   
            
            MySqlConn connection = null;
            try {
               // System.out.println("before call");
                connection = new MySqlConn();
                Statement st = connection.conn.createStatement();
                ArrayList<ArrayList<String>> fineData = new ArrayList<>();
                ArrayList<ArrayList<String>> bookData = new ArrayList<>();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                //check fines
                String query = "select f.loan_id,f.fine_amt,f.paid from fines f,book_loans ba where "
                        + "ba.card_id = " + jTextField1.getText().trim() + " and ba.date_in is not null and f.loan_id ="
                        + "ba.loan_id";
                //System.out.println(query);
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                   ArrayList<String> tempData = new ArrayList<>();
                   tempData.add(rs.getString(1));
                   tempData.add(rs.getString(2));
                   if (rs.getString(3).equals("No"))
                   {
                       FineAmt = FineAmt + Double.parseDouble(rs.getString(2));
                       tempData.add("Unpaid");
                   }
                   else
                       tempData.add("Paid");
                   fineData.add(tempData);
                }
                
                java.util.Date sysDate = getSysDate();
                //check due books
                query = "select ba.loan_id,ba.isbn,ba.due_date from book_loans ba where "
                        + "ba.card_id = " + jTextField1.getText().trim() + " and ba.date_in is null and "
                        + "ba.due_date < '" + formatter.format(sysDate) + "';";
                //System.out.println(query);
                
                rs = st.executeQuery(query);
                while(rs.next())
                {
                   ArrayList<String> tempData = new ArrayList<>();
                   tempData.add(rs.getString(1));
                   tempData.add(rs.getString(2));
                   tempData.add(formatter.format(rs.getDate(3)));
                   bookData.add(tempData);
                   }
                
               // System.out.println(fineData);
                //System.out.println(bookData);
                
                for (int i = 0; i < fineData.size(); i++) {
                   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                   
                   model.addRow(new Object[]{fineData.get(i).get(0),fineData.get(i).get(1),
                   fineData.get(i).get(2)});                   
                }
                
                    for (int i = 0; i < bookData.size(); i++) {
                   DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                   
                   model.addRow(new Object[]{bookData.get(i).get(0),bookData.get(i).get(1),
                   bookData.get(i).get(2)});                   
                }
                
            }
            catch (Exception e)
            {
                e.printStackTrace();
                
            }
             finally
            {
              //close DB connection  
              connection.closeCon();    
            }
        }
        else
            response = response + " Enter the card id.";
        jLabel3.setText("Result:" + response);   
        jLabel4.setText("Unpaid Fine: $" + FineAmt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String response = "";
        
        if(btFlag == 1)
        {
            if(FineAmt>0){
        if(jTextField1.getText().trim().length()>0 )
        {   
            MySqlConn connection = null;
            try {
               // System.out.println("before call");
                connection = new MySqlConn();
                Statement st = connection.conn.createStatement();
                String query = "update fines f set f.paid = 'Yes' where f.paid = 'No' and "
                        + "f.loan_id in (select ba.loan_id from book_loans ba where "
                        + "ba.card_id = " + jTextField1.getText().trim() + " and ba.date_in is not null)";
                st.executeUpdate(query);
                response = response + " Fines of $ " + FineAmt + " paid. ";
                btFlag = 0;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         else
        response = response + " Please enter card id.";
        }
            else 
                response = response + " unpaid fine not found.";
            
       
        }
        else
            response = response + " Please generate report again.";
        jLabel3.setText("Result:" + response);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private java.util.Date getSysDate() {
      Calendar cal = Calendar.getInstance();
        cal.setTime(new java.util.Date());
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        return cal.getTime();
    }

    private void clearTableData(JTable jTable1) {
        while(jTable1.getRowCount() > 0)
        {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
    }
}