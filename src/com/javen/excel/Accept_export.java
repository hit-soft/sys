package com.javen.excel;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import com.javen.entity.accept;
import com.javen.service.Accept_Service;

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

public class Accept_export {

    public static void main(String[] args) {
        Accept_export accept_cel = new Accept_export();
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
            
            WritableSheet accept_ws = wwb.createSheet("科研项目验收情况", 0);
            accept_cel.toexcel(accept_ws);
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
               List<accept> list= Accept_Service.getAllByDb();
               //合并1到6号单元格
               ws.mergeCells(0,0,15,0);
               //要插入到的Excel表格的行号，默认从0开始
                
               Label labelaccept = new Label(0,0,"科研项目验收情况",cellFormat1);
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
               Label labelname= new Label(1, 1, "项目名称",cellFormat2);//表示第
               Label labelsource= new Label(2, 1, "项目来源",cellFormat2);
               Label labelleader= new Label(3, 1, "项目负责人",cellFormat2);
               Label labelstart= new Label(4, 1, "开始时间",cellFormat2);
               Label labelend= new Label(5, 1, "结束时间",cellFormat2);
               Label labelcontract= new Label(6, 1, "合同额",cellFormat2);
               Label labeltype = new Label(7,1,"类型",cellFormat2);
               Label labeltime= new Label(8, 1, "验收时间",cellFormat2);//表示第
               Label labelorg= new Label(9, 1, "鉴定验收组织单位",cellFormat2);
               Label labelnumber= new Label(10, 1, "课题合同号",cellFormat2);
               Label labelcard= new Label(11, 1, "经费卡号",cellFormat2);
               Label labelperson= new Label(12, 1, "参与人员",cellFormat2);
               Label labelper_level= new Label(13, 1, "人员等级",cellFormat2);
               Label labelremark= new Label(14, 1, "备注",cellFormat2);
               Label labelyear = new Label(15,1,"年份",cellFormat2);
               ws.addCell(labelorder);
               ws.addCell(labelname);
               ws.addCell(labelsource);
               ws.addCell(labelleader);
               ws.addCell(labelstart);
               ws.addCell(labelend);
               ws.addCell(labelcontract);
               ws.addCell(labeltype);
               ws.addCell(labeltime);
               ws.addCell(labelorg);
               ws.addCell(labelnumber);
               ws.addCell(labelcard);
               ws.addCell(labelperson);
               ws.addCell(labelper_level);
               ws.addCell(labelremark);
               ws.addCell(labelyear);
               //剩下的格式设置
               WritableFont font3 = new WritableFont(WritableFont.ARIAL,10,WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE,Colour.BLUE2);  
               WritableCellFormat cellFormat3 = new WritableCellFormat(font3);  
               cellFormat3.setAlignment(Alignment.CENTRE);  
               //cellFormat2.setBackground(Colour.PINK);  
               cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);  
               cellFormat3.setWrap(true); 
               for (int i = 0; i < list.size(); i++) {
                   
                   Label labelorder_i= new Label(0, i+2, i+1+"",cellFormat3);
                   Label labelname_i= new Label(1, i+2, list.get(i).getName(),cellFormat3);
                   Label labelsource_i= new Label(2, i+2, list.get(i).getSource(),cellFormat3);
                   Label labelleader_i= new Label(3, i+2, list.get(i).getLeader(),cellFormat3);
                   Label labelstart_i = new Label(4,i+2,list.get(i).getStart(),cellFormat3);
                   Label labelend_i = new Label(5,i+2,list.get(i).getEnd(),cellFormat3);
                   Label labelcontract_i= new Label(6,i+2,list.get(i).getContract()+"",cellFormat3);
                   Label labeltype_i= new Label(7, i+2, list.get(i).getType(),cellFormat3);
                   Label labeltime_i= new Label(8, i+2, list.get(i).getTime(),cellFormat3);
                   Label labelorg_i= new Label(9, i+2, list.get(i).getOrg(),cellFormat3);
                   Label labelnumber_i= new Label(10, i+2, list.get(i).getNumber()+"",cellFormat3);
                   Label labelcard_i = new Label(11,i+2,list.get(i).getCard(),cellFormat3);
                   Label labelperson_i = new Label(12,i+2,list.get(i).getPerson(),cellFormat3);
                   Label labelper_level_i= new Label(13,i+2,list.get(i).getPer_level()+"",cellFormat3);
                   Label labelremark_i= new Label(14,i+2,list.get(i).getRemark(),cellFormat3);
                   Label labelyear_i= new Label(15,i+2,list.get(i).getYear()+"",cellFormat3);
                   ws.addCell(labelorder_i);
                   ws.addCell(labelname_i);
                   ws.addCell(labelsource_i);
                   ws.addCell(labelleader_i);
                   ws.addCell(labelstart_i);
                   ws.addCell(labelend_i);
                   ws.addCell(labelcontract_i);
                   ws.addCell(labeltype_i);
                   ws.addCell(labeltime_i);
                   ws.addCell(labelorg_i);
                   ws.addCell(labelnumber_i);
                   ws.addCell(labelcard_i);
                   ws.addCell(labelperson_i);
                   ws.addCell(labelper_level_i);
                   ws.addCell(labelremark_i);
                   ws.addCell(labelyear_i);
               }
             
              
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    
    }
}