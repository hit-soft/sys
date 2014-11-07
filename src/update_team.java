import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class update_team {
	private String name;
	private String post;
	private String start;
	private String end;
	private String person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String upp_team(){
		return "1";
	}
	public String update_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update team set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update team set post="+"'"+post+"'"+ "where name="+"'"+name+"'";
			String sql3="update team set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql4="update team set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql5="update team set person="+"'"+person+"'"+ "where name="+"'"+name+"'";
			System.out.println(sql1);
			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
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
