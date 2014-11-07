import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class add_funds {
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
	
	
	public String add_funds(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=�ݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲ�cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into funds(name,source,leader,start,end,contract,already,non,number) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+leader+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+","+"'"+already+"'"+","+"'"+non+"'"+","+"'"+number+"'"+")";
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