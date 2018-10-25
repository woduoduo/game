package com.lingxiu.game.dbpool;

import com.mysql.jdbc.Connection;

import java.util.LinkedList;
import java.util.Vector;

/**
 * 自定义数据库连接池
 *
 * @author lingxiu 2018/10/18 11:04
 */
public class DbConnectionPool {

    private String jdbcDriver = "";
    private String dbUrl = "";
    private String dbName = "";
    private String dbPsw = "";

    private int initSize = 5;
    private int addSize = 5;
    private int minSize = 5;
    private int maxSize = 10;
    private Vector<Connection> dbPool = null;

    public DbConnectionPool() {
    }
    public DbConnectionPool(String driverName, String url, String name, String psw) {
        this.jdbcDriver = driverName;
        this.dbUrl = url;
        this.dbName = name;
        this.dbPsw = psw;
    }
}
