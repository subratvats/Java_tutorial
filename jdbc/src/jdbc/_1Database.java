package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//set classpath=C:\Users\subra\Desktop\JAVA\sqlite-jdbc-3.34.0.jar;
//use driver
//establish connection
//create satement
//execute qwerry
//get resultset
public class _1Database {

	public static void main(String[] args) throws Exception {
			
		Class.forName("org.sqlite.JDBC");//to use the driver
		Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");//to establish connection
		Statement stm =con.createStatement();//to create satement
		ResultSet rs=stm.executeQuery("select * from dept");
		int dno;
		String dname;
		while (rs.next()) {
			dno=rs.getInt("deptno");
			dname=rs.getString("dname");
			System.out.println(dno+" "+dname);
		}
		
		//DDL data definition language for creating and droping the table
//		for ddl and dml use executeUpdate
		
//		stm.executeUpdate("create table Temp(a integer,b float)");
//		stm.executeUpdate("drop table Temp");
		
		stm.close();
		con.close();
	}

}
