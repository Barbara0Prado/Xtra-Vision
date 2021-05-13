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

    public List<Film> showAllFilm() {
        List<Film> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean findFilm = false;

        try {
            stmt = con.prepareStatement("SELECT film.filmId, film.title, film.total, category.categoryName, film.filmTime FROM film INNER JOIN category ON film.category_filmId = category.categoryId");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film.setFilmId(rs.getInt("film.filmId"));
                film.setTitle(rs.getString("film.title"));
                film.setFilmTime(rs.getInt("film.filmTime"));
                film.setCategoryName(rs.getString("category.categoryName"));
                film.setTotal(rs.getInt("film.total"));
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
            stmt = con.prepareStatement("SELECT film.filmId, film.title,film.total, category.categoryName, film.filmTime\n" +
                             "FROM film INNER JOIN category ON film.category_filmId = category.categoryId AND film.title LIKE ?");

            stmt.setString(1, "%" + filmTitle + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {
                Film film = new Film();
                film .setFilmId(rs.getInt("film.filmId"));
                film.setTitle(rs.getString("film.title"));
                film.setFilmTime(rs.getInt("film.filmTime"));
                film.setCategoryName(rs.getString("category.categoryName"));
                film.setTotal(rs.getInt("film.total"));
             
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

}
