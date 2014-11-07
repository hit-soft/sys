import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_study {
	private List<study> l = new ArrayList();
	private String org;
	private String substance;
	private String start;
	private String end;
	private String person;
	public List<study> getL() {
		return l;
	}
	public void setL(List<study> l) {
		this.l = l;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
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
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	int flag=0;
	public String query_study(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from study where";
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
		System.out.println("name:"+org);
		System.out.println("number:"+substance);
		System.out.println("owner:"+start);
		System.out.println("end:"+end);
		System.out.println("person:"+person);
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					study use=new study();
					use.setOrg(rs.getString(1));
					use.setSubstance(rs.getString(2));
					use.setStart(rs.getString(3));
					use.setEnd(rs.getString(4));
					use.setPerson(rs.getString(5));
					fla=1;
					l.add(use);
		}
				if(fla==0){System.out.println("0");
					return "0";}
				else{System.out.println("1");
					return "1";}
		}
		catch(SQLException e){
			e.printStackTrace();{System.out.println("2");
			return "0";}
		}finally{
			util.closeConnection(conn);
		}
		}
		else
			return "0";
	}
}