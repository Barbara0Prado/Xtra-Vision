
package DAO;

import model.Card;
import model.Film;
import view.ViewFilmSearch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CardDAO {
        
        public boolean checkCreditCard(String cardNumber) {
            
        //VERIFICAR O NOME QUE VAI SER CADASTRADO
        boolean validCard = false;
        int saveCredit = -1;
        int filmPrice = -1;

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT cardCredit \n" +
                                        "FROM card WHERE cardNumber = ? ");
            stmt.setString(1, cardNumber);
            rs = stmt.executeQuery();
            con.setAutoCommit(false);

            while (rs.next()) {
                validCard = true;
                saveCredit = rs.getInt(1);
                
                System.out.println("Check 1");
            }
            
                if(validCard == true && saveCredit > 0) {
                     PreparedStatement stmt2 = null;
                     ResultSet rs2 = null;
            
                     stmt2 = con.prepareStatement("SELECT filmPrice \n" +
                                        "FROM film WHERE filmId = ? ");
                     
                     stmt2.setInt(1, Film.saveId);
                     rs2 = stmt2.executeQuery();

            while (rs2.next()) {
                filmPrice = rs2.getInt(1);
                System.out.println("Check 2");
                
            }  
           //aqui
            
            //Retirada do credito e valor do filme
            if (saveCredit >= filmPrice) {
                
                     PreparedStatement stmt3 = null;
                     ResultSet rs3 = null;
            
                     stmt3 = con.prepareStatement("UPDATE card SET cardCredit = cardCredit - ? WHERE cardId = ?");
                     stmt3.setInt(1, filmPrice);
                     stmt3.setInt(2, Film.saveId);
                     stmt3.executeUpdate();
                     
                     con.commit();
                     
                     rs3 = stmt3.getResultSet();
                     
                     System.out.println(stmt3.getParameterMetaData());
                     
                     //okay                    
            }
            
            }

        } catch (SQLException ex) {
            System.err.println("CardDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return validCard;
    }
    
}
