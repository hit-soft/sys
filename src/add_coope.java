import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class add_coope {
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
	public String add_coope(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=�ݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲ�cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into coope(type,out_pe,in_pe,start,end,out_pl,in_pl,goal,name) " +
					"values("+"'"+type+"'"+","+"'"+out_pe+"'"+","+"'"+in_pe+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+out_pl+"'"+","+"'"+in_pl+"'"+","+"'"+goal+"'"+","+"'"+name+"'"+")";
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