
package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connect {
    private static final String URL = "jdbc:mysql://52.50.23.197:3306/Junior_2019223?useSSL=false";
    private static final String USER = "Junior_2019223";
    private static final String PASS = "2019223";


    public static Connection getConnect(){
     
        try {
            Connection cnn = DriverManager.getConnection(URL, USER, PASS);
            return cnn;
        } catch (Exception e) {
            return null;
        }
    }
}
