package jdbc;
//3 type - statement ,prepared statement , callable statement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class _3Preparedstatement {

	public static void main(String[] args) throws Exception{
		Class.forName("org.sqlite.JDBC");//to use the driver
		Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
		PreparedStatement stm =con.prepareStatement("select * from student where deptno=?");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter deptno");
		int dno=sc.nextInt();
		
		stm.setInt(1, dno);
		
		ResultSet rs=stm.executeQuery();
		
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
