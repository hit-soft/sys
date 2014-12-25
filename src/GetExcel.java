import org.apache.struts2.ServletActionContext;
import java.io.File;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import com.javen.excel.*;
//import jxl.CellView;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class GetExcel {
	public String fileName;
public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
public String toexcel()
   {
       Accept_export accept_cel = new Accept_export();
       Coope_export coope_cel = new Coope_export();
       Funds_export funds_cel = new Funds_export();
       Patent_export patent_cel = new Patent_export();
       Priz_export priz_cel = new Priz_export();
       Publ_export publ_cel = new Publ_export();
       Software_export software_cel = new Software_export();
       Study_export study_cel = new Study_export();
       Team_export team_cel = new Team_export();
       try {
           WritableWorkbook wwb = null;
         
           // 创建可写入的Excel工作簿
           Calendar ca = Calendar.getInstance();
           fileName = "D://科研成果统计-"+ca.get(Calendar.YEAR)+"."+(ca.get(Calendar.MONTH)+1)+"."+ca.get(Calendar.DATE)+".xls";
           File file=new File(fileName);
           if (!file.exists()) {
               file.createNewFile();
           }
           //以fileName为文件名来创建一个Workbook
           wwb = Workbook.createWorkbook(file);

           // 创建工作表
           WritableSheet funds_ws = wwb.createSheet("科研经费到款情况", 0);
           WritableSheet accept_ws = wwb.createSheet("科研项目验收情况", 1);
           WritableSheet software_ws = wwb.createSheet("软件著作权情况",2);
           WritableSheet patent_ws = wwb.createSheet("专利情况", 3);
           WritableSheet priz_ws = wwb.createSheet("获奖情况", 4);
           WritableSheet publ_ws = wwb.createSheet("出版专著情况",5);
           WritableSheet team_ws = wwb.createSheet("学术团体兼职情况", 6);
           WritableSheet study_ws = wwb.createSheet("国内外进修及学习情况", 7);
           WritableSheet coope_ws = wwb.createSheet("国际合作情况",8);
           funds_cel.toexcel(funds_ws);
           accept_cel.toexcel(accept_ws);
           software_cel.toexcel(software_ws);
           patent_cel.toexcel(patent_ws);
           priz_cel.toexcel(priz_ws);
           publ_cel.toexcel(publ_ws);
           team_cel.toexcel(team_ws);
           study_cel.toexcel(study_ws);
           coope_cel.toexcel(coope_ws);
          //写进文档
           fileName ="成功将工作记录导出到d盘根目录，文件名为:"+fileName.substring(4);
           System.out.println("fileName is :"+fileName);
           
           HttpServletRequest request = ServletActionContext.getRequest();
           request.setAttribute("fileName",fileName);
           
           wwb.write();
          // 关闭Excel工作簿对象
           wwb.close();
         
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       return "1";
   }
}