import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_funds {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private String contract;
	private String already;
	private String non;
	private String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
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
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getAlready() {
		return already;
	}
	public void setAlready(String already) {
		this.already = already;
	}
	public String getNon() {
		return non;
	}
	public void setNon(String non) {
		this.non = non;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String del_funds(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from funds where";
				if(name!=null&&!name.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" name "+" like "+"'%"+name+"%'";
					flag=1;
				}
				if(source!=null&&!source.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" source "+" like "+"'%"+source+"%'";
					flag=1;
				}

				if(leader!=null&&!leader.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" leader "+" like "+"'%"+leader+"%'";
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
			
				if(contract!=null&&!contract.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" contract "+" like "+"'%"+contract+"%'";
					flag=1;
				}
				System.out.println(sql);
				if(already!=null&&!already.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" already "+" like "+"'%"+already+"%'";
					flag=1;
				}
				System.out.println(sql);
				if(non!=null&&!non.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" non "+" like "+"'%"+non+"%'";
					flag=1;
				}
				System.out.println(sql);
				if(number!=null&&!number.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" number "+" like "+"'%"+number+"%'";
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