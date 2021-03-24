
package test;

import entities.Category;
import entities.Film;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import model.FilmDAO;

public class TestFilm {
    
    public static void main(String[] args) {
        
        Category filmCategory = new Category();
        filmCategory.setCategoryId(1);// category 1 == Action
        
        Film film = new Film(filmCategory);// category association
        film.setItemTitle("Ava");
        film.setFilmTime(97);
        film.setItemPrice(3.49);
        film.setItemRentPeriod(5);
        film.setFilmDirector("Tates Taylor");
        film.setItemSynopsis("An assassin becomes marked for death by her own black" +
                "ops organization after questioning orders and breaking protocol.");
        
//        if(FilmDAO.insert(film)){
//            JOptionPane.showMessageDialog(null, "Film inserted successfully");
//        }else{
//            JOptionPane.showMessageDialog(null, "Error to insert film");
//        }
//       
        
        if(FilmDAO.change(film)){
            JOptionPane.showMessageDialog(null, "Film changed successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Error to change film");
        }
       
        
        
        
        
        System.out.println(FilmDAO.list());
    }
}
