package entities;

public class Category {
    
    private int categoryId;
    private String categoryName;
    private char categoryType;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public char getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(char categoryType) {
        this.categoryType = categoryType;
    }
  
    
    /* Return info of Film or Game -- EXTRA CONTENT */
   
        /* if (type == 'F') {
            return "Film";
        } else if (type == 'G') {
            return "Game";
        } else {
            return "TV Series";
        }
        
        */
    
    
    @Override
    public String toString() {
        return "Category"
                + "\n" + "ID = " + categoryId
                + "\n" + "Name = " + categoryName 
                + "\n" + "Type = " + categoryType;
    }

      
}
