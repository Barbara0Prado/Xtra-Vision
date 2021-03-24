
package model;

import entities.Category;
import entities.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
    
    public static List <Film> list() {
        List<Film> list = new ArrayList<Film>();
        try {
            String sql = "SELECT film. *,"
                    + "     category.name as category, "
                    + "     category.type "
                    + "FROM film " 
                    + "INNER JOIN category ON film.category_id = category.id";
            Connection connect = Connect.getConnect();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
          
            while (rs.next()) {                
                Category category = new Category();
                category.setCategoryId(rs.getInt("category_id"));
                category.setCategoryName(rs.getString("category"));
                category.setCategoryType(rs.getString("type").charAt(0));
                
                Film film = new Film (category);
                film.setItemId(rs.getInt("id"));
                film.setItemSynopsis(rs.getString("synopsis"));
                film.setFilmDirector(rs.getString("director"));
                film.setFilmTime(rs.getInt("time"));
                film.setItemRentPeriod(rs.getInt("rentalTime"));
                film.setItemPrice(rs.getDouble("price"));
                film.setItemTitle(rs.getString("title"));
                
                list.add(film);
                
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e) {
            System.out.println("FilmDAO.list");
            System.out.println(e.getMessage());
        }
        
        return list;
    }
    
    public static boolean insert(Film film){
        try {
            String sql = ("INSERT INTO film (title, synopsis, price, rentalTime"
                    + "director, time, category_id) VALUES"
                    + "(default,?,?,?,?,?,?,?)");
            Connection connect = Connect.getConnect(); 
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, film.getItemTitle());
            ps.setString(2, film.getItemSynopsis());
            ps.setDouble(3, film.getItemPrice());
            ps.setInt(4, film.getItemRentPeriod());
            ps.setString(5, film.getFilmDirector());
            ps.setInt(6, film.getFilmTime());
            ps.setInt(7, film.getItemCategory().getCategoryId());
            
            int inserted = ps.executeUpdate();
            
            
            ps.close();
            
            return inserted > 0;
            
        } catch (Exception e) {
            
            System.out.println("FilmDAO.insert:" + e.getMessage());
            return false;
        }
    }
    
    
    public static boolean change(Film film){
        try {
            String sql = "INSERT INTO film  SET title = ?, synopsis = ?, price = ?, rentalTime = ?"
                    + "director = ?, time = ? , category_id = ?)"
                    + "WHERE ID = ?";
            Connection connect = Connect.getConnect(); 
            PreparedStatement ps = connect.prepareStatement(sql);
            ps.setString(1, film.getItemTitle());
            ps.setString(2, film.getItemSynopsis());
            ps.setDouble(3, film.getItemPrice());
            ps.setInt(4, film.getItemRentPeriod());
            ps.setString(5, film.getFilmDirector());
            ps.setInt(6, film.getFilmTime());
            ps.setInt(7, film.getItemCategory().getCategoryId());
            ps.setInt(8, film.getItemId());
            
            int changed = ps.executeUpdate();
            
            
            ps.close();
            
            return changed > 0;
            
        } catch (Exception e) {
            
            System.out.println("FilmDAO.change:" + e.getMessage());
            return false;
        }
    }
    
}
