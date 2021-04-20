
package view;

import javax.swing.JComboBox;
import xtra.vision.Menu;
import DAO.Connect;
import DAO.FilmDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Category;
import model.Film;


public class ViewCategory extends javax.swing.JFrame {
    ArrayList<Film> films;
    Connection con = Connect.getConnect();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public ViewCategory() {      
        initComponents();
        Fillcombo();
    }
    
    public void GettingFilmList() {
        films = FilmDAO.list();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBReturn = new javax.swing.JButton();
        jBCategories = new javax.swing.JButton();
        jBHome = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCSelectCategory = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFilms = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(1104, 543));

        jBReturn.setBackground(java.awt.Color.black);
        jBReturn.setForeground(java.awt.Color.white);
        jBReturn.setText("RETURN FILM");
        jBReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReturnActionPerformed(evt);
            }
        });

        jBCategories.setBackground(java.awt.Color.black);
        jBCategories.setForeground(java.awt.Color.white);
        jBCategories.setText("CATEGORIES");
        jBCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCategoriesActionPerformed(evt);
            }
        });

        jBHome.setBackground(java.awt.Color.black);
        jBHome.setForeground(java.awt.Color.white);
        jBHome.setText("HOME");
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });

        jLLogo.setBackground(java.awt.Color.white);
        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.jpeg"))); // NOI18N
        jLLogo.setText("jLabel2");

        jPanel4.setBackground(java.awt.Color.darkGray);
        jPanel4.setToolTipText("");
        jPanel4.setName("Select"); // NOI18N

        jCSelectCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category" }));
        jCSelectCategory.setName(""); // NOI18N
        jCSelectCategory.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCSelectCategoryAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jCSelectCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSelectCategoryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Categories");

        jTFilms.setForeground(java.awt.Color.white);
        jTFilms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Synopsis", "Director", "Time", "Price"
            }
        ));
        jTFilms.setToolTipText("Select");
        jScrollPane1.setViewportView(jTFilms);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCSelectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCSelectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBCategories, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBReturn, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jBCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jBReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.getAccessibleContext().setAccessibleName("Select");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCategoriesActionPerformed
        new ViewCategory().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBCategoriesActionPerformed

    private void jCSelectCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSelectCategoryActionPerformed
 
    }//GEN-LAST:event_jCSelectCategoryActionPerformed

    private void jBReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReturnActionPerformed
         new ViewReturnFilm().setVisible(true);
         dispose();
    }//GEN-LAST:event_jBReturnActionPerformed

    private void jCSelectCategoryAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCSelectCategoryAncestorAdded
       
        FilmDAO dao = new FilmDAO();
        List<Film> list = new ArrayList<>();
        
        
        
    }//GEN-LAST:event_jCSelectCategoryAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCategories;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBReturn;
    private javax.swing.JComboBox jCSelectCategory;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFilms;
    // End of variables declaration//GEN-END:variables
    
    public void Fillcombo() {
        try {
            stmt = con.prepareStatement("SELECT * FROM category ORDER BY categoryName");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                String categoryName = rs.getString("categoryName");
                jCSelectCategory.addItem(categoryName);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
