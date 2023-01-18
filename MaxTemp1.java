package cst;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MaxTemp1{
	 static Connection conn = null;
	 static Statement stmt = null;
	static String url = "jdbc:mysql://localhost/shankariDB";
    static String user = "root";
    static String password = "sai";
	public static void db_conn()
	{
    	try { 
            
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connected");
            }
 
            
        } catch (SQLException ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
			
	}
	public static void fin_dmax()

	{
		try {
			String sql = "SELECT max(temprature) from ytwo group by ytwo;";

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			stmt.execute(sql);
			ResultSet rs = stmt.getResultSet();

			if (rs.next()) {

				int userid = rs.getInt(1);
				System.out.println("Maximum temperature for the year 1990 and 1992 is " + userid);
				

			}

			
		} catch (SQLException e) {
	
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db_conn();
		long startTime = System.currentTimeMillis();
		fin_dmax();
		long endTime = System.currentTimeMillis();

		long duration = (endTime - startTime);
		System.out.println("real Time:"+duration);
		
		
	}

}

}