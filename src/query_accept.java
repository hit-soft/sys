import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_accept {
	private List<accept> l = new ArrayList();
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
	public List<accept> getL() {
		return l;
	}
	public void setL(List<accept> l) {
		this.l = l;
	}
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String query_accept(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from accept where ";
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
	
		if(contract!=null&&!contract.equals("")){
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
		if(number!=null&&!number.equals("")){
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
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					accept use=new accept();
					use.setName(rs.getString(1));
					use.setSource(rs.getString(2));
					use.setLeader(rs.getString(3));
					use.setStart(rs.getString(4));
					use.setEnd(rs.getString(5));
					use.setContract(rs.getString(6));
					use.setType(rs.getString(7));
					use.setTime(rs.getString(8));
					use.setOrg(rs.getString(9));
					use.setNumber(rs.getString(10));
					use.setCard(rs.getString(11));
					use.setRemark(rs.getString(12));
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