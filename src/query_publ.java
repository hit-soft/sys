import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_publ {
	private List<publ> l = new ArrayList();
	private String name;
	private String press;
	private String time;
	private String person;
	public List<publ> getL() {
		return l;
	}
	public void setL(List<publ> l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
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
	public String query_publ(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from publ where";
		if(name!=null&&!name.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" name "+" like "+"'%"+name+"%'";
			flag=1;
		}
		if(press!=null&&!press.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" press "+" like "+"'%"+press+"%'";
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
		System.out.println("press:"+press);
		System.out.println("time:"+time);
		System.out.println("person:"+person);
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					publ use=new publ();
					use.setName(rs.getString(1));
					use.setPress(rs.getString(2));
					use.setTime(rs.getString(3));
					use.setPerson(rs.getString(4));
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