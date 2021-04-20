package DAO;

import model.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FilmDAO {

     // Talvez de erro no codigo //
  
    public static ArrayList<Film> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public void insertFilm (Film film) {
        
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO film VALUES(0, ?, ?, ?, ?)");
            stmt.setString(1, film.getTitle());
            stmt.setInt(2, film.getYear());
            stmt.setInt(3, film.getFilmTime());
            stmt.setInt(4, film.getCategoryId());

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Film insert successfully!","Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to insert film!", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("FilmDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public int getLastResgister() {
        int code = 0;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT MAX(filmId) FROM film");
            rs = stmt.executeQuery();

            while (rs.next()) {
                code = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Film DAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }

        return (code + 1);
    }

    public List<Film> showAllFilms() {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT f.filmId, f.title, f.year\n"
                    + "f.filmTime,  f.categoryId, cat.categoryName, cat.CategoryId\n"
                    + "FROM film AS f, category as cat \n"
                    + "WHERE f.categoryId = cat.categoryId");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film .setFilmId(rs.getInt("f.filmId"));
                film.setTitle(rs.getString("f.title"));
                film.setYear(rs.getInt("f.year"));
                film.setFilmTime(rs.getInt("f.filmTime"));
                film.setCategoryName(rs.getString("cat.name"));
                
                list.add(film);
                findFilm = true;
            }

            if (!findFilm) {
                JOptionPane.showMessageDialog(null, "This title was not found",
                        "Xtra-Vision", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("FilmDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Film> searchById(int filmId) {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT f.filmId, f.title, f.year\n"
                    + "f.filmTime,  f.categoryId, cat.categoryName, cat.CategoryId\n"
                    + "FROM film AS f, category as cat \n"
                    + "WHERE f.categoryId = cat.categoryId = ?");
            
            
            
            stmt.setInt(1, filmId);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film .setFilmId(rs.getInt("f.filmId"));
                film.setTitle(rs.getString("f.title"));
                film.setYear(rs.getInt("f.year"));
                film.setFilmTime(rs.getInt("f.filmTime"));
                film.setCategoryName(rs.getString("cat.name"));
                list.add(film);
                findFilm = true;
            }

            if (!findFilm) {
                JOptionPane.showMessageDialog(null, "No title was foud",
                        "Xtra-Vision", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("FilmDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Film> searchByTitle(String filmTitle) {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT f.filmId, f.title, f.year,\n"
                    + "f.filmTime,  f.categoryId, cat.categoryName, cat.CategoryId\n"
                    + "FROM film AS f, category as cat\n"
                    + "WHERE f.categoryId = cat.categoryId AND f.title LIKE ?");

            stmt.setString(1, "%" + filmTitle + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film .setFilmId(rs.getInt("f.filmId"));
                film.setTitle(rs.getString("f.title"));
                film.setYear(rs.getInt("f.year"));
                film.setFilmTime(rs.getInt("f.filmTime"));
                film.setCategoryName(rs.getString("cat.name"));
             
                 list.add(film);
                findFilm = true;
            }

            if (!findFilm) {
                JOptionPane.showMessageDialog(null, "No title was found",
                        "Xtra-Vision", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("FilmDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Film> listFilmId() {
        List<Film> list = new ArrayList<>();

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT f.title, f.filmId FROM film as f WHERE f.filmId ");
            rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    Film film = new Film();

                    film.setFilmId(rs.getInt("filmid"));
                    film.setTitle(rs.getString("f.title"));
                    list.add(film);
                }

            }
        } catch (SQLException ex) {
            System.err.println("ClientDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Film> gettingBackFilmData(int FilmId) {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT f.filmId, f.title, f.year, "
                    + "f.filmTime, cat.name, f.categoryId "
                    + "FROM filme AS f "
                    + "JOIN category AS cat "
                    + " WHERE f.idfilme = ?");
            stmt.setInt(1, FilmId);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film.setFilmId(rs.getInt("f.filmId"));
                film.setTitle(rs.getString("f.title"));
                film.setYear(rs.getInt("f.year"));
                film.setFilmTime(rs.getInt("f.filmTime"));
                film.setCategoryName(rs.getString("cat.name"));
                film.setCategoryId(rs.getInt("f.categoryId"));
               
                list.add(film);
            }
        } catch (SQLException ex) {
            System.err.println("ClientDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public void changeFilmData(Film film) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE film SET title = ?, year = ?, filmTime = ?, categoryId = ?,"
                    + " WHERE filmId = ?");
            stmt.setString(1, film.getTitle());
            stmt.setInt(2, film.getYear());
            stmt.setInt(3, film.getFilmTime());
            stmt.setInt(4, film.getCategoryId());
            stmt.setInt(7, film.getFilmId());

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Data changed successfuly", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to change the data", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("FilmDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

     

    public void deleteFilm(int filmId) {

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("DELETE FROM film WHERE filmId = ?");
            stmt.setInt(1, filmId);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Film successfully deleted ", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
                          
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error to try deleting the film", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }


   
    

}
