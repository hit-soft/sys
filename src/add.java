import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class add {
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
	public String out_pe;
	public String in_pe;
	public String num;
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
	public String add_accept(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into accept(name,source,leader,start,end,contract,type,time,org,number,card,remark) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+leader+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+
					","+"'"+type+"'"+","+"'"+time+"'"+","+"'"+org+"'"+","+"'"+number+"'"+","+"'"+card+"'"+","+"'"+remark+"'"+")";
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
	public String add_coope(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
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
	public String add_funds(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
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
	public String add_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into patent(name,number,owner,org,time,person) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+owner+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person+"'"+")";
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
	public String add_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into priz(name,type,level,time,person) " +
					"values("+"'"+name+"'"+","+"'"+type+"'"+","+"'"+level+"'"+","+"'"+time+"'"+","+"'"+person+"'"+")";
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
	public String add_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into software(name,number,owner,org,time,person) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+owner+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person+"'"+")";
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
	public String add_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into study(org,substance,start,end,person) " +
					"values("+"'"+org+"'"+","+"'"+substance+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person+"'"+")";
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
	public String add_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›≤›cccccccccccccccccccccccc");
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into team(name,post,start,end,person) " +
					"values("+"'"+name+"'"+","+"'"+post+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person+"'"+")";
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
