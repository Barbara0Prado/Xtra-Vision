
package view;

import DAO.FilmDAO;
import javax.swing.table.DefaultTableModel;
import model.Film;
import xtra.vision.Menu;


public class ViewFilm extends javax.swing.JFrame {

    FilmDAO dao = new FilmDAO();
    
    public ViewFilm() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTViewFilm = new javax.swing.JTable();
        jBRentNow = new javax.swing.JButton();
        jBBack = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(1104, 543));

        jBReturn.setBackground(java.awt.Color.darkGray);
        jBReturn.setForeground(java.awt.Color.white);
        jBReturn.setText("RETURN FILM");
        jBReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReturnActionPerformed(evt);
            }
        });

        jBCategories.setBackground(java.awt.Color.darkGray);
        jBCategories.setForeground(java.awt.Color.white);
        jBCategories.setText("CATEGORIES");
        jBCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCategoriesActionPerformed(evt);
            }
        });

        jBHome.setBackground(java.awt.Color.darkGray);
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

        jTViewFilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Synopsis", "Category", "Director", "Time", "Price"
            }
        ));
        jTViewFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTViewFilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTViewFilm);

        jBRentNow.setBackground(java.awt.Color.darkGray);
        jBRentNow.setForeground(java.awt.Color.white);
        jBRentNow.setText("Rent Now");
        jBRentNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRentNowActionPerformed(evt);
            }
        });

        jBBack.setBackground(java.awt.Color.darkGray);
        jBBack.setForeground(java.awt.Color.white);
        jBBack.setText("Back");
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRentNow, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRentNow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jBSearch.setBackground(java.awt.Color.darkGray);
        jBSearch.setForeground(java.awt.Color.white);
        jBSearch.setText("SEARCH FILM");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jBCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jBReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReturnActionPerformed
        new ViewReturnFilm().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBReturnActionPerformed

    private void jBCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCategoriesActionPerformed
        new ViewCategory().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBCategoriesActionPerformed

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        new ViewFilmSearch().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
         new ViewFilmSearch().setVisible(true);
         dispose();
    }//GEN-LAST:event_jBBackActionPerformed

    private void jTViewFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTViewFilmMouseClicked
             if (jTViewFilm.getSelectedRow() != -1) {
                 jBRentNow.setEnabled(true);
             } else {
                 jBRentNow.setEnabled(false);
        }                                     
    }//GEN-LAST:event_jTViewFilmMouseClicked

    private void jBRentNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRentNowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRentNowActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBCategories;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBRentNow;
    private javax.swing.JButton jBReturn;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTViewFilm;
    // End of variables declaration//GEN-END:variables

     public void showFilmInfo() {
        DefaultTableModel viewFilm = (DefaultTableModel) jTViewFilm.getModel();
        viewFilm.setNumRows(0);

        for (Film f : dao.gettingBackFilmData(WIDTH)) {
            viewFilm.addRow(new Object[]{
                f.getFilmId(),
                f.getTitle(),
                f.getCategoryName(),
                f.getFilmTime()
                });
            
        }
    }
}
