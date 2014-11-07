import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_priz {
	private String name;
	private String type;
	private String level;
	private String time;
	private String person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
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
	public String update_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update priz set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update priz set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
			String sql3="update priz set level="+"'"+level+"'"+ "where name="+"'"+name+"'";
			String sql4="update priz set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql5="update priz set person="+"'"+person+"'"+ "where name="+"'"+name+"'";
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
