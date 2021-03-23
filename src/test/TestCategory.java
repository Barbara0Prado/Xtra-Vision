
package test;
import entities.Category;
import model.CategoryDAO;

public class TestCategory {
    public static void main(String[] args) {
        Category category = new Category();
        
        category.setName("Horror");
        category.setType('F');// F = Film.
        category.setId(1);
        
        //CategoryDAO.insert(category);
        
        
        //System.out.println(CategoryDAO.change(category));
        //System.out.println(CategoryDAO.delete(12));
        
        //System.out.println(CategoryDAO.list());
        
    }
    
}
