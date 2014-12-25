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
         
           // ������д���Excel������
           Calendar ca = Calendar.getInstance();
           fileName = "D://���гɹ�ͳ��-"+ca.get(Calendar.YEAR)+"."+(ca.get(Calendar.MONTH)+1)+"."+ca.get(Calendar.DATE)+".xls";
           File file=new File(fileName);
           if (!file.exists()) {
               file.createNewFile();
           }
           //��fileNameΪ�ļ���������һ��Workbook
           wwb = Workbook.createWorkbook(file);

           // ����������
           WritableSheet funds_ws = wwb.createSheet("���о��ѵ������", 0);
           WritableSheet accept_ws = wwb.createSheet("������Ŀ�������", 1);
           WritableSheet software_ws = wwb.createSheet("�������Ȩ���",2);
           WritableSheet patent_ws = wwb.createSheet("ר�����", 3);
           WritableSheet priz_ws = wwb.createSheet("�����", 4);
           WritableSheet publ_ws = wwb.createSheet("����ר�����",5);
           WritableSheet team_ws = wwb.createSheet("ѧ�������ְ���", 6);
           WritableSheet study_ws = wwb.createSheet("��������޼�ѧϰ���", 7);
           WritableSheet coope_ws = wwb.createSheet("���ʺ������",8);
           funds_cel.toexcel(funds_ws);
           accept_cel.toexcel(accept_ws);
           software_cel.toexcel(software_ws);
           patent_cel.toexcel(patent_ws);
           priz_cel.toexcel(priz_ws);
           publ_cel.toexcel(publ_ws);
           team_cel.toexcel(team_ws);
           study_cel.toexcel(study_ws);
           coope_cel.toexcel(coope_ws);
          //д���ĵ�
           fileName ="�ɹ���������¼������d�̸�Ŀ¼���ļ���Ϊ:"+fileName.substring(4);
           System.out.println("fileName is :"+fileName);
           
           HttpServletRequest request = ServletActionContext.getRequest();
           request.setAttribute("fileName",fileName);
           
           wwb.write();
          // �ر�Excel����������
           wwb.close();
         
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       return "1";
   }
}