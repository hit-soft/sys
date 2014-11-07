import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_coope {
	public String type;
	public String out_pe;
	public String in_pe;
	public String num;
	public String start;
	public String end;
	public String out_pl;
	public String in_pl;
	public String goal;
	public String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOut_pe() {
		return out_pe;
	}
	public void setOut_pe(String out_pe) {
		this.out_pe = out_pe;
	}
	public String getIn_pe() {
		return in_pe;
	}
	public void setIn_pe(String in_pe) {
		this.in_pe = in_pe;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
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
	public String getOut_pl() {
		return out_pl;
	}
	public void setOut_pl(String out_pl) {
		this.out_pl = out_pl;
	}
	public String getIn_pl() {
		return in_pl;
	}
	public void setIn_pl(String in_pl) {
		this.in_pl = in_pl;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String update_coope(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update coope set type="+"'"+type+"'"+ "where type="+"'"+type+"'";
			String sql2="update coope set out_pe="+"'"+out_pe+"'"+ "where type="+"'"+type+"'";
			String sql3="update coope set in_pe="+"'"+in_pe+"'"+ "where type="+"'"+type+"'";
			String sql4="update coope set num="+"'"+num+"'"+ "where type="+"'"+type+"'";
			String sql5="update coope set start="+"'"+start+"'"+ "where type="+"'"+type+"'";
			String sql6="update coope set end="+"'"+end+"'"+ "where type="+"'"+type+"'";
			String sql7="update coope set out_pl="+"'"+out_pl+"'"+ "where type="+"'"+type+"'";
			String sql8="update coope set in_pl="+"'"+in_pl+"'"+ "where type="+"'"+type+"'";
			String sql9="update coope set goal="+"'"+goal+"'"+ "where name="+"'"+type+"'";
			String sql10="update coope set name="+"'"+name+"'"+ "where type="+"'"+type+"'";
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
			System.out.println(sql10);
			stmt.execute(sql10);
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
