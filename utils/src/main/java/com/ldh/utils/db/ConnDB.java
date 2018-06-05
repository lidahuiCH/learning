package com.ldh.utils.db;

import java.sql.*;

/**
 * Created on 2018/6/5.
 */
public class ConnDB {
    private static Connection conn = null;

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/axt?useUnicode=true&characterEncoding=UTF-8";

    private static final String USER_NAME = "root";

    private static final String PASSWORD = "root";

    public static Connection getConn() {
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static Connection establishConn() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    /**
     * 关闭连接
     *
     * @param conn
     * @throws SQLException
     */
    public static void close(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }

    /**
     * 关闭PreparedStatement
     *
     * @param pstmt
     * @throws SQLException
     */
    public static void close(PreparedStatement pstmt) throws SQLException {
        if (pstmt != null) {
            pstmt.close();
            pstmt = null;
        }
    }

    /**
     * 关闭结果集
     *
     * @param rs
     * @throws SQLException
     */
    public static void close(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
            rs = null;
        }
    }
}
