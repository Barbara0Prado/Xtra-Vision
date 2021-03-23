package entities;

public class Category {
    
    private int id;
    private String name;
    private char type;

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    
    /* Return info of Film or Game -- EXTRA CONTENT */
    public String getNameType() {
        return type == 'F' ? "Film" : "Game"; 
    }
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
                + "\n" + "ID = " + id
                + "\n" + "Name = " + name 
                + "\n" + "Type = " + type;
    }
    
}
