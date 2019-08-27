import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StartJDBC {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SUKHDEV","admin");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from supplier");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+ " : ");
				System.out.println(rs.getString(2));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
