package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.coope;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Coope_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<coope> getAllByDb(){
        List<coope> list=new ArrayList<coope>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from coope";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String type=rs.getString("type");
                String out_pe=rs.getString("out_pe");
                String in_pe= rs.getString("in_pe");
                int num=rs.getInt("num");
                String start = rs.getString("start");
                String end = rs.getString("end");
                String out_pl = rs.getString("out_pl");
                String in_pl=rs.getString("in_pl");
                String goal=rs.getString("goal");
                String name=rs.getString("name");
                String invi_by = rs.getString("invi_by");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new coope(type, out_pe,in_pe, num,start,end,out_pl,in_pl,goal,name,invi_by,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}