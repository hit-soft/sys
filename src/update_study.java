import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class update_study {
	private String org;
	private String substance;
	private String start;
	private String end;
	private String person;
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
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
	public String update_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update study set org="+"'"+org+"'"+ "where org="+"'"+org+"'";
			String sql2="update study set substance="+"'"+substance+"'"+ "where org="+"'"+org+"'";
			String sql3="update study set start="+"'"+start+"'"+ "where org="+"'"+org+"'";
			String sql4="update study set end="+"'"+end+"'"+ "where org="+"'"+org+"'";
			String sql5="update study set person="+"'"+person+"'"+ "where org="+"'"+org+"'";
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
