import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class add_patent {
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
	public String add_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn=�ݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲݲ�cccccccccccccccccccccccc");
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
	
}
