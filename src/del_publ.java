import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_publ {
	private String name;
	private String press;
	private String time;
	private String person;
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
	public String del_publ(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from publ where";
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