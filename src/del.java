import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class del {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private double contract;
	private String type;
	private String time;
	private String org;
	private double number;
	private String card;
	private String remark;
	public String out_pe;
	public String in_pe;
	public int num;
	public String out_pl;
	public String in_pl;
	public String goal;
	private double already;
	private double non;
	private String owner;
	private String person;
	private String level;
	private String press;
	private String substance;
	private String post;
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
	public double getContract() {
		return contract;
	}
	public void setContract(double contract) {
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
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public double getAlready() {
		return already;
	}
	public void setAlready(double already) {
		this.already = already;
	}
	public double getNon() {
		return non;
	}
	public void setNon(double non) {
		this.non = non;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String del_accept(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from accept where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(source!=null&&!source.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" source "+" like "+"'%"+source+"%'";
				flag=1;
			}
			if(leader!=null&&!leader.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" leader "+" like "+"'%"+leader+"%'";
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
		
			if(contract!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" contract "+" like "+"'%"+contract+"%'";
				flag=1;
			}
			if(type!=null&&!type.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" type "+" like "+"'%"+type+"%'";
				flag=1;
			}
			if(time!=null&&!time.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" time "+" like "+"'%"+time+"%'";
				flag=1;
			}
			if(org!=null&&!org.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" org "+" like "+"'%"+org+"%'";
				flag=1;
			}
			if(number!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" number "+" like "+"'%"+number+"%'";
				flag=1;
			}
			if(card!=null&&!card.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" card "+" like "+"'%"+card+"%'";
				flag=1;
			}
			if(remark!=null&&!remark.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" remark "+" like "+"'%"+remark+"%'";
				flag=1;
			}
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
			if(num!=0){
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
	public String del_funds(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from funds where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(source!=null&&!source.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" source "+" like "+"'%"+source+"%'";
				flag=1;
			}

			if(leader!=null&&!leader.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" leader "+" like "+"'%"+leader+"%'";
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
		
			if(contract!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" contract "+" like "+"'%"+contract+"%'";
				flag=1;
			}
			System.out.println(sql);
			if(already!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" already "+" like "+"'%"+already+"%'";
				flag=1;
			}
			System.out.println(sql);
			if(non!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" non "+" like "+"'%"+non+"%'";
				flag=1;
			}
			System.out.println(sql);
			if(number!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" number "+" like "+"'%"+number+"%'";
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
	public String del_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from patent where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(number!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" number "+" like "+"'%"+number+"%'";
				flag=1;
			}

			if(owner!=null&&!owner.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" owner "+" like "+"'%"+owner+"%'";
				flag=1;
			}
				
			if(org!=null&&!org.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" org "+" like "+"'%"+org+"%'";
				flag=1;
			}
				
			if(time!=null&&!time.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" time "+" like "+"'%"+time+"%'";
				flag=1;
			}
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
	public String del_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from priz where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(type!=null&&!type.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" type "+" like "+"'%"+type+"%'";
				flag=1;
			}

			if(level!=null&&!level.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" level "+" like "+"'%"+level+"%'";
				flag=1;
			}
				
			if(time!=null&&!time.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" time "+" like "+"'%"+time+"%'";
				flag=1;
			}
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
	public String del_publ(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from publ where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(press!=null&&!press.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" press "+" like "+"'%"+press+"%'";
				flag=1;
			}
				
			if(time!=null&&!time.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" time "+" like "+"'%"+time+"%'";
				flag=1;
			}
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
	public String del_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from software where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(number!=0){
				if(flag==1)
					sql+=" AND ";
				sql+=" number "+" like "+"'%"+number+"%'";
				flag=1;
			}

			if(owner!=null&&!owner.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" owner "+" like "+"'%"+owner+"%'";
				flag=1;
			}
				
			if(org!=null&&!org.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" org "+" like "+"'%"+org+"%'";
				flag=1;
			}
				
			if(time!=null&&!time.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" time "+" like "+"'%"+time+"%'";
				flag=1;
			}
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
	public String del_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from study where";
			if(org!=null&&!org.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" org "+" like "+"'%"+org+"%'";
				flag=1;
			}
			if(substance!=null&&!substance.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" substance "+" like "+"'%"+substance+"%'";
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
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
	public String del_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from team where";
			if(name!=null&&!name.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" name "+" like "+"'%"+name+"%'";
				flag=1;
			}
			if(post!=null&&!post.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" post "+" like "+"'%"+post+"%'";
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
		
			if(person!=null&&!person.equals("")){
				if(flag==1)
					sql+=" AND ";
				sql+=" person "+" like "+"'%"+person+"%'";
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
