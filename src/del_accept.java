import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class del_accept {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private String contract;
	private String type;
	private String time;
	private String org;
	private String number;
	private String card;
	private String remark;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	int flag=0;
	public String del_accept(){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			try {
				Statement stmt=conn.createStatement();
				String sql="delete from accept where";
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
				if(type!=null&&!type.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" type "+" like "+"'%"+type+"%'";
					flag=1;
				}
				if(time!=null&&!time.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" time "+" like "+"'%"+time+"%'";
					flag=1;
				}
				if(org!=null&&!org.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" org "+" like "+"'%"+org+"%'";
					flag=1;
				}
				if(number!=null&&!number.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" number "+" like "+"'%"+number+"%'";
					flag=1;
				}
				if(card!=null&&!card.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" card "+" like "+"'%"+card+"%'";
					flag=1;
				}
				if(remark!=null&&!remark.equals("")){
					if(flag==1)
						sql+=" AND ";
					sql+=" remark "+" like "+"'%"+remark+"%'";
					flag=1;
				}
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