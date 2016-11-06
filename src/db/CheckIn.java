/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.joda.time.*;
/**
 *
 * @author nileshpharate
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        
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

        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Book Checkin Interface");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Result:");

        jLabel1.setText("Card Id");

        jLabel2.setText("ISBN");

        jLabel5.setText("Search for book to be checked in");

        jLabel6.setText("Check in book");

        jLabel7.setText("Result:");

        jLabel8.setText("Loan Id");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loan_Id", "Card_Id", "ISBN", "Date Out", "Due Date", "Date In"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addComponent(jButton1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String response = "";
        clearTableData(jTable1);
        if (jTextField1.getText().trim().length() > 0 || 
            jTextField2.getText().trim().length() > 0) {
            MySqlConn connection = null;
            try {
                // System.out.println("before call");
                connection = new MySqlConn();
                Statement st = connection.conn.createStatement();
                
                String query = "";
                if (jTextField1.getText().trim().length() > 0 && 
                 jTextField2.getText().trim().length() > 0)
                 {
                    //check with CardId and ISBN 
                 query = "select ba.loan_id,ba.card_id,ba.isbn,ba.date_out,ba.due_date,ba.date_in from book_loans ba where "
                        + "ba.isbn = " + jTextField2.getText().trim()
                        + " and ba.card_id = " + jTextField1.getText().trim() + ";";  
                 }
                else
                    if(jTextField1.getText().trim().length() > 0)
                        query = "select ba.loan_id,ba.card_id,ba.isbn,ba.date_out,ba.due_date,ba.date_in from book_loans ba where "
                        + "ba.card_id = " + jTextField1.getText().trim() + ";"; 
                else
                    if(jTextField2.getText().trim().length() > 0)
                     query = "select ba.loan_id,ba.card_id,ba.isbn,ba.date_out,ba.due_date,ba.date_in from book_loans ba where "
                        + "ba.isbn = " + jTextField2.getText().trim() + ";";
                
                //System.out.println(query);
                
                ResultSet rs = st.executeQuery(query);
                int rowCnt = 0;
                java.util.Date sysDate = getSysDate();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                
                while (rs.next()) rowCnt++;
                //System.out.println(rowCnt);
                
                rs.beforeFirst();
                if (rowCnt > 0) {
                    
                    ArrayList<ArrayList<String>> dataHolder = new ArrayList<>();
                    while (rs.next())
                    {
                        //System.out.println("data creation");
                        ArrayList<String> lineData = new ArrayList<>();
                        lineData.add(rs.getString(1));
                        lineData.add(rs.getString(2));
                        lineData.add(rs.getString(3));
                        
                        lineData.add(formatter.format(rs.getDate(4)));
                        lineData.add(formatter.format(rs.getDate(5)));
                        java.util.Date tDate = new java.util.Date();
                        tDate = rs.getDate(6);
                        if(tDate != null)
                        lineData.add(formatter.format(tDate));
                        else
                            lineData.add("NA");
                        dataHolder.add(lineData);
                        
                        
                    }   
                    
                    for (int i = 0; i < dataHolder.size(); i++) {
                        
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(new Object[]{dataHolder.get(i).get(0),dataHolder.get(i).get(1),
                                      dataHolder.get(i).get(2),dataHolder.get(i).get(3),dataHolder.get(i).get(4),dataHolder.get(i).get(5)});
                    }
                 
                } else {
                    response = response + " No record found";
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
             finally
            {
              //close DB connection  
              connection.closeCon();    
            }
        } else {
            if (jTextField1.getText().trim().length() <= 0) {
                response = response + "Enter Card Id";
            }

            if (jTextField2.getText().trim().length() <= 0) {
                response = response + "Enter ISBN";
            }
        }

        jLabel3.setText("Result:" + response);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String response = "";
        if (jTextField3.getText().trim().length() > 0) {
            MySqlConn connection = null;
            try {
                // System.out.println("before call");
                connection = new MySqlConn();
                Statement st = connection.conn.createStatement();
                
                String query = "";
                query = "select ba.loan_id,ba.card_id,ba.isbn,ba.date_out,ba.due_date,ba.date_in from book_loans ba where "
                        + "ba.loan_id = " + jTextField3.getText().trim() + " and ba.date_in is null;"; 
                
                //System.out.println(query);
                ResultSet rs = st.executeQuery(query);
                int rowCnt =0;                
                while (rs.next()) rowCnt++;
                
                if(rowCnt>0)
                {
                   //check for fine
                   
                   java.util.Date sysDate = new java.util.Date();
                   sysDate = getSysDate();
                   
                   if(rs.getDate(5).compareTo(sysDate) < 0)
                   {
                       //insert fine
                       int dueDays = 0;
                       dueDays = getDateDiff(rs.getDate(5),sysDate);
                       
                       double fineAmt = dueDays * 0.25;
                       query = "insert into fines (loan_id,fine_amt) values (" + jTextField3.getText().trim() + "," + fineAmt + ");"; 
                
                //System.out.println(query);
                st.executeUpdate(query);
                response = " Fine created of $" + fineAmt;
                       
                   }
                   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                   //update book_loan date_in with sysDate
                   query = "update book_loans ba set ba.date_in ='" +  formatter.format(sysDate) + "'"
                        + " where ba.loan_id = " + jTextField3.getText().trim(); 
                
                //System.out.println(query);
                st.executeUpdate(query);
                response = response + " Check In Done";
                   
                }
                else
                    response = response + "Due book not found";
            }
            
            catch (Exception e)
            {
                e.printStackTrace();
                
            }
        }
        else
            response = response + " Please enter Loan Id";
       jLabel7.setText("Result:" + response); 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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

    private int getDateDiff(Date date, java.util.Date sysDate) {
       
        return (Days.daysBetween(new DateTime(date), new DateTime(sysDate)).getDays());
    }
}