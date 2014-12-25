package com.javen.excel;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.javen.entity.study;
import com.javen.service.Study_Service;

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

public class Study_export{

    public static void main(String[] args) {
        Study_export patent_cel = new Study_export();
        try {
            WritableWorkbook wwb = null;
          
            // 创建可写入的Excel工作簿
            Calendar ca = Calendar.getInstance();
            String fileName = "D://ICES研究中心科研项目统计"+ca.get(Calendar.YEAR)+"年"+ca.get(Calendar.MONTH)+"月"+ca.get(Calendar.DATE)+"日"+".xls";
            File file=new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            //以fileName为文件名来创建一个Workbook
            wwb = Workbook.createWorkbook(file);

            // 创建工作表
            
            WritableSheet patent_ws = wwb.createSheet("国内外进修及学习情况", 0);
            patent_cel.toexcel(patent_ws);
           //写进文档
            wwb.write();
           // 关闭Excel工作簿对象
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
               //第一列的格式设置
               WritableFont font1 = new WritableFont(WritableFont.ARIAL,20,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED);  
               
               WritableCellFormat cellFormat1 = new WritableCellFormat(font1);  
               //设置背景颜色;  
               //cellFormat1.setBackground(Colour.BLUE_GREY);  
               //设置边框;  
               cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);  
               //设置自动换行;  
               cellFormat1.setWrap(true);  
               //设置文字居中对齐方式;  
               cellFormat1.setAlignment(Alignment.CENTRE);  
               //设置垂直居中;  
               cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);  
               //查询数据库中所有的数据
               List<study> list= Study_Service.getAllByDb();
               //合并1到6号单元格
               ws.mergeCells(0,0,6,0);
               //要插入到的Excel表格的行号，默认从0开始
                
               Label labelaccept = new Label(0,0,"国内外进修及学习情况",cellFormat1);
               ws.addCell(labelaccept);
               //第二列的格式设置
               WritableFont font2 = new WritableFont(WritableFont.ARIAL,14,WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.RED);  
               WritableCellFormat cellFormat2 = new WritableCellFormat(font2);  
               cellFormat2.setBackground(Colour.BLUE_GREY); 
               cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);   
               cellFormat2.setWrap(true);   
               cellFormat2.setAlignment(Alignment.CENTRE);   
               cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE);
               Label labelorder = new Label(0,1,"序号",cellFormat2);
               Label labelorg = new Label(1,1,"进修学习单位",cellFormat2);
               Label labelsubstance = new Label(2,1,"进修学习内容",cellFormat2);
               Label labelstart= new Label(3, 1, "开始时间",cellFormat2);//表示第
               Label labelend= new Label(4, 1, "结束时间",cellFormat2);
               Label labelperson= new Label(5, 1, "人员姓名",cellFormat2);
               Label labelyear= new Label(6, 1, "年份",cellFormat2);
               ws.addCell(labelorder);
               ws.addCell(labelorg);
               ws.addCell(labelsubstance);
               ws.addCell(labelstart);
               ws.addCell(labelend);
               ws.addCell(labelperson);
               ws.addCell(labelyear);
               //剩下的格式设置
               WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.BLUE2);  
               WritableCellFormat cellFormat3 = new WritableCellFormat(font3);  
               cellFormat3.setAlignment(Alignment.CENTRE);  
               //cellFormat2.setBackground(Colour.PINK);  
               cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);  
               cellFormat3.setWrap(true); 
               for (int i = 0; i < list.size(); i++) {
                   
                   Label labelorder_i= new Label(0, i+2, i+"",cellFormat3);
                   Label labelorg_i= new Label(1, i+2, list.get(i).getOrg(),cellFormat3);
                   Label labelsubstance_i= new Label(2, i+2, list.get(i).getSubstance()+"",cellFormat3);
                   Label labelstart_i= new Label(3, i+2, list.get(i).getStart(),cellFormat3);
                   Label labelend_i= new Label(4, i+2, list.get(i).getEnd(),cellFormat3);
                   Label labelperson_i = new Label(5,i+2,list.get(i).getPerson()+"",cellFormat3);
                   Label labelyear_i = new Label(6,i+2,list.get(i).getYear()+"",cellFormat3);
                   ws.addCell(labelorder_i);
                   ws.addCell(labelorg_i);
                   ws.addCell(labelsubstance_i);
                   ws.addCell(labelstart_i);
                   ws.addCell(labelend_i);
                   ws.addCell(labelperson_i);
                   ws.addCell(labelyear_i);
               }   
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    
    }
}