package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
	
	private static Connection connection=null;
	
	public ConnectionBd(){
		try {
			Class.forName ("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/hackathon_berexia";
		try{
		 connection = DriverManager.getConnection(url, "root", "");
		System.out.println(getClass().getName() + ": connecté");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return connection;
	}
}
