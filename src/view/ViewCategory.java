
package view;

import xtra.vision.Menu;
import DAO.CategoryDAO;
import javax.swing.table.DefaultTableModel;
import model.Category;


public class ViewCategory extends javax.swing.JFrame {
    
     CategoryDAO dao = new CategoryDAO();


    public ViewCategory() {      
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCategories = new javax.swing.JTable();
        jBSearchCategory = new javax.swing.JButton();
        jTSearchCategory = new javax.swing.JTextField();
        jBShowAllCategories = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Categories");

        jTCategories.setBackground(java.awt.Color.darkGray);
        jTCategories.setForeground(java.awt.Color.white);
        jTCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Category"
            }
        ));
        jTCategories.setToolTipText("Select");
        jScrollPane1.setViewportView(jTCategories);

        jBSearchCategory.setBackground(java.awt.Color.darkGray);
        jBSearchCategory.setForeground(java.awt.Color.white);
        jBSearchCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magnifier.png"))); // NOI18N
        jBSearchCategory.setText("Search");
        jBSearchCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchCategoryActionPerformed(evt);
            }
        });

        jTSearchCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSearchCategoryActionPerformed(evt);
            }
        });
        jTSearchCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSearchCategoryKeyPressed(evt);
            }
        });

        jBShowAllCategories.setBackground(java.awt.Color.darkGray);
        jBShowAllCategories.setForeground(java.awt.Color.white);
        jBShowAllCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magnifier.png"))); // NOI18N
        jBShowAllCategories.setText("Show All");
        jBShowAllCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBShowAllCategoriesActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBShowAllCategories)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBShowAllCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jBSearch.setBackground(java.awt.Color.darkGray);
        jBSearch.setForeground(java.awt.Color.white);
        jBSearch.setText("SEARCH");
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
                        .addGap(52, 52, 52)
                        .addComponent(jBReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.getAccessibleContext().setAccessibleName("Select");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jBReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReturnActionPerformed
         new ViewReturnFilm().setVisible(true);
         dispose();
    }//GEN-LAST:event_jBReturnActionPerformed

    private void jBSearchCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchCategoryActionPerformed
         searchByCategory();
         jTSearchCategory.setText("");
    }//GEN-LAST:event_jBSearchCategoryActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        new ViewFilmSearch().setVisible(true);
        dispose();

    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBShowAllCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBShowAllCategoriesActionPerformed
          showAllCategories();
    }//GEN-LAST:event_jBShowAllCategoriesActionPerformed

    private void jTSearchCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSearchCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSearchCategoryActionPerformed

    private void jTSearchCategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSearchCategoryKeyPressed
       if (evt.getKeyCode() == 10) {
            searchByCategory();
            jTSearchCategory.setText("");
        }                      
    }//GEN-LAST:event_jTSearchCategoryKeyPressed

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
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSearchCategory;
    private javax.swing.JButton jBShowAllCategories;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCategories;
    private javax.swing.JTextField jTSearchCategory;
    // End of variables declaration//GEN-END:variables
    
    public void searchByCategory() {
        DefaultTableModel categoryTable = (DefaultTableModel) jTCategories.getModel();
        categoryTable.setNumRows(0);
        String categorySearch = jTSearchCategory.getText();

        for (Category c : dao.searchByName(categorySearch)) {
            categoryTable.addRow(new Object[]{
                c.getCategoryId(),
                c.getCategoryName(),});
        }
    }
    
     public void showAllCategories() {
        DefaultTableModel categoryTable = (DefaultTableModel) jTCategories.getModel();
        categoryTable.setNumRows(0);

        for (Category c : dao.showAllCategory()) {
            categoryTable.addRow(new Object[]{
                c.getCategoryId(),
                c.getCategoryName(),});
        }
    }
    }
        
