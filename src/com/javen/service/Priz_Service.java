package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.priz;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Priz_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<priz> getAllByDb(){
        List<priz> list=new ArrayList<priz>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from priz";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String type=rs.getString("type");
                String level= rs.getString("level");
                String time=rs.getString("time");
                String person = rs.getString("person");
                int per_level = rs.getInt("per_level");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new priz(name,type,level,time,person,per_level,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}