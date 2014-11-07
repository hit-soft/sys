import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_publ {
	private String name;
	private String press;
	private String time;
	private String person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String update_publ(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update publ set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update publ set press="+"'"+press+"'"+ "where name="+"'"+name+"'";
			String sql3="update publ set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql4="update publ set person="+"'"+person+"'"+ "where name="+"'"+name+"'";
			System.out.println(sql1);
			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
}
