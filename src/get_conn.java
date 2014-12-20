import java.sql.Connection;
import java.sql.DriverManager;
public class get_conn {
	public void closeConnection(Connection conn){
		if(conn!=null)
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/project",
					"root","1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
}
