package DAO;

import model.Film;
import model.Rent;
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
            stmt = con.prepareStatement("INSERT INTO film VALUES(0, ?, ?, ?)");
            stmt.setString(1, film.getTitle());
            stmt.setInt(2, film.getFilmTime());
            stmt.setInt(3, film.getCategoryId());

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

    public List<Film> showAllFilm() {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT film.filmId, film.title, category.categoryName, film.filmTime\n "
                    + "FROM film INNER JOIN category ON film.category_filmId = category.categoryId\n");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film.setFilmId(rs.getInt("film.filmId"));
                film.setTitle(rs.getString("film.title"));
                film.setFilmTime(rs.getInt("film.filmTime"));
                film.setCategoryName(rs.getString("category.categoryName"));
                
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

    public Film searchById(int filmId) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;
        Film film = null;

        try {
            stmt = con.prepareStatement("SELECT f.filmId, f.title, \n"
                    + "f.filmTime,  f.category_filmId, cat.categoryName, cat.categoryId, \n"
                    + "f.synopsis, f.filmDirector, f.filmPrice "
                    + "FROM film AS f, category as cat \n"
                    + "WHERE f.category_filmId = cat.categoryId \n"
                    + "AND f.filmId = ?");
            
            
            
            stmt.setInt(1, filmId);

            rs = stmt.executeQuery();

            while (rs.next()) {
                film = new Film();
                film .setFilmId(rs.getInt("f.filmId"));
                film.setTitle(rs.getString("f.title"));
                film.setFilmTime(rs.getInt("f.filmTime"));
                film.setCategoryName(rs.getString("cat.categoryName"));
                film.setFilmDirector(rs.getString("f.filmDirector"));
                film.setSynopsis(rs.getString("f.synopsis"));
                film.setPrice(rs.getDouble("f.filmPrice"));
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

        return film;
    }

    public List<Film> searchByTitle(String filmTitle) {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT film.filmId, film.title, category.categoryName, film.filmTime\n" +
                             "FROM film INNER JOIN category ON film.category_filmId = category.categoryId AND film.title LIKE ?");

            stmt.setString(1, "%" + filmTitle + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film .setFilmId(rs.getInt("film.filmId"));
                film.setTitle(rs.getString("film.title"));
                film.setFilmTime(rs.getInt("film.filmTime"));
                film.setCategoryName(rs.getString("category.categoryName"));
             
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
            stmt = con.prepareStatement("SELECT film.filmId, \n" +
                                        "film.title, \n" +
                                        "film.filmTime, \n" +
                                        "film.category_filmId, \n" +
                                        "category.categoryName, \n" +
                                        "rent.rentPrice \n" +
                                        "FROM film \n" +
                                        "INNER JOIN category \n" +
                                        "ON film.category_filmId = category.categoryId\n" +
                                        "INNER JOIN rent\n" +
                                        "ON rent.rentId");
            stmt.setInt(1, FilmId);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                Rent rent = new Rent();
                film.setFilmId(rs.getInt("film.filmId"));
                film.setTitle(rs.getString("film.title"));
                film.setFilmTime(rs.getInt("film.filmTime"));
                film.setCategoryId(rs.getInt("film.category_filmId"));
                film.setCategoryName(rs.getString("category.categoryName"));
                rent.setRentPrice(rs.getDouble("rent.rentPrice"));
               
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
            stmt = con.prepareStatement("UPDATE film SET title = ?, filmTime = ?, categoryId = ?,"
                    + " WHERE filmId = ?");
            stmt.setString(1, film.getTitle());
            stmt.setInt(2, film.getFilmTime());
            stmt.setInt(3, film.getCategoryId());
            stmt.setInt(4, film.getFilmId());

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
