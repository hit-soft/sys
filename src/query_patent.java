import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_patent {
	private List<patent> l = new ArrayList();
	private String name;
	private double number;
	private String owner;
	private String org;
	private String time;
	private String person;
	public List<patent> getL() {
		return l;
	}
	public void setL(List<patent> l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	int flag=0;
	public String query_patent(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from patent where";
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
		System.out.println("name:"+name);
		System.out.println("number:"+number);
		System.out.println("owner:"+owner);
		System.out.println("org:"+org);
		System.out.println("time:"+time);
		System.out.println("person:"+person);
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					patent use=new patent();
					use.setName(rs.getString(1));
					use.setNumber(rs.getDouble(2));
					use.setOwner(rs.getString(3));
					use.setOrg(rs.getString(4));
					use.setTime(rs.getString(5));
					use.setPerson(rs.getString(6));
					fla=1;
					l.add(use);
		}
				if(fla==0)
					return "0";
				else
					return "1";
		}
		catch(SQLException e){
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
		}
		else
			return "0";
	}
}