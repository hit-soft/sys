import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_team {
	private String name;
	private String post;
	private String start;
	private String end;
	private String person;
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
	public String del_team(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from team where";
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