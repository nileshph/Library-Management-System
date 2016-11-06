/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nileshpharate
 */
public class CheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Card Id");

        jLabel2.setText("ISBN");

        jLabel3.setText("Result:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Book Checkout Interface");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String response = "";
        if(jTextField2.getText().length()>0 &&jTextField2.getText().length()>0)
        {   
            MySqlConn connection = null;
            try {
               // System.out.println("before call");
                connection = new MySqlConn();
                Statement st = connection.conn.createStatement();
                
                //search with ISBN and Title
                String query = "select b.isbn,b.quantity from book b where "
                        + "b.isbn = " + jTextField2.getText()  + 
                        " and b.activeind = 1;" ;
                
                ResultSet rs = st.executeQuery(query);
                int rowCnt = 0;  
                int quantity =0;
                String isbn = "";
                java.util.Date sysDate = getSysDate();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                while (rs.next())
                {   
                    isbn = rs.getString(1);
                    quantity = rs.getInt(2);
                    rowCnt ++;
                }
                if(rowCnt > 0)
                {
                    query = "select b.card_Id from borrower b where "
                        + "b.card_id = " + jTextField1.getText();
                //System.out.println(query);    
                rs = st.executeQuery(query);
                
                rowCnt = 0;       
                while (rs.next())
                    rowCnt ++;
                //borrower available with card_id
                if(rowCnt > 0)
                {
                    if (quantity > 0) 
                    {
                      //check for borrower
                        
                        query = "select * from book_loans b where "
                        + "b.card_id = " + jTextField1.getText() + " and b.date_in is null";
                       //System.out.println(query);    
                       rs = st.executeQuery(query);
                       int dueCnt =0, defCnt =0;
                       while(rs.next() && dueCnt <= 3 && defCnt ==0)
                       {
                          if(rs.getDate(5).compareTo(sysDate) < 0)   
                          {
                             defCnt++; 
                          }
                          
                          dueCnt++;
                          
                       }
                       
                       if (defCnt > 0) response = response + " Please check in due books";
                       if (dueCnt >= 3) response =  response + " More than 3 books already issues";
                       
                       if(defCnt ==0 && dueCnt < 3)
                       {
                           //allow check out
                           //update book quantity
                           //add book loan record
                                                      
                           query = "update book set quantity = " + (quantity - 1) 
                            + " where isbn = '" + isbn + "'";
                           
                       // System.out.println(query);    
                        st.executeUpdate(query);
                        
                        java.util.Date dueDate = addDays(new java.util.Date(),14);
                        String outDate = "'" + formatter.format(sysDate) + "'";
                        String dDate = "'" + formatter.format(dueDate) + "'";
                                            
                        //dueDate = sysDate.setTime(sysDate.getTime() + 14 * 1000 * 60 * 60 * 24);
                        
                        query = "insert into book_loans (isbn,card_id,date_out,due_date) values ('"
                                 + isbn +"'," + jTextField1.getText() + "," + outDate +"," + dDate + ")";
                           
                        //System.out.println(query);    
                        st.executeUpdate(query);
                        
                        response = response + " check out successful";
                           
                       }     
                    }
                    else
                        response = response + "Book is not available now";
                }
                else
                    response = response + " Invalid Card Id entered";
                    
                //
                }
                else
                    response = response + " Invalid ISBN entered";
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
             finally
            {
              //close DB connection  
              connection.closeCon();    
            }
        }
        else
        {
            if (jTextField1.getText().length()<=0)
            response = response + "Enter Card Id "; 
            
            if (jTextField2.getText().length()<=0)
            response = response + "Enter ISBN";
        }
        
        jLabel3.setText("Result:" + response);
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
       // System.out.println("window closed");
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private java.util.Date addDays(java.util.Date date, int i) {
        
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.add(cal.DAY_OF_MONTH, i);
        return cal.getTime();
    }

    private java.util.Date getSysDate() {
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new java.util.Date());
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        return cal.getTime();
    }
}
