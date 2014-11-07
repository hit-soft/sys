import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_priz {
	private List<priz> l = new ArrayList();
	private String name;
	private String type;
	private String level;
	private String time;
	private String person;
	public List<priz> getL() {
		return l;
	}
	public void setL(List<priz> l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String query_priz(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from priz where";
		if(name!=null&&!name.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" name "+" like "+"'%"+name+"%'";
			flag=1;
		}
		if(type!=null&&!type.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" type "+" like "+"'%"+type+"%'";
			flag=1;
		}

		if(level!=null&&!level.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" level "+" like "+"'%"+level+"%'";
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
		System.out.println("number:"+type);
		System.out.println("owner:"+level);
		System.out.println("time:"+time);
		System.out.println("person:"+person);
		if(flag==1){
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					priz use=new priz();
					use.setName(rs.getString(1));
					use.setType(rs.getString(2));
					use.setLevel(rs.getString(3));
					use.setTime(rs.getString(4));
					use.setPerson(rs.getString(5));
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