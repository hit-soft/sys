import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_coope {
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String del_coope(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from coope where";
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
				System.out.println(sql);
				stmt.execute(sql);
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