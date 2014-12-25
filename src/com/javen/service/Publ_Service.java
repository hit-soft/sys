package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.publ;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Publ_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<publ> getAllByDb(){
        List<publ> list=new ArrayList<publ>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from publ";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String press=rs.getString("press");
                String time=rs.getString("time");
                String person = rs.getString("person");
                int per_level = rs.getInt("per_level");
                String type = rs.getString("type");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new publ(name,press,time,person,per_level,type,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}