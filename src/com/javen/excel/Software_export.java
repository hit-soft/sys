package com.javen.excel;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.javen.entity.software;
import com.javen.service.Software_Service;

//import jxl.CellView;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Software_export{

    public static void main(String[] args) {
        Publ_export patent_cel = new Publ_export();
        try {
            WritableWorkbook wwb = null;
          
            // ������д���Excel������
            Calendar ca = Calendar.getInstance();
            String fileName = "D://ICES�о����Ŀ�����Ŀͳ��"+ca.get(Calendar.YEAR)+"��"+ca.get(Calendar.MONTH)+"��"+ca.get(Calendar.DATE)+"��"+".xls";
            File file=new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            //��fileNameΪ�ļ���������һ��Workbook
            wwb = Workbook.createWorkbook(file);

            // ����������
            
            WritableSheet patent_ws = wwb.createSheet("�������Ȩ���", 0);
            patent_cel.toexcel(patent_ws);
           //д���ĵ�
            wwb.write();
           // �ر�Excel����������
            wwb.close();
          
     } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     } 
    }  
    public void toexcel(WritableSheet ws)
    {
        try {
               ws.getSettings().setDefaultColumnWidth(25);
               //��һ�еĸ�ʽ����
               WritableFont font1 = new WritableFont(WritableFont.ARIAL,20,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED);  
               
               WritableCellFormat cellFormat1 = new WritableCellFormat(font1);  
               //���ñ�����ɫ;  
               //cellFormat1.setBackground(Colour.BLUE_GREY);  
               //���ñ߿�;  
               cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);  
               //�����Զ�����;  
               cellFormat1.setWrap(true);  
               //�������־��ж��뷽ʽ;  
               cellFormat1.setAlignment(Alignment.CENTRE);  
               //���ô�ֱ����;  
               cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);  
               //��ѯ���ݿ������е�����
               List<software> list= Software_Service.getAllByDb();
               //�ϲ�1��6�ŵ�Ԫ��
               ws.mergeCells(0,0,8,0);
               //Ҫ���뵽��Excel�����кţ�Ĭ�ϴ�0��ʼ
                
               Label labelaccept = new Label(0,0,"����ר�����",cellFormat1);
               ws.addCell(labelaccept);
               //�ڶ��еĸ�ʽ����
               WritableFont font2 = new WritableFont(WritableFont.ARIAL,14,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED);  
               WritableCellFormat cellFormat2 = new WritableCellFormat(font2);  
               cellFormat2.setBackground(Colour.BLUE_GREY); 
               cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);   
               cellFormat2.setWrap(true);   
               cellFormat2.setAlignment(Alignment.CENTRE);   
               cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE);
               Label labelorder = new Label(0,1,"���",cellFormat2);
               Label labelname = new Label(1,1,"����Ȩ����",cellFormat2);
               Label labelnumber = new Label(2,1,"�������Ȩ�ǼǺ�",cellFormat2);
               Label labelowner= new Label(3, 1, "����Ȩ��",cellFormat2);//��ʾ��
               Label labelorg= new Label(4, 1, "���赥λ",cellFormat2);
               Label labeltime= new Label(5, 1, "����ʱ��",cellFormat2);
               Label labelperson= new Label(6, 1, "��Ա����",cellFormat2);
               Label labelper_level= new Label(7, 1, "��Ա����",cellFormat2);
               Label labelyear= new Label(8, 1, "���",cellFormat2);
               ws.addCell(labelorder);
               ws.addCell(labelname);
               ws.addCell(labelnumber);
               ws.addCell(labelowner);
               ws.addCell(labelorg);
               ws.addCell(labeltime);
               ws.addCell(labelperson);
               ws.addCell(labelper_level);
               ws.addCell(labelyear);
               //ʣ�µĸ�ʽ����
               WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.BLUE2);  
               WritableCellFormat cellFormat3 = new WritableCellFormat(font3);  
               cellFormat3.setAlignment(Alignment.CENTRE);  
               //cellFormat2.setBackground(Colour.PINK);  
               cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);  
               cellFormat3.setWrap(true); 
               for (int i = 0; i < list.size(); i++) {
                   
                   Label labelorder_i= new Label(0, i+2, i+"",cellFormat3);
                   Label labelname_i= new Label(1, i+2, list.get(i).getName(),cellFormat3);
                   Label labelnumber_i= new Label(2, i+2, list.get(i).getNumber()+"",cellFormat3);
                   Label labelowner_i= new Label(3, i+2, list.get(i).getOwner(),cellFormat3);
                   Label labelorg_i= new Label(4, i+2, list.get(i).getOrg(),cellFormat3);
                   Label labeltime_i = new Label(5,i+2,list.get(i).getTime()+"",cellFormat3);
                   Label labelperson_i = new Label(6,i+2,list.get(i).getPerson()+"",cellFormat3);
                   Label labelper_level_i= new Label(7,i+2,list.get(i).getPer_level()+"",cellFormat3);
                   Label labelyear_i= new Label(8,i+2,list.get(i).getYear()+"",cellFormat3);
                   ws.addCell(labelorder_i);
                   ws.addCell(labelname_i);
                   ws.addCell(labelnumber_i);
                   ws.addCell(labelowner_i);
                   ws.addCell(labelorg_i);
                   ws.addCell(labeltime_i);
                   ws.addCell(labelperson_i);
                   ws.addCell(labelper_level_i);
                   ws.addCell(labelyear_i);
               }   
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    
    }
}