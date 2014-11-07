import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_coope {
	private List<coope> l = new ArrayList();
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
	public List<coope> getL() {
		return l;
	}
	public void setL(List<coope> l) {
		this.l = l;
	}
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
	int flag=0;
	public String query_coope(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from coope where ";
		if(type!=null&&!type.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" type "+" like "+"'%"+type+"%'";
			flag=1;
		}
		if(out_pe!=null&&!out_pe.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" out_pe "+" like "+"'%"+out_pe+"%'";
			flag=1;
		}
		if(in_pe!=null&&!in_pe.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" in_pe "+" like "+"'%"+in_pe+"%'";
			flag=1;
		}
		if(num!=null&&!num.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" num "+" like "+"'%"+num+"%'";
			flag=1;
		}
		if(start!=null&&!start.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" start "+" like "+"'%"+start+"%'";
			flag=1;
		}
			
		if(end!=null&&!end.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" end "+" like "+"'%"+end+"%'";
			flag=1;
		}
	
		if(out_pl!=null&&!out_pl.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" out_pl "+" like "+"'%"+out_pl+"%'";
			flag=1;
		}
		if(in_pl!=null&&!in_pl.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" in_pl "+" like "+"'%"+in_pl+"%'";
			flag=1;
		}
		if(goal!=null&&!goal.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" goal "+" like "+"'%"+goal+"%'";
			flag=1;
		}
		if(name!=null&&!name.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" name "+" like "+"'%"+name+"%'";
			flag=1;
		}
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					coope use=new coope();
					use.setType(rs.getString(1));
					use.setOut_pe(rs.getString(2));
					use.setIn_pe(rs.getString(3));
					use.setNum(rs.getString(4));
					use.setStart(rs.getString(5));
					use.setEnd(rs.getString(6));
					use.setOut_pl(rs.getString(7));
					use.setIn_pl(rs.getString(8));
					use.setGoal(rs.getString(9));
					use.setName(rs.getString(10));
					fla=1;
					l.add(use);
		}
				if(fla==0){System.out.println("h1");
					return "0";}
				else{System.out.println("h2");
					return "1";}
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("h3");
			return "0";
		}finally{
			util.closeConnection(conn);
		}
		}
		else
			return "0";
	}
}