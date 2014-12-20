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
<<<<<<< HEAD
	private int year;
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
	private String person;
	private String level;
	private String press;
	private String substance;
	private String post;
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
	public String getCard() {
		return card;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public String getInvi_by() {
		return invi_by;
	}
	public void setInvi_by(String invi_by) {
		this.invi_by = invi_by;
	}
<<<<<<< HEAD
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
	public String del_accept(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql="delete from accept where";
			if(name!=null&&!name.equals("")){
				sql+=" name= "+"'"+name+"'";
				sql+=" and "+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
			System.out.println("name:"+name);
			System.out.println("invi_by:"+invi_by);
				sql+=" name= "+"'"+name+"'";
				sql+=" and "+" invi_by= "+"'"+invi_by+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" name= "+"'"+name+"'";
				sql+=" and "+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" number= "+"'"+number+"'"+" and "+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" name= "+"'"+name+"'"+"and"+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" name= "+"'"+name+"'";
				sql+=" and "+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
			sql+=" number= "+"'"+number+"'"+"and";
			sql+=" person= "+"'"+person+"'";
<<<<<<< HEAD
			sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" org= "+"'"+org+"'";
				sql+=" and "+" person= "+"'"+person+"'";
<<<<<<< HEAD
				sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
				sql+=" name= "+"'"+name+"'";
			}
<<<<<<< HEAD
			sql+=" and "+" year= "+"'"+year+"'";
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
