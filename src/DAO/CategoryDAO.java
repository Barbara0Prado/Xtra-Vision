package DAO;

import model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoryDAO {

    public List<Category> listCategories() {
        List<Category> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM category");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category c = new Category();
                c.setCategoryName(rs.getString("name"));

                list.add(c);
            }

        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }

        return list;
    }
//    possivel codigo aqui
//    public List<Film> listFimByCategory(Integer categoryId){
//         stmt = con.prepareStatement("SELECT * FROM film where categoryId = ? ");
//    }

    public List<Category> checkIdCategory(String name) {
        List<Category> list = new ArrayList<>();
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM category WHERE categoryName = ?");
            stmt.setString(1, name);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category c = new Category();
                c.setCategoryId(rs.getInt("categoryId"));

                list.add(c);
            }

        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }

        return list;
    }

    public int getLastRegister() {
        int id = 0;

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT MAX(categoryId) FROM category");
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }
        return id + 1;
    }

    public void registerCategory(Category category) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO category VALUES(0,?)");
            stmt.setString(1, category.getCategoryName());

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Category registered successfully", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error to register the category, try again.", "Xtra-Vision",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public List<Category> searchByName(String Category) {
        List<Category> list = new ArrayList<>();
        boolean findCategory = false;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT categoryId, categoryName FROM category WHERE categoryName LIKE ?");
            stmt.setString(1, "%" + Category + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt("categoryId"));
                category.setCategoryName(rs.getString("categoryName"));

                findCategory = true;
                list.add(category);

            }

            if (!findCategory) {
                JOptionPane.showMessageDialog(null, "Category not found", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public List<Category> searchById(int id) {
        List<Category> list = new ArrayList<>();
        boolean findCategory = false;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT categoryId, categoryName FROM Category WHERE categoryId = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt("categoryId"));
                category.setCategoryName(rs.getString("categoryName"));

                findCategory = true;

                list.add(category);
            }

            if (!findCategory) {
                JOptionPane.showMessageDialog(null, "Category not found", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }
    public List<Category> showAllCategory() {
        List<Category> list = new ArrayList<>();
        boolean findCategory = false;
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT categoryId, categoryName FROM category ORDER BY categoryName ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category category = new Category();
                category.setCategoryId(rs.getInt("categoryId"));
                category.setCategoryName(rs.getString("categoryName"));

                findCategory = true;

                list.add(category);
            }

            if (!findCategory) {
                JOptionPane.showMessageDialog(null, "Category not found", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public void changeCategoryData(int categoryId, String categoryName) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("UPDATE category SET categoryName = ? WHERE categoryId = ?");
            stmt.setString(1, categoryName);
            stmt.setInt(2, categoryId);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "The information was changed successfully.", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error when trying to save the changes.", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            System.err.println("Error CategoryDAO: " + ex);
        }
    }

    public List<Category> gettingBackCategoryData(int categoryId) {
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Category> list = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM category WHERE categoriaId = ?");
            stmt.setInt(1, categoryId);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Category category = new Category();

                category.setCategoryId(rs.getInt("categoryId"));
                category.setCategoryName(rs.getString("categoryName"));

                list.add(category);

            }

        } catch (SQLException ex) {
            System.out.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return list;
    }

    public void deleteCategory(int categoryId) {

        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("DELETE FROM category WHERE category = ?");
            stmt.setInt(1, categoryId);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Category deleted successfully", "Xtra-Vision",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error when trying to delete category", "Xtra-Vision",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "It is not possible to delete this category. "
                    + "There is a title using this category.", "Xtra-Vision",
                    JOptionPane.WARNING_MESSAGE);
        } finally {
            Connect.closeConnection(con, stmt);
        }
    }

    public String gettingBackCategoryName(int catId) {
        String title = "";
        Connection con = Connect.getConnect();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT categoryId, categoryName FROM category WHERE categoryId = ?");
            stmt.setInt(1, catId);

            rs = stmt.executeQuery();

            while (rs.next()) {
                title = rs.getString("categoryName");
            }

        } catch (SQLException ex) {
            System.err.println("CategoryDAO: " + ex);
        } finally {
            Connect.closeConnection(con, stmt, rs);
        }

        return title;
    }

}
