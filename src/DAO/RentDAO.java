
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Rent;
import model.Client;


public class RentDAO {
    
    


    public void registerNewRent(Rent rent) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO rent VALUES(0, ?, ?, ?)");
            
            stmt.setInt(1, rent.getRentClient());
            stmt.setString(2, rent.getRentDate());
            stmt.setString(3, rent.getReturnDate());

            if (stmt.executeUpdate() >= 1) {
                JOptionPane.showMessageDialog(null, "Rent made successfully", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to try to rent this title", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public List<Rent> showAllRent() {
        List<Rent> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM rent");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Rent rent = new Rent();
                rent.setRentId(rs.getInt("rentId"));
                rent.setRentClient(rs.getInt("clientId"));
                rent.setRentDate(rs.getString("rentDate"));
                rent.setReturnDate(rs.getString("returnDate"));

                list.add(rent);
            }
        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Rent> searchByRentId(int RentId) {
        List<Rent> list = new ArrayList<>();
        boolean existId = false;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM rent WHERE rentId = ?");
            stmt.setInt(1, RentId);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Rent rent = new Rent();
                
                rent.setRentId(rs.getInt("rentId"));
                rent.setRentClient(rs.getInt("clientId"));
                rent.setRentDate(rs.getString("rentDate"));
                rent.setReturnDate(rs.getString("returnDate"));

                list.add(rent);
                                          
                existId = true;
            }

            if (!existId) {
                JOptionPane.showMessageDialog(null, "Rent Id not found", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

   

    public List<Rent> searchByClientId(int ClientId) {
        List<Rent> list = new ArrayList<>();
        boolean existId = false;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM rent WHERE clientId = ?");
            stmt.setInt(1, ClientId);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Rent rent = new Rent();
                rent.setRentId(rs.getInt("rentId"));
                rent.setRentClient(rs.getInt("clientId"));
                rent.setRentDate(rs.getString("rentDate"));
                rent.setReturnDate(rs.getString("returnDate"));

                list.add(rent);
                existId = true;
            }

            if (!existId) {
                JOptionPane.showMessageDialog(null, "Rent Id not found", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public void renewRent(int rentId, String rentDate) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE rent SET returnDate = ? WHERE rentId = ?");
            stmt.setString(1, rentDate);
            stmt.setInt(2, rentId);
            if (stmt.executeUpdate() >= 1) {
                JOptionPane.showMessageDialog(null, "Renewal made successfully!", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to try to renew", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }

    }

    public void returnFilm(int rentId) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM rent WHERE rentId = ?");
            stmt.setInt(1, rentId);

            if (stmt.executeUpdate() >= 1) {
                JOptionPane.showMessageDialog(null, "Return made successfully", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to try to return", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }

    }

    //Verifica quantas devoluções tem para hoje
    public int verifyTotalOfReturn(String currentDate) {
        int total = 0;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT COUNT(rentId) as total FROM rent"
                    + " WHERE returnDate = ?");
            stmt.setString(1, currentDate);
            rs = stmt.executeQuery();

            while (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            System.err.println("RentDAO: " + ex);
        } finally {

        }
        return total;
    }

}

    

