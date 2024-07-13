import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
		
		// so above is the database url 
		
		String username = "root";
		String password = "Gagan@1211";
		
		
		try(Connection connection = DriverManager.getConnection(url , username , password)){
			
			System.out.println("connected to the database sucessfully !!!!");
			System.out.println(connection);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed " + e.getMessage());
			e.printStackTrace();
		}
		

	}

}
