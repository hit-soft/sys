package com.javen.excel;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.javen.entity.team;
import com.javen.service.StuService;

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

public class Team_export {

    public static void main(String[] args) {
        Team_export team_cel = new Team_export();
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
            
            WritableSheet accept_ws = wwb.createSheet("ѧ������", 0);
            team_cel.toexcel(accept_ws);
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
               List<team> list= StuService.getAllByDb();
               //�ϲ�1��6�ŵ�Ԫ��
               ws.mergeCells(0,0,6,0);
               //Ҫ���뵽��Excel�����кţ�Ĭ�ϴ�0��ʼ
                
               Label labelteam = new Label(0,0,"ѧ�������ְ���",cellFormat1);
               ws.addCell(labelteam);
               //�ڶ��еĸ�ʽ����
               WritableFont font2 = new WritableFont(WritableFont.ARIAL,14,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED);  
               WritableCellFormat cellFormat2 = new WritableCellFormat(font2);  
               cellFormat2.setBackground(Colour.BLUE_GREY); 
               cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);   
               cellFormat2.setWrap(true);   
               cellFormat2.setAlignment(Alignment.CENTRE);   
               cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE); 
               Label labelname= new Label(0, 1, "����(name)",cellFormat2);//��ʾ��
               Label labelpost= new Label(1, 1, "ְλ(post)",cellFormat2);
               Label labelstart= new Label(2, 1, "��ʼʱ��(start)",cellFormat2);
               Label labelend= new Label(3, 1, "����ʱ��(end)",cellFormat2);
               Label labelperson= new Label(4, 1, "��Ա(person)",cellFormat2);
               Label labeltype= new Label(5, 1, "����(type)",cellFormat2);
               Label labelyear = new Label(6,1,"���(year)",cellFormat2);
               
               ws.addCell(labelname);
               ws.addCell(labelpost);
               ws.addCell(labelstart);
               ws.addCell(labelend);
               ws.addCell(labelperson);
               ws.addCell(labeltype);
               ws.addCell(labelyear);
               //ʣ�µĸ�ʽ����
               WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.BLUE2);  
               WritableCellFormat cellFormat3 = new WritableCellFormat(font3);  
               cellFormat3.setAlignment(Alignment.CENTRE);  
               //cellFormat2.setBackground(Colour.PINK);  
               cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);  
               cellFormat3.setWrap(true); 
               for (int i = 0; i < list.size(); i++) {
                   
                   Label labelname_i= new Label(0, i+2, list.get(i).getName()+"",cellFormat3);
                   Label labelpost_i= new Label(1, i+2, list.get(i).getPost(),cellFormat3);
                   Label labelstart_i= new Label(2, i+2, list.get(i).getStart(),cellFormat3);
                   Label labelend_i= new Label(3, i+2, list.get(i).getEnd()+"",cellFormat3);
                   Label labelperson_i = new Label(4,i+2,list.get(i).getPerson(),cellFormat3);
                   Label labeltype_i = new Label(5,i+2,list.get(i).getType(),cellFormat3);
                   Label labelyear_i= new Label(6,i+2,Integer.toString(list.get(i).getYear()),cellFormat3);
                   ws.addCell(labelname_i);
                   ws.addCell(labelpost_i);
                   ws.addCell(labelstart_i);
                   ws.addCell(labelend_i);
                   ws.addCell(labelperson_i);
                   ws.addCell(labeltype_i);
                   ws.addCell(labelyear_i);
               }
             
              
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    
    }
}