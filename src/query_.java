import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import	java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class query_ {
	private int flag;
	private String per;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	private List<accept> l1 = new ArrayList();
	public List<accept> getL1() {
		return l1;
	}
	public void setL1(List<accept> l1) {
		this.l1 = l1;
	}
	private List<coope> l2 = new ArrayList();
	public List<coope> getL2() {
		return l2;
	}
	public void setL2(List<coope> l2) {
		this.l2 = l2;
	}
	private List<funds> l3 = new ArrayList();
	public List<funds> getL3() {
		return l3;
	}
	public void setL3(List<funds> l3) {
		this.l3 = l3;
	}
	private List<patent> l4 = new ArrayList();
	public List<patent> getL4() {
		return l4;
	}
	public void setL4(List<patent> l4) {
		this.l4 = l4;
	}
	private List<priz> l5 = new ArrayList();
	public List<priz> getL5() {
		return l5;
	}
	public void setL5(List<priz> l5) {
		this.l5 = l5;
	}
	private List<publ> l6 = new ArrayList();
	public List<publ> getL6() {
		return l6;
	}
	public void setL6(List<publ> l6) {
		this.l6 = l6;
	}
	private List<software> l7 = new ArrayList();
	public List<software> getL7() {
		return l7;
	}
	public void setL7(List<software> l7) {
		this.l7 = l7;
	}
	private List<study> l8 = new ArrayList();
	public List<study> getL8() {
		return l8;
	}
	public void setL8(List<study> l8) {
		this.l8 = l8;
	}
	private List<team> l9 = new ArrayList();
	public List<team> getL9() {
		return l9;
	}
	public void setL9(List<team> l9) {
		this.l9 = l9;
	}
	private List<per> l10 = new ArrayList();
	public List<per> getL10() {
		return l10;
	}
	public void setL10(List<per> l10) {
		this.l10 = l10;
	}
	public String query_accept(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from accept ";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					accept use=new accept();
					use.setName(rs.getString(1));
					use.setSource(rs.getString(2));
					use.setLeader(rs.getString(3));
					use.setStart(rs.getString(4));
					use.setEnd(rs.getString(5));
					use.setContract(rs.getDouble(6));
					use.setType(rs.getString(7));
					use.setTime(rs.getString(8));
					use.setOrg(rs.getString(9));
					use.setNumber(rs.getInt(10));
					use.setCard(rs.getString(11));
					use.setPerson(rs.getString(13));
					use.setPer_level(rs.getInt(14));
					use.setRemark(rs.getString(12));
					fla=1;
					l1.add(use);
		}
				if(fla==0){System.out.println("h1");
					return "0";}
				else{System.out.println("h2");
					return "1";}
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("h3");
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String query_coope(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from coope";
		if(flag==1)
			sql+=" where invi_by = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					coope use=new coope();
					use.setType(rs.getString(1));
					use.setOut_pe(rs.getString(2));
					use.setIn_pe(rs.getString(3));
					use.setNum(rs.getInt(4));
					use.setStart(rs.getString(5));
					use.setEnd(rs.getString(6));
					use.setOut_pl(rs.getString(7));
					use.setIn_pl(rs.getString(8));
					use.setGoal(rs.getString(9));
					use.setName(rs.getString(10));
					use.setInvi_by(rs.getString(11));
					fla=1;
					l2.add(use);
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
	public String query_funds(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from funds";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					funds use=new funds();
					use.setName(rs.getString(1));
					use.setSource(rs.getString(2));
					use.setLeader(rs.getString(3));
					use.setStart(rs.getString(4));
					use.setEnd(rs.getString(5));
					use.setContract(rs.getDouble(6));
					use.setAlready(rs.getDouble(7));
					use.setNon(rs.getDouble(8));
					use.setNumber(rs.getInt(9));
					use.setPerson(rs.getString(10));
					use.setPer_level(rs.getInt(11));
					use.setType(rs.getString(12));
					fla=1;
					l3.add(use);
		}
				if(fla==0){System.out.println("h1");
					return "0";}
				else{System.out.println("h2");
					return "1";}
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println("h3");
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String query_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from patent";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					patent use=new patent();
					use.setName(rs.getString(1));
					use.setNumber(rs.getInt(2));
					use.setOwner(rs.getString(3));
					use.setOrg(rs.getString(4));
					use.setTime(rs.getString(5));
					use.setPerson(rs.getString(6));
					use.setPer_level(rs.getInt(7));
					use.setType(rs.getString(8));
					fla=1;
					l4.add(use);
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
	public String query_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from priz";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
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
					use.setPer_level(rs.getInt(6));
					fla=1;
					l5.add(use);
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
	public String query_publ(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from publ";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
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
					use.setPer_level(rs.getInt(5));
					use.setType(rs.getString(6));
					fla=1;
					l6.add(use);
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
	public String query_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from software";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					software use=new software();
					use.setName(rs.getString(1));
					use.setNumber(rs.getInt(2));
					use.setOwner(rs.getString(3));
					use.setOrg(rs.getString(4));
					use.setTime(rs.getString(5));
					use.setPerson(rs.getString(6));
					use.setPer_level(rs.getInt(7));
					fla=1;
					l7.add(use);
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
	public String query_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from study";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					study use=new study();
					use.setOrg(rs.getString(1));
					use.setSubstance(rs.getString(2));
					use.setStart(rs.getString(3));
					use.setEnd(rs.getString(4));
					use.setPerson(rs.getString(5));
					fla=1;
					l8.add(use);
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
	public String query_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from team";
		if(flag==1)
			sql+=" where person = " +"'"+per+"'";
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
					use.setType(rs.getString(6));
					fla=1;
					l9.add(use);
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
	public String query_author(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		String sql="select * from per";
			try{
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println(sql);
				int fla=0;
				while(rs.next()){
					per use=new per();
					use.setPer(rs.getString(1));
					fla=1;
					l10.add(use);
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
}
