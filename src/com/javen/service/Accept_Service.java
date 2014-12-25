package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.accept;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Accept_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<accept> getAllByDb(){
        List<accept> list=new ArrayList<accept>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from accept";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String source=rs.getString("source");
                String leader=rs.getString("leader");
                String start = rs.getString("start");
                String end = rs.getString("end");
                double contract = rs.getDouble("contract");
                String type=rs.getString("type");
                String time=rs.getString("time");
                String org=rs.getString("org");
                int number = rs.getInt("number");
                String card = rs.getString("card");
                String person = rs.getString("person");
                int per_level = rs.getInt("per_level");
                String remark = rs.getString("remark");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new accept(name, source, leader,start,end,contract,type,time,org,number,card,person,per_level,remark,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}