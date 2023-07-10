package ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	Connection con = null;
	public Connection establishConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/INVENTRY","Selvakumar","Sp___2908");
		return con;
	}
	public void closeConnection()throws SQLException
	{
		con.close();
	}

}



