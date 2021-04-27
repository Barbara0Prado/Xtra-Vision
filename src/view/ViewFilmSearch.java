/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.FilmDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Film;
import xtra.vision.Menu;


public class ViewFilmSearch extends javax.swing.JFrame {
     FilmDAO dao = new FilmDAO();

    public ViewFilmSearch() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFSearch = new javax.swing.JTextField();
        jBSearchTitle = new javax.swing.JButton();
        jBShowAllFilms = new javax.swing.JButton();
        jBViewFilm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBHome = new javax.swing.JButton();
        jBCategories = new javax.swing.JButton();
        jBReturnFilm = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setPreferredSize(new java.awt.Dimension(918, 485));

        jTSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film Id", "Title", "Category", "Time"
            }
        ));
        jTSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSearch);
        if (jTSearch.getColumnModel().getColumnCount() > 0) {
            jTSearch.getColumnModel().getColumn(1).setResizable(false);
            jTSearch.getColumnModel().getColumn(2).setResizable(false);
            jTSearch.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Films");

        jTFSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSearchActionPerformed(evt);
            }
        });

        jBSearchTitle.setBackground(java.awt.Color.darkGray);
        jBSearchTitle.setForeground(java.awt.Color.white);
        jBSearchTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magnifier.png"))); // NOI18N
        jBSearchTitle.setText("Search");
        jBSearchTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchTitleActionPerformed(evt);
            }
        });
        jBSearchTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBSearchTitleKeyPressed(evt);
            }
        });

        jBShowAllFilms.setBackground(java.awt.Color.darkGray);
        jBShowAllFilms.setForeground(java.awt.Color.white);
        jBShowAllFilms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magnifier.png"))); // NOI18N
        jBShowAllFilms.setText("Show All");
        jBShowAllFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowAllFilmsActionPerformed(evt);
            }
        });

        jBViewFilm.setBackground(java.awt.Color.darkGray);
        jBViewFilm.setForeground(java.awt.Color.white);
        jBViewFilm.setText("View Film");
        jBViewFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBViewFilmActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Rent Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jBSearchTitle)
                                .addGap(18, 18, 18)
                                .addComponent(jBShowAllFilms)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBViewFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSearchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBShowAllFilms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBViewFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.jpeg"))); // NOI18N
        jButton1.setText("jButton1");

        jBHome.setBackground(java.awt.Color.darkGray);
        jBHome.setForeground(java.awt.Color.white);
        jBHome.setText("HOME");
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
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

        jBReturnFilm.setBackground(java.awt.Color.darkGray);
        jBReturnFilm.setForeground(java.awt.Color.white);
        jBReturnFilm.setText("RETURN FILM");
        jBReturnFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReturnFilmActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBReturnFilm, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBHome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jBCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jBReturnFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBReturnFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReturnFilmActionPerformed
        new ViewReturnFilm().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBReturnFilmActionPerformed

    private void jTFSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSearchActionPerformed

    private void jBCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCategoriesActionPerformed
        new ViewCategory().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBCategoriesActionPerformed

          
    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        new ViewFilmSearch().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBSearchTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchTitleActionPerformed
        searchByTitle();
        jTFSearch.setText("");
    }//GEN-LAST:event_jBSearchTitleActionPerformed

    private void jBSearchTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBSearchTitleKeyPressed
        if (evt.getKeyCode() == 10) {
            searchByTitle();
            jTFSearch.setText("");
        }
    }//GEN-LAST:event_jBSearchTitleKeyPressed

    private void jBShowAllFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowAllFilmsActionPerformed
             showAllFilms();
    }//GEN-LAST:event_jBShowAllFilmsActionPerformed

    private void jBViewFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBViewFilmActionPerformed
        int line = jTSearch.getSelectedRow();
            if (line > -1) {
                ;
            } else {
                JOptionPane.showMessageDialog(this, "Please, select one title!");
            }
            
        new ViewFilm().setVisible(true);
            dispose();
    }//GEN-LAST:event_jBViewFilmActionPerformed

    private void jTSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSearchMouseClicked
             if (jTSearch.getSelectedRow() != -1) {
                 jBViewFilm.setEnabled(true);
             } else {
                 jBViewFilm.setEnabled(false);
        }
    }//GEN-LAST:event_jTSearchMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFilmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFilmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFilmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFilmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFilmSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCategories;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBReturnFilm;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSearchTitle;
    private javax.swing.JButton jBShowAllFilms;
    private javax.swing.JButton jBViewFilm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFSearch;
    private javax.swing.JTable jTSearch;
    // End of variables declaration//GEN-END:variables

    public void showAllFilms() {
        DefaultTableModel filmTable = (DefaultTableModel) jTSearch.getModel();
        filmTable.setNumRows(0);

        for (Film f : dao.showAllFilm()) {
            filmTable.addRow(new Object[]{
                f.getFilmId(),
                f.getTitle(),
                f.getCategoryName(),
                f.getFilmTime()
                });
        }
    }
    
    public void searchByTitle() {
        String filmTitle = jTFSearch.getText();
        DefaultTableModel searchTable = (DefaultTableModel) jTSearch.getModel();
        searchTable.setNumRows(0);

        for (Film f : dao.searchByTitle(filmTitle)) {
            searchTable.addRow(new Object[]{
                f.getFilmId(),
                f.getTitle(),
                f.getCategoryName(),
                f.getFilmTime()
                });
        }
    }

}
