import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class update {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private double contract;
	private String type;
	private String time;
	private String org;
	private int number;
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
	private int per_level;
	private String invi_by;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
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
	public int getPer_level() {
		return per_level;
	}
	public void setPer_level(int per_level) {
		this.per_level = per_level;
	}
	public String getInvi_by() {
		return invi_by;
	}
	public void setInvi_by(String invi_by) {
		this.invi_by = invi_by;
	}
	public String update_accept(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update accept set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
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
//			System.out.println(sql1);
//			stmt.execute(sql1);
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
	public String update_coope(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update coope set type="+"'"+type+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql2="update coope set out_pe="+"'"+out_pe+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql3="update coope set in_pe="+"'"+in_pe+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql4="update coope set num="+"'"+num+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql5="update coope set start="+"'"+start+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql6="update coope set end="+"'"+end+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql7="update coope set out_pl="+"'"+out_pl+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql8="update coope set in_pl="+"'"+in_pl+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql9="update coope set goal="+"'"+goal+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
//			String sql10="update coope set name="+"'"+name+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
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
//			System.out.println(sql10);
//			stmt.execute(sql10);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_funds(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update funds set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update funds set source="+"'"+source+"'"+ "where name="+"'"+name+"'";
			String sql3="update funds set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'";
			String sql4="update funds set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql5="update funds set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql6="update funds set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'";
			String sql7="update funds set already="+"'"+already+"'"+ "where name="+"'"+name+"'";
			String sql8="update funds set non="+"'"+non+"'"+ "where name="+"'"+name+"'";
			String sql9="update funds set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
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
	public String update_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update patent set name="+"'"+name+"'"+ "where number="+"'"+number+"'";
//			String sql1="update patent set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql2="update patent set owner="+"'"+owner+"'"+ "where number="+"'"+number+"'";
			String sql3="update patent set org="+"'"+org+"'"+ "where number="+"'"+number+"'";
			String sql4="update patent set time="+"'"+time+"'"+ "where number="+"'"+number+"'";
			String sql5="update patent set per_level="+"'"+per_level+"'"+ "where number="+"'"+number+"'"+" and "+"person="+"'"+person+"'";
//			String sql5="update patent set person="+"'"+person+"'"+ "where number="+"'"+number+"'";
//			System.out.println(sql);
//			stmt.execute(sql);
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
	public String update_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update priz set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update priz set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
			String sql3="update priz set level="+"'"+level+"'"+ "where name="+"'"+name+"'";
			String sql4="update priz set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql5="update priz set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+"person="+"'"+person+"'";
//			String sql5="update priz set person="+"'"+person+"'"+ "where name="+"'"+name+"'"+" and "+"person "+"="+"'"+person+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
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
	public String update_publ(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update publ set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update publ set press="+"'"+press+"'"+ "where name="+"'"+name+"'";
			String sql3="update publ set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql4="update publ set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+"person="+"'"+person+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update software set name="+"'"+name+"'"+ "where number="+"'"+number+"'";
			String sql2="update software set owner="+"'"+owner+"'"+ "where number="+"'"+number+"'";
			String sql3="update software set org="+"'"+org+"'"+ "where number="+"'"+number+"'";
			String sql4="update software set time="+"'"+time+"'"+ "where number="+"'"+number+"'";
			//String sql5="update software set person="+"'"+person+"'"+ "where number="+"'"+number+"'";
			String sql5="update software set per_level="+"'"+per_level+"'"+ "where number="+"'"+number+"'"+" and "+"person="+"'"+person+"'";
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
	public String update_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update study set org="+"'"+org+"'"+ "where org="+"'"+org+"'";
			String sql2="update study set substance="+"'"+substance+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
			String sql3="update study set start="+"'"+start+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
			String sql4="update study set end="+"'"+end+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
//			String sql5="update study set person="+"'"+person+"'"+ "where org="+"'"+org+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
//			System.out.println(sql5);
//			stmt.execute(sql5);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update team set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
//			String sql2="update team set post="+"'"+post+"'"+ "where name="+"'"+name+"'"+"and"+"post="+"'"+post+"'";
			String sql3="update team set start="+"'"+start+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql4="update team set end="+"'"+end+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql5="update team set person="+"'"+person+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql6="update team set type="+"'"+type+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
//			System.out.println(sql2);
//			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);

			String sql="select * from team_per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
				System.out.println("person:"+person);
			if(person.equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into team_per(per) " +
						"values("+"'"+person+"'"+")";
				System.out.println(sql);
				stmt.execute(sql);
			}
			
			
			sql="select * from per ";
			rs=stmt.executeQuery(sql);
			System.out.println(sql);
			fla=0;
			while(rs.next()){
				System.out.println("person:"+person);
			if(person.equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into per(name) "+
						"values("+"'"+person+"'"+")";
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			
			
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
