import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_study {
	private String org;
	private String substance;
	private String start;
	private String end;
	private String person;
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
}