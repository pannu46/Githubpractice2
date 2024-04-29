package miit;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDataFromDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:306/practise";
		String user = "root";
		String passwordd = "root";
		
		
		
		try {
			String querry = "select* from orders;"
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(querry);
			ResultSet =ps.executeQuerry();
			while (rs.nest()) {
				String first_name=rs.getString("first_name");
				String last_name=rs.getString("laast_name");
				int age=rs.getint("age");
				System.out.println("first_name");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMEssage());
		}
		finally {
			con.close();
		}

	}

}
