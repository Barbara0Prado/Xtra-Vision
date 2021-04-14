
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Connect {
    private static final String URL = "jdbc:mysql://52.50.23.197:3306/Junior_2019223?useSSL=false";
    private static final String USER = "Junior_2019223";
    private static final String PASS = "2019223";


    public static Connection getConnect(){
     
        try {
            Connection connect = DriverManager.getConnection(URL, USER, PASS);
            return connect;
        } catch (Exception e) {
            return null;
        }
    }
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error to close connection." + ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error to close connection." + ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error to close connection." + ex);
        }
    }

}
