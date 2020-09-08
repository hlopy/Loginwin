package com.cao.service.test;

import com.cao.service.utils.JdbcUtils;
import org.junit.Test;

public class Jdbcutilstest {

    @Test
    public void testulis(){

        System.out.println(JdbcUtils.getConnection());
    }
}
