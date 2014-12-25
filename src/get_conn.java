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
			return DriverManager.getConnection("w.rdc.sae.sina.com.cn:3307/app_wlhproject",
					"n1xxz2oj21","lx21m3h03zj5i51kjj4wlyix2xmzmjxx1xm50x2x");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
}
