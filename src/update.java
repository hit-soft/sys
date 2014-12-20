import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class update {
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
	public String out_pe;
	public String in_pe;
	public int num;
	public String out_pl;
	public String in_pl;
	public String goal;
	private double already;
	private double non;
	private String owner;
	private String person;
	private String level;
	private String press;
	private String substance;
	private String post;
	private int per_level;
	private String invi_by;
	private String per;
	private double score;
<<<<<<< HEAD
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
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
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
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
	public int getPer_level() {
		return per_level;
	}
	public void setPer_level(int per_level) {
		this.per_level = per_level;
	}
	public String getInvi_by() {
		return invi_by;
	}
	public void setInvi_by(String invi_by) {
		this.invi_by = invi_by;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String cal_author(){
		score=0;
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
<<<<<<< HEAD
=======
		
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
		try{
			String sql="select * from funds ";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				String pe = rs.getString(10);
				double alrea=rs.getDouble(7);
				String type=rs.getString(12);
				int leve=rs.getInt(11);
				if(pe.equals(per)&&leve==1){
					score+=(int)alrea;
					System.out.println("score+="+(int)alrea);
					if(type.equals("国家973项目"))
						score*=12;
					else if(type.equals("国家科技重大专项"))
						score*=10;
					else if(type.equals("国家自然科学基金	重大/重点"))
						score*=8;
					else if(type.equals("国家自然科学基金	面上"))
						score*=5;
					else if(type.equals("863项目、国家科技支撑项目	重大/重点"))
						score*=4;
					else if(type.equals("863项目、国家科技支撑项目	863面上"))
						score*=2;
					else if(type.equals("部委重大/重点项目"))
						score*=1.8;
					else if(type.equals("国防类及其它部委项目"))
						score*=1.3;
					else if(type.equals("国际合作项目"))
						score*=1/5;
					System.out.println("after funds score="+(int)score);
					//else
				}
			}
			
			sql="select * from software ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String pe = rs.getString(6);
				int per_l=rs.getInt(7);
				if(pe.equals(per)){
					if(per_l==1)
						score+=5;
					else if(per_l==2)
						score+=3;
					else if(per_l==3)
						score+=1.5;
					else if(per_l==4)
						score+=0.5;
					System.out.println("after software score="+(int)score);
					//else
				}
			}
			
			sql="select * from priz ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				double add=0;
				String type = rs.getString(3);
				String pe = rs.getString(5);
				int per_l=rs.getInt(6);
				if(pe.equals(per)){
					if(per_l==1)
						add+=1;
					else if(per_l==2)
						add+=0.9;
					else if(per_l==3)
						add+=0.8;
					else if(per_l==4)
						add+=0.7;
					else if(per_l==5)
						add+=0.6;
					else if(per_l==6)
						add+=0.5;
					else if(per_l==7)
						add+=0.4;
					else if(per_l==8)
						add+=0.3;
					else if(per_l==9)
						add+=0.2;
					else
						add+=0.1;
					if(type.equals("国家级一等奖"))
						add*=500;
					else if(type.equals("国家级二等奖"))
						add*=150;
					else if(type.equals("省部级一等奖"))
						add*=80;
					else if(type.equals("省部级二等奖"))
						add*=50;
					else if(type.equals("国际专项奖"))
						add*=50;
					else
						add*=30;
					score+=add;
					System.out.println("after priz score="+(int)score);
				}
			}
			
			
			sql="select * from publ ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				double add=0;
				String type = rs.getString(6);
				String pe = rs.getString(4);
				int per_l=rs.getInt(5);
				if(pe.equals(per)){
					if(per_l==1)
						add+=1;
					else if(per_l==2)
						add+=0.6;
					else if(per_l==3)
						add+=0.3;
					else
						add+=0.1;
					if(type.equals("外文版专著"))
						add*=60;
					else if(type.equals("中文版专著"))
						add*=50;
					else
						add*=30;
					score+=add;
					System.out.println("after publ score="+(int)score);
				}
			}
			
			
			
			sql="select * from patent ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				double add=0;
				String type = rs.getString(8);
				String pe = rs.getString(6);
				int per_l=rs.getInt(7);
				
				if(pe.equals(per)){
					if(per_l==1)
						add+=1;
					else if(per_l==2)
						add+=0.6;
					else if(per_l==3)
						add+=0.3;
					else
						add+=0.1;
					if(type.equals("国 际发明专利授权"))
						add*=30;
					if(type.equals("国内发明专利授权"))
						add*=15;
					else
						add*=10;
					score+=add;
					System.out.println("after patent score="+(int)score);
				}
			}
		
			
			
			sql="select * from team ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String type = rs.getString(6);
				String pe = rs.getString(5);
				if(pe.equals(per)){
					if(type.equals("国际学术组织理事以上职务"))
						score+=20;
					else if(type.equals("全国一级学会常务理事以上职务或专委会主任"))
						score+=20;
					else if(type.equals("全国一级学会理事或专委会副主任"))
						score+=10;
					else if(type.equals("省学会常务理事以上职务或专委会主任"))
						score+=5;
					else if(type.equals("省学会理事或专委会副主任"))
						score+=3;
					else if(type.equals("国家863主题专家组专家"))
						score+=20;
					else
						score+=10;
					System.out.println("after team score="+(int)score);
				}
			}
			
			
			
			
			
			sql="select * from coope ";
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String type = rs.getString(1);
				String pe = rs.getString(11);
				if(pe.equals(per)){
						score+=10;
						System.out.println("after coope score="+(int)score);
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
<<<<<<< HEAD
		}finally{
			util.closeConnection(conn);
		}
=======
			System.out.println("error!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}finally{
			util.closeConnection(conn);
		}
		System.out.println("11111111111111111111111111111111111111");
		System.out.println("11111111111111111111111111111111111111");
		System.out.println("11111111111111111111111111111111111111");
		System.out.println("11111111111111111111111111111111111111");
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
		System.out.println(per+score);
		return "1";
	}
	public String update_accept(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
<<<<<<< HEAD
			String sql2="update accept set source="+"'"+source+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql3="update accept set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql4="update accept set start="+"'"+start+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql5="update accept set end="+"'"+end+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql6="update accept set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql7="update accept set type="+"'"+type+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql8="update accept set time="+"'"+time+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql9="update accept set org="+"'"+org+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql10="update accept set number="+"'"+number+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql11="update accept set card="+"'"+card+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql12="update accept set remark="+"'"+remark+"'"+ "where name="+"'"+name+"'"+" and "+"year= "+"'"+"year"+"'";
			String sql13="update accept set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+" person= "+"'"+person+"'"+" and "+"year= "+"'"+"year"+"'";
=======
//			String sql1="update accept set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update accept set source="+"'"+source+"'"+ "where name="+"'"+name+"'";
			String sql3="update accept set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'";
			String sql4="update accept set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql5="update accept set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql6="update accept set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'";
			String sql7="update accept set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
			String sql8="update accept set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql9="update accept set org="+"'"+org+"'"+ "where name="+"'"+name+"'";
			String sql10="update accept set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql11="update accept set card="+"'"+card+"'"+ "where name="+"'"+name+"'";
			String sql12="update accept set remark="+"'"+remark+"'"+ "where name="+"'"+name+"'";
			String sql13="update accept set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+" person= "+"'"+person+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);
			System.out.println(sql7);
			stmt.execute(sql7);
			System.out.println(sql8);
			stmt.execute(sql8);
			System.out.println(sql9);
			stmt.execute(sql9);
			stmt.execute(sql10);
			System.out.println(sql10);
			stmt.execute(sql11);
			System.out.println(sql11);
			stmt.execute(sql12);
			System.out.println(sql12);
			System.out.println(sql13);
			stmt.execute(sql13);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_coope(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update coope set type="+"'"+type+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql2="update coope set out_pe="+"'"+out_pe+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql3="update coope set in_pe="+"'"+in_pe+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql4="update coope set num="+"'"+num+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql5="update coope set start="+"'"+start+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql6="update coope set end="+"'"+end+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql7="update coope set out_pl="+"'"+out_pl+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql8="update coope set in_pl="+"'"+in_pl+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			String sql9="update coope set goal="+"'"+goal+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
//			String sql10="update coope set name="+"'"+name+"'"+ "where name="+"'"+name+"'"+" and "+"invi_by ="+"'"+invi_by+"'";
			System.out.println(sql1);
			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);
			System.out.println(sql7);
			stmt.execute(sql7);
			System.out.println(sql8);
			stmt.execute(sql8);
			System.out.println(sql9);
			stmt.execute(sql9);
//			System.out.println(sql10);
//			stmt.execute(sql10);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_funds(){
		System.out.println("here");
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update funds set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update funds set source="+"'"+source+"'"+ "where name="+"'"+name+"'";
			String sql3="update funds set leader="+"'"+leader+"'"+ "where name="+"'"+name+"'";
			String sql4="update funds set start="+"'"+start+"'"+ "where name="+"'"+name+"'";
			String sql5="update funds set end="+"'"+end+"'"+ "where name="+"'"+name+"'";
			String sql6="update funds set contract="+"'"+contract+"'"+ "where name="+"'"+name+"'";
			String sql7="update funds set already="+"'"+already+"'"+ "where name="+"'"+name+"'";
			String sql8="update funds set non="+"'"+non+"'"+ "where name="+"'"+name+"'";
			String sql9="update funds set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql10="update funds set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+"person="+"'"+person+"'";
			String sql11="update funds set type="+"'"+type+"'"+ " where name="+"'"+name+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);
			System.out.println(sql7);
			stmt.execute(sql7);
			System.out.println(sql8);
			stmt.execute(sql8);
			System.out.println(sql9);
			stmt.execute(sql9);
			System.out.println(sql10);
			stmt.execute(sql10);
			System.out.println(sql11);
			stmt.execute(sql11);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_patent(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update patent set name="+"'"+name+"'"+ "where number="+"'"+number+"'";
//			String sql1="update patent set number="+"'"+number+"'"+ "where name="+"'"+name+"'";
			String sql2="update patent set owner="+"'"+owner+"'"+ "where number="+"'"+number+"'";
			String sql3="update patent set org="+"'"+org+"'"+ "where number="+"'"+number+"'";
			String sql4="update patent set time="+"'"+time+"'"+ "where number="+"'"+number+"'";
			String sql5="update patent set per_level="+"'"+per_level+"'"+ "where number="+"'"+number+"'"+" and "+"person="+"'"+person+"'";
			String sql6="update patent set type="+"'"+type+"'"+ "where number="+"'"+number+"'";
//			String sql5="update patent set person="+"'"+person+"'"+ "where number="+"'"+number+"'";
//			System.out.println(sql);
//			stmt.execute(sql);
			System.out.println(sql1);
			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_priz(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update priz set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update priz set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
			String sql3="update priz set level="+"'"+level+"'"+ "where name="+"'"+name+"'";
			String sql4="update priz set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql5="update priz set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+"person="+"'"+person+"'";
//			String sql5="update priz set person="+"'"+person+"'"+ "where name="+"'"+name+"'"+" and "+"person "+"="+"'"+person+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_publ(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update publ set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
			String sql2="update publ set press="+"'"+press+"'"+ "where name="+"'"+name+"'";
			String sql3="update publ set time="+"'"+time+"'"+ "where name="+"'"+name+"'";
			String sql4="update publ set per_level="+"'"+per_level+"'"+ "where name="+"'"+name+"'"+" and "+"person="+"'"+person+"'";
			String sql5="update publ set type="+"'"+type+"'"+ "where name="+"'"+name+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_software(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
			String sql1="update software set name="+"'"+name+"'"+ "where number="+"'"+number+"'";
			String sql2="update software set owner="+"'"+owner+"'"+ "where number="+"'"+number+"'";
			String sql3="update software set org="+"'"+org+"'"+ "where number="+"'"+number+"'";
			String sql4="update software set time="+"'"+time+"'"+ "where number="+"'"+number+"'";
			//String sql5="update software set person="+"'"+person+"'"+ "where number="+"'"+number+"'";
			String sql5="update software set per_level="+"'"+per_level+"'"+ "where number="+"'"+number+"'"+" and "+"person="+"'"+person+"'";
			System.out.println(sql1);
			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
		
	}
	public String update_study(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update study set org="+"'"+org+"'"+ "where org="+"'"+org+"'";
			String sql2="update study set substance="+"'"+substance+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
			String sql3="update study set start="+"'"+start+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
			String sql4="update study set end="+"'"+end+"'"+ "where org="+"'"+org+"'"+" and "+"person="+"'"+person+"'";
//			String sql5="update study set person="+"'"+person+"'"+ "where org="+"'"+org+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
			System.out.println(sql2);
			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
//			System.out.println(sql5);
//			stmt.execute(sql5);
			return "1";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}finally{
			util.closeConnection(conn);
		}
	}
	public String update_team(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			Statement stmt=conn.createStatement();
//			String sql1="update team set name="+"'"+name+"'"+ "where name="+"'"+name+"'";
//			String sql2="update team set post="+"'"+post+"'"+ "where name="+"'"+name+"'"+"and"+"post="+"'"+post+"'";
			String sql3="update team set start="+"'"+start+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql4="update team set end="+"'"+end+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql5="update team set person="+"'"+person+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
			String sql6="update team set type="+"'"+type+"'"+ "where name="+"'"+name+"'"+"and"+" post="+"'"+post+"'";
//			System.out.println(sql1);
//			stmt.execute(sql1);
//			System.out.println(sql2);
//			stmt.execute(sql2);
			System.out.println(sql3);
			stmt.execute(sql3);
			System.out.println(sql4);
			stmt.execute(sql4);
			System.out.println(sql5);
			stmt.execute(sql5);
			System.out.println(sql6);
			stmt.execute(sql6);

			String sql="select * from team_per ";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println(sql);
			int fla=0;
			while(rs.next()){
			if(person.equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into team_per(per) " +
						"values("+"'"+person+"'"+")";
				System.out.println(sql);
				stmt.execute(sql);
			}
			
			
			sql="select * from per ";
			rs=stmt.executeQuery(sql);
			System.out.println(sql);
			fla=0;
			while(rs.next()){
				System.out.println("person:"+person);
			if(person.equals(rs.getString(1))){
				fla=1;
				break;
				}
			}
			if(fla==0)
			{
				sql="insert into per(name) "+
						"values("+"'"+person+"'"+")";
				System.out.println(sql);
			stmt.execute(sql);
			}
			
			
			
			
			
			
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
