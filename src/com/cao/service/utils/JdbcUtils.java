package com.cao.service.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {


    private static DruidDataSource dataSource;

    static {

        try {
            //创建数据库 连接池
            Properties properties = new Properties();
            //读取jdbc.properties配置文件属性
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(inputStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    /**
     * 获取数据池连接
     * 如果返回null  就失败
     * @return
     */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    /**
     * 关闭数据库
     * @param conn
     */
    public static void close(Connection conn){

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
