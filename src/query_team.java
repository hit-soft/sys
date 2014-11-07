import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class query_team {
	private List<team> l = new ArrayList();
	private String name;
	private String post;
	private String start;
	private String end;
	private String person;
	public List<team> getL() {
		return l;
	}
	public void setL(List<team> l) {
		this.l = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
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
	public String query_team(){
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		System.out.println("真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真真");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from team where";
		if(name!=null&&!name.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" name "+" like "+"'%"+name+"%'";
			flag=1;
		}
		if(post!=null&&!post.equals("")){
			if(flag==1)
				sql+=" AND ";
			sql+=" post "+" like "+"'%"+post+"%'";
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
		System.out.println("name:"+name);
		System.out.println("number:"+post);
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
					team use=new team();
					use.setName(rs.getString(1));
					use.setPost(rs.getString(2));
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