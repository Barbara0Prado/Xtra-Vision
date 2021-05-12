
package DAO;

import model.Card;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CardDAO {
    
        public void checkCardInfo(int cardId, String cardNumber) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT film.filmId, film.total, card.cardID, card.cardNumber, card.cardCredit\n"
                    + "FROM film INNER JOIN category ON film.category_filmId = category.categoryId INNER JOIN card ON card.client_clientCard = card.cardNumber\n");
            stmt.setString(1, cardNumber);
            stmt.setInt(2, cardId);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Successful Payment.", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There was an error with your card information.", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("Error CardDAO: " + ex);
        }
    }
        
        public boolean checkCreditCard(String cardNumber) {
        //VERIFICAR O NOME QUE VAI SER CADASTRADO
        boolean validCard = false;

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT cardNumber FROM card WHERE cardNumber LIKE ?");
            stmt.setString(1, cardNumber);
            rs = stmt.executeQuery();

            while (rs.next()) {
                validCard = true;
            }

        } catch (SQLException ex) {
            System.err.println("CardDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return validCard;
    }
    
}
