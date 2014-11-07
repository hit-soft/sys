import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_patent {
	private String name;
	private String number;
	private String owner;
	private String org;
	private String time;
	private String person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
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
				if(number!=null&&!number.equals("")){
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
}