
package model;

import entities.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CategoryDAO {
    public static boolean insert(Category category){
        
        try {
            Connection connect = Connect.getConnect();
            String sql ="INSERT INTO category (name, type) "
                    + "VALUES (?, ?)"; 
            PreparedStatement command = connect.prepareStatement(sql);
            command.setString(1, category.getCategoryName());
            command.setString(2, String.valueOf( category.getCategoryType()));
            command.execute();
            command.close();
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
    
    }
    
    public static boolean change(Category category){
    
        try {
            Connection connect = Connect.getConnect();
            String sql = "UPDATE category SET " 
                    + " name= ?"
                    + " type = ?" 
                    + " WHERE id = ?";
            
            PreparedStatement command = connect.prepareStatement(sql);
            command.setString(1, category.getCategoryName());
            command.setString(2, String.valueOf(category.getCategoryType()));
            command.setInt(3, category.getCategoryId());
            
            
            int nrLines = command.executeUpdate();
            command.close();
            return nrLines > 0;
            
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public static boolean delete(int id){
    
        try {
            Connection connect = Connect.getConnect();
            String sql = "DELETE FROM category WHERE id = ?";
            PreparedStatement command = connect.prepareStatement(sql);
            command.setInt(1, id);
            int nrLines = command.executeUpdate();
            command.close();
            return nrLines > 0;
            
            
        } catch (Exception e) {
            
            return false ;
        }
    } 
    
    public static ArrayList<Category>list(){
    
        ArrayList<Category> categories = new ArrayList<Category>();
        
        try {
            Connection connect = Connect.getConnect();
            String sql = "SELECT * FROM category";
            
            Statement command = connect.createStatement();
            ResultSet result = command.executeQuery(sql);
            while(result.next()){
                Category cat = new Category();
                cat.setCategoryId(result.getInt("id"));
                cat.setCategoryName(result.getString("name"));
                cat.setCategoryType(result.getString("type").charAt(0));
                categories.add(cat);
                
            }
            result.close();
            command.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return categories;
    }
          
    
}
