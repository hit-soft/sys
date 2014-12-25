package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.team;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class StuService {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<team> getAllByDb(){
        List<team> list=new ArrayList<team>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from team";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String post=rs.getString("post");
                String start=rs.getString("start");
                String end = rs.getString("end");
                String person = rs.getString("person");
                String type = rs.getString("type");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new team(name, post, start, end,person,type,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}