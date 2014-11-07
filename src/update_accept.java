import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_accept {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private String contract;
	private String type;
	private String time;
	private String org;
	private String number;
	private String card;
	private String remark;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String update_accept(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update accept set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update accept set source="+"'"+source+"'"+ "where name="+"'"+name+"'";
			String sql3="update accept set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'";
			String sql4="update accept set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql5="update accept set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql6="update accept set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'";
			String sql7="update accept set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
			String sql8="update accept set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql9="update accept set org="+"'"+org+"'"+ "where name="+"'"+name+"'";
			String sql10="update accept set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql11="update accept set card="+"'"+card+"'"+ "where name="+"'"+name+"'";
			String sql12="update accept set remark="+"'"+remark+"'"+ "where name="+"'"+name+"'";
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
			stmt.execute(sql10);
			stmt.execute(sql11);
			stmt.execute(sql12);	
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
