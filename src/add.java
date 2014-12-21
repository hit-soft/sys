import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class add {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private double contract;
	private String type;
	private String time;
	private String org;
	private int number;
	private String card;
	private String remark;
	private String out_pe;
	private String in_pe;
	private int num;
	private String out_pl;
	private String in_pl;
	private String goal;
	private double already;
	private double non;
	private String owner;
	private String [] person;
	private String level;
	private String press;
	private String substance;
	private String post;
	private String invi_by;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
<<<<<<< HEAD
=======
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
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
	public double getContract() {
		return contract;
	}
	public void setContract(double contract) {
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
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
	public String getOut_pe() {
		return out_pe;
	}
	public void setOut_pe(String out_pe) {
		this.out_pe = out_pe;
	}
	public String getIn_pe() {
		return in_pe;
	}
	public void setIn_pe(String in_pe) {
		this.in_pe = in_pe;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getOut_pl() {
		return out_pl;
	}
	public void setOut_pl(String out_pl) {
		this.out_pl = out_pl;
	}
	public String getIn_pl() {
		return in_pl;
	}
	public void setIn_pl(String in_pl) {
		this.in_pl = in_pl;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public double getAlready() {
		return already;
	}
	public void setAlready(double already) {
		this.already = already;
	}
	public double getNon() {
		return non;
	}
	public void setNon(double non) {
		this.non = non;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String[] getPerson() {
		return person;
	}
	public void setPerson(String[] person) {
		this.person = person;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getInvi_by() {
		return invi_by;
	}
	public void setInvi_by(String invi_by) {
		this.invi_by = invi_by;
	}
	
	public String add_software(){
		int flag=1;
		for(int i=0;i<5;i++){
			if(person[i]!=null&&!person[i].equals("")){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into software(name,number,owner,org,time,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+person[0]+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into software(name,number,owner,org,time,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+person[0]+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into software(name,number,owner,org,time,person,per_level) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+person[0]+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			
			
			sql="insert into software_per(number,person) " +
					"values("+"'"+number+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			}
			catch(SQLException e){
				e.printStackTrace();
				flag=0;
			}
		finally{
			util.closeConnection(conn);
		}
			}
			
			
		}
		if(flag==1) return "1";
		else 		return "0";
	}	
	public String add_coope(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into coope(type,out_pe,in_pe,num,start,end,out_pl,in_pl,goal,name,invi_by,year) " +
					"values("+"'"+type+"'"+","+"'"+out_pe+"'"+","+"'"+in_pe+"'"+","+"'"+num+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+out_pl+"'"+","+"'"+in_pl+"'"+","+"'"+goal+"'"+","+"'"+name+"'"+","+"'"+invi_by+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into coope(type,out_pe,in_pe,num,start,end,out_pl,in_pl,goal,name,invi_by,year) " +
					"values("+"'"+type+"'"+","+"'"+out_pe+"'"+","+"'"+in_pe+"'"+","+"'"+num+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+out_pl+"'"+","+"'"+in_pl+"'"+","+"'"+goal+"'"+","+"'"+name+"'"+","+"'"+invi_by+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into coope(type,out_pe,in_pe,num,start,end,out_pl,in_pl,goal,name,invi_by) " +
					"values("+"'"+type+"'"+","+"'"+out_pe+"'"+","+"'"+in_pe+"'"+","+"'"+num+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+out_pl+"'"+","+"'"+in_pl+"'"+","+"'"+goal+"'"+","+"'"+name+"'"+","+"'"+invi_by+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="insert into coope_per(name,invi_by) " +
					"values("+"'"+name+"'"+","+"'"+invi_by+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(invi_by.equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(invi_by.equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+invi_by+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+invi_by+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+invi_by+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			
			return "1";
			}
			catch(SQLException e){
				e.printStackTrace();
				return "0";
			}
		finally{
			util.closeConnection(conn);
		}
	}
	public String add_accept(){
		int flag=1;
		for(int i=0;i<6;i++){
			if(person[i]!=null&&!person[i].equals("")){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
		System.out.println("year="+year);
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into accept(name,source,leader,start,end,contract,type,time,org,number,card,remark,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+person[0]+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+
					","+"'"+type+"'"+","+"'"+time+"'"+","+"'"+org+"'"+","+"'"+number+"'"+","+"'"+card+"'"+","+"'"+remark+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
<<<<<<< HEAD
=======
=======
		try {
			Statement stmt=conn.createStatement();
			String sql="insert into accept(name,source,leader,start,end,contract,type,time,org,number,card,remark,person,per_level) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+person[0]+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+
					","+"'"+type+"'"+","+"'"+time+"'"+","+"'"+org+"'"+","+"'"+number+"'"+","+"'"+card+"'"+","+"'"+remark+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="insert into accept_per(name,person) " +
					"values("+"'"+name+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			}
			catch(SQLException e){
				e.printStackTrace();
				flag=0;
			}
		finally{
			util.closeConnection(conn);
		}
	}
	}
		if(flag==1) return "1";
		else 		return "0";
	}
	public String add_funds(){
		int flag=1;
		for(int i=0;i<6;i++){
			if(person[i]!=null&&!person[i].equals("")){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into funds(name,source,leader,start,end,contract,already,non,number,person,per_level,type,year) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+person[0]+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+","+"'"+already+"'"+","+"'"+non+"'"+","+"'"+number+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into funds(name,source,leader,start,end,contract,already,non,number,person,per_level,type,year) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+person[0]+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+","+"'"+already+"'"+","+"'"+non+"'"+","+"'"+number+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into funds(name,source,leader,start,end,contract,already,non,number,person,per_level,type) " +
					"values("+"'"+name+"'"+","+"'"+source+"'"+","+"'"+person[0]+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+contract+"'"+","+"'"+already+"'"+","+"'"+non+"'"+","+"'"+number+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="insert into funds_per(name,person) " +
					"values("+"'"+name+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			}
			catch(SQLException e){
				e.printStackTrace();
				flag=0;
			}
		finally{
			util.closeConnection(conn);
		}
			}
		}
		if(flag==1) return "1";
		else 		return "0";
	}
	public String add_patent(){
		int flag=1;
		for(int i=0;i<4;i++){
		if(person[i]!=null&&!person[i].equals("")){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into patent(name,number,owner,org,time,person,per_level,type,year) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+person[0]+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into patent(name,number,owner,org,time,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+owner+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into patent(name,number,owner,org,time,person,per_level) " +
					"values("+"'"+name+"'"+","+"'"+number+"'"+","+"'"+owner+"'"+","+"'"+org+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);	
			
			sql="insert into patent_per(number,person) " +
					"values("+"'"+number+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
				System.out.println(sql);
			stmt.execute(sql);
			}
<<<<<<< HEAD
=======
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			
			
			
			
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			}
			catch(SQLException e){
				e.printStackTrace();
				flag=0;
			}
		finally{
			util.closeConnection(conn);
		}
			}
		}
			if(flag==1) return "1";
			else 		return "0";
	}
	public String add_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into study(org,substance,start,end,person,year) " +
					"values("+"'"+org+"'"+","+"'"+substance+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into study(org,substance,start,end,person,year) " +
					"values("+"'"+org+"'"+","+"'"+substance+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into study(org,substance,start,end,person) " +
					"values("+"'"+org+"'"+","+"'"+substance+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			
			sql="select * from study_per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
				System.out.println("person:"+person[0]);
			if(person[0].equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into study_per(person) " +
						"values("+"'"+person[0]+"'"+")";
				System.out.println(sql);
				stmt.execute(sql);
			}
			
			sql="select * from per ";
			rs=stmt.executeQuery(sql);
			System.out.println(sql);
			fla=0;
			while(rs.next()){
				System.out.println("person:"+person[0]);
<<<<<<< HEAD
			if(person[0].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[0].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[0]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			
			return "1";
			}
			catch(SQLException e){
				e.printStackTrace();
				return "0";
			}
		finally{
			util.closeConnection(conn);
		}
	}
	public String add_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into team(name,post,start,end,person,type,year) " +
					"values("+"'"+name+"'"+","+"'"+post+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into team(name,post,start,end,person,type,year) " +
					"values("+"'"+name+"'"+","+"'"+post+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into team(name,post,start,end,person,type) " +
					"values("+"'"+name+"'"+","+"'"+post+"'"+","+"'"+start+"'"+","+"'"+end+"'"+","+"'"+person[0]+"'"+","+"'"+type+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			
			
			
			
			
			sql="select * from team_per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
				System.out.println("person:"+person[0]);
			if(person[0].equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into team_per(per) " +
						"values("+"'"+person[0]+"'"+")";
				System.out.println(sql);
				stmt.execute(sql);
			}
			
			
			sql="select * from per ";
			rs=stmt.executeQuery(sql);
			System.out.println(sql);
			fla=0;
			while(rs.next()){
				System.out.println("person:"+person[0]);
<<<<<<< HEAD
			if(person[0].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[0].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[0]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[0]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			return "1";
			}
			catch(SQLException e){
				e.printStackTrace();
				return "0";
			}
		finally{
			util.closeConnection(conn);
		}
	}
	public String add_priz(){
		int flag=1;
		for(int i=0;i<10;i++){
			if(person[i]!=null&&!person[i].equals("")){
			get_conn util=new get_conn();
			Connection conn=util.getConnection();
			System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into priz(name,type,level,time,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+type+"'"+","+"'"+level+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into priz(name,type,level,time,person,per_level,year) " +
					"values("+"'"+name+"'"+","+"'"+type+"'"+","+"'"+level+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into priz(name,type,level,time,person,per_level) " +
					"values("+"'"+name+"'"+","+"'"+type+"'"+","+"'"+level+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="insert into priz_per(name,person) " +
					"values("+"'"+name+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			}
			catch(SQLException e){
				e.printStackTrace();
				flag=0;
			}
		finally{
			util.closeConnection(conn);
		}
		}
		}
		if(flag==1) return "1";
		else 		return "0";
	}
	
	public String add_publ(){
		int flag=1;
		for(int i=0;i<5;i++){
			if(person[i]!=null&&!person[i].equals("")){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		System.out.println("conn="+conn);
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql="insert into publ(name,press,time,person,per_level,type,year) " +
					"values("+"'"+name+"'"+","+"'"+press+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
			String sql="insert into publ(name,press,time,person,per_level,type,year) " +
					"values("+"'"+name+"'"+","+"'"+press+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+","+"'"+year+"'"+")";
=======
			String sql="insert into publ(name,press,time,person,per_level,type) " +
					"values("+"'"+name+"'"+","+"'"+press+"'"+","+"'"+time+"'"+","+"'"+person[i]+"'"+","+"'"+(i+1)+"'"+","+"'"+type+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
			System.out.println(sql);
			stmt.execute(sql);
			
			sql="insert into publ_per(name,person) " +
					"values("+"'"+name+"'"+","+"'"+person[i]+"'"+")";
			System.out.println(sql);
			stmt.execute(sql);
			
			
			
			sql="select * from per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
<<<<<<< HEAD
			if(person[i].equals(rs.getString(1))&&year==rs.getInt(2)){
=======
			if(person[i].equals(rs.getString(1))){
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
<<<<<<< HEAD
				sql="insert into per(name,year) "+
						"values("+"'"+person[i]+"'"+","+"'"+year+"'"+")";
=======
				sql="insert into per(name) "+
						"values("+"'"+person[i]+"'"+")";
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			}
			catch(SQLException e){
				e.printStackTrace();
				return "0";
			}
		finally{
			util.closeConnection(conn);
		}
	}
		}
		if(flag==1) return "1";
		else 		return "0";
	}
}
