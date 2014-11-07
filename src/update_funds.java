import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_funds {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private String contract;
	private String already;
	private String non;
	private String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
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
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getAlready() {
		return already;
	}
	public void setAlready(String already) {
		this.already = already;
	}
	public String getNon() {
		return non;
	}
	public void setNon(String non) {
		this.non = non;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String update_funds(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update funds set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update funds set source="+"'"+source+"'"+ "where name="+"'"+name+"'";
			String sql3="update funds set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'";
			String sql4="update funds set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql5="update funds set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql6="update funds set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'";
			String sql7="update funds set already="+"'"+already+"'"+ "where name="+"'"+name+"'";
			String sql8="update funds set non="+"'"+non+"'"+ "where name="+"'"+name+"'";
			String sql9="update funds set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
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
			System.out.println(sql6);
			stmt.execute(sql6);
			System.out.println(sql7);
			stmt.execute(sql7);
			System.out.println(sql8);
			stmt.execute(sql8);
			System.out.println(sql9);
			stmt.execute(sql9);
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
