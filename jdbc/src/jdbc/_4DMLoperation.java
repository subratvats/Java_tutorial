package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class _4DMLoperation {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");//to use the driver
		Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
		
		Statement stm =con.createStatement();
		
//		stm.executeUpdate("insert into dept values(70,'Bio')");
//		stm.executeUpdate("delete from dept where deptno>=60");
//		stm.executeUpdate("update dept set dname='Chem' where deptno=50");
		

		PreparedStatement pstm =con.prepareStatement("insert into student values(?,?,?,?)");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter student data");
		int r =sc.nextInt();
		String name=sc.next();
		String city=sc.next();
		int dno=sc.nextInt();
		
		pstm.setInt(1, r);
		pstm.setString(2, name);
		pstm.setString(3, city);
		pstm.setInt(4, dno);
		
		pstm.executeUpdate();
		
		stm.close();
		pstm.close();
		con.close();
		
	}

}
