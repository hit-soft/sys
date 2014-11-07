import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_priz {
	private String name;
	private String type;
	private String level;
	private String time;
	private String person;
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
	public String del_priz(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from priz where";
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