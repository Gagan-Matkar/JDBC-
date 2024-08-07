import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/mydatabase";

		// so above is the database url

		String username = "root";
		String password = "Gagan@1211";
		try {
			// this is the statement to load the jdbc driver classes to make the connection

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully !!!");

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		try {
			// here the connection is the interface and the connection is the instance it
			// which store the connection with the database and the driver manager class has
			// the method of get connection which has the following three arguments

			Connection connection = DriverManager.getConnection(url, username, password);
			// System.out.println("connected to the database sucessfully !!!!");

			// here it gives the connection id
			// System.out.println(connection);

			// so for executing the queries we need to pass the statement from the and get
			// the data form the database so here we have the statement interface and stmt
			// is the interface of it . it is used to store the statement that is form the
			// and the createstatement() is used to Creates a Statement object for
			// sendingSQL statements to the database. it has no parameters or arguments and
			// to execute the query we need the method executequery()to execute the query
			// the query is the parameter in the method
			// after executing the queries we need to store them so for that we make use of
			// the Resultset interface to store the result or output of the queries

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee;");

			// so for getting the output printed from the resultset  we need to use the while loop with
			// next() method so that it will print the all the values in the table till its true so it will run the loop till all the values are printed
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				double salary = rs.getDouble("salary");
				
				System.out.println("----------------------------------------------------------------------");
				
				
				System.out.println("ID : "+ id + " NAME : " + name + " JOB TITLE :"+ job_title+ " SALARY :" + salary);

				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block

			System.out.println("Connection failed " + e.getMessage());
			e.printStackTrace();
		}

	}

}
