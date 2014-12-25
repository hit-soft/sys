package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.study;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Study_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<study> getAllByDb(){
        List<study> list=new ArrayList<study>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from study";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String org=rs.getString("org");
                String substance=rs.getString("substance");
                String start=rs.getString("start");
                String end = rs.getString("end");
                String person = rs.getString("person");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new study(org,substance,start,end,person,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}