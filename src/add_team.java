import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class add_team {
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
	public String add_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=�ݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲ�cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into team(name,post,start,end,person) " +
					"values("+"'"+name+"'"+","+"'"+post+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			return "1";
			}
			catch(SQLException e){
				e.printStackTrace();
				return "0";
			}
		finally{
			util.closeConnection(conn);
		}
	}
}
