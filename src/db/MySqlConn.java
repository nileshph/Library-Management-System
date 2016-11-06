package db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConn {

	Connection conn = null;
	
	
	public MySqlConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/library","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 			
	}
        
        public void closeCon()
        {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
