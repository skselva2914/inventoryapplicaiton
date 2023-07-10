package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ConnectionManager.ConnectionClass;

public class Agent {
	public void AgentaddProduct(int id) throws SQLException, ClassNotFoundException {
			
		ConnectionClass conn=new ConnectionClass();
		Connection con=conn.establishConnection();
		
		PreparedStatement ps1=con.prepareStatement("SELECT * FROM PRODUCT WHERE PRODUCTID=?");
		ResultSet rs=ps1.executeQuery();
		int id1 = 0;
		String name=null;
		int minsell=0,price=0,quentity=0;
		if(rs.next()) {
			id1=rs.getInt("PRODUCTID");
			name=rs.getString("PRODUCTNAME");
			minsell=rs.getInt("MINSELL");
			price=rs.getInt("PRICE");
			quentity=rs.getInt("QUANTITY");
			
		}
		
		String query="insert into TRANSACTION(PRODUCTID,PRODUCTNAME,MINSELL,PRICE,QUANTITY)"+
				"values(?,?,?,?,?)";
	
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,id1);
		ps.setString(2, name);
		ps.setInt(3, minsell);
		ps.setInt(4,price);
		ps.setInt(5, quentity);
		
		ps.executeUpdate();
		conn.closeConnection();
		
	}

	public void displayAgent() throws ClassNotFoundException,SQLException{
	
		ConnectionClass conn=new ConnectionClass();
		Connection con=conn.establishConnection();
		
		String query="SELECT * FROM TRANSACTION ";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(rs.getInt("PRODUCTID")+"   "+rs.getInt("MINSELL")+"   "+rs.getString("PRODUCTNAME")+"   "+rs.getInt("PRICE")+"  "+rs.getInt("QUANTITY"));
			System.out.println("----------------------------------------------------------------------------------");
		}
		conn.closeConnection();
	}
}