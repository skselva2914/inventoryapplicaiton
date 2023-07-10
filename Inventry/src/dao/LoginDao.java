package dao;
import model.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import  java.sql.SQLException;
import ConnectionManager.ConnectionClass;

public class LoginDao {
public boolean validate(Login login) throws  ClassNotFoundException,SQLException
{
String username=login.getUSERNAME();
String password=login.getPASSWORD();

ConnectionClass conn=new ConnectionClass();
Connection con=conn.establishConnection();

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM LOGIN");

while(rs.next())
{
if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD")))
{

conn.closeConnection();
return true;

}
}
conn.closeConnection();
return false;



}

}

