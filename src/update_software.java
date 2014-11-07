import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class update_software {
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
	public String update_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update software set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql2="update software set owner="+"'"+owner+"'"+ "where name="+"'"+name+"'";
			String sql3="update software set org="+"'"+org+"'"+ "where name="+"'"+name+"'";
			String sql4="update software set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql5="update software set person="+"'"+person+"'"+ "where name="+"'"+name+"'";
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
}
