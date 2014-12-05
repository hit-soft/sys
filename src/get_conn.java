import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class export {
	public String Export(){
		get_conn util=new get_conn();
		Connection conn=util.getConnection();
		try {
			System.out.println("ÍõÁú»ªÍõÁú»ªÍõÁú»ªÍõÁú»ªÍõÁú»ªÍõÁú»ªÍõÁú»ª");
			Statement stmt=conn.createStatement();
			String sql="select * from priz into outfile 'D://qpriz.xls' ";
			stmt.execute(sql);
			sql="select * from accept into outfile 'D://qaccept.xls' ";
			stmt.execute(sql);
			sql="select * from coope into outfile 'D://qcoope.xls' ";
			stmt.execute(sql);
			sql="select * from funds into outfile 'D://qfunds.xls' ";
			stmt.execute(sql);
			sql="select * from patent into outfile 'D://qpatent.xls' ";
			stmt.execute(sql);
			sql="select * from publ into outfile 'D://qpubl.xls' ";
			stmt.execute(sql);
			sql="select * from software into outfile 'D://qsoftware.xls' ";
			stmt.execute(sql);
			sql="select * from study into outfile 'D://qstudy.xls' ";
			stmt.execute(sql);
			sql="select * from team into outfile 'D://qteam.xls' ";
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
