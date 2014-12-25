package com.javen.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javen.db.DBhepler;
import com.javen.entity.funds;

/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class Funds_Service {
    /**
     * 查询stu表中所有的数据
     * @return 
     */
    public static List<funds> getAllByDb(){
        List<funds> list=new ArrayList<funds>();
        try {
            DBhepler db=new DBhepler();
            String sql="select * from funds";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String source=rs.getString("source");
                String leader= rs.getString("leader");
                String start=rs.getString("start");
                String end = rs.getString("end");
                double contract = rs.getDouble("contract");
                double already = rs.getDouble("already");
                double non=rs.getDouble("non");
                int number = rs.getInt("number");
                String person = rs.getString("person");
                int per_level = rs.getInt("per_level");
                String type = rs.getString("type");
                int year = rs.getInt("year");
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new funds(name,source,leader,start,end,contract,already,non,number,person,per_level,type,year));
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }  
}