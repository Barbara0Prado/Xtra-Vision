
package model;

import entities.Category;
import entities.Film;
import java.sql.Connection;
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
                category.setId(rs.getInt("category_id"));
                category.setName(rs.getString("category"));
                category.setType(rs.getString("type").charAt(0));
                
                Film film = new Film (category);
                film.setId(rs.getInt("id"));
                film.setSynopsis(rs.getString("synopsis"));
                film.setDirector(rs.getString("director"));
                film.setTime(rs.getInt("time"));
                film.setRentPeriod(rs.getInt("rentalTime"));
                film.setPrice(rs.getDouble("price"));
                film.setTitle(rs.getString("title"));
                
                list.add(film);
            }
        } catch (Exception e) {
            System.out.println("FilmDAO.list");
            System.out.println(e.getMessage());
        }
        
        return list;
    }
}
