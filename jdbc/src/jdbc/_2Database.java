package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _2Database {

	public static void main(String[] args) throws Exception{
		Class.forName("org.sqlite.JDBC");//to use the driver
		Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
		Statement stm =con.createStatement();
		ResultSet rs=stm.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.print(rs.getInt("rollno")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("city")+" ");
			System.out.println(rs.getInt(4)+" ");
		}
		stm.close();
		con.close();
		
	}

}
