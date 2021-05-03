package model;
 
public class Film {
    
  private Rent rent = new Rent();

    private String filmDirector;
    private int filmTime;
    private int filmId;
    private int categoryId;
    private String title;
    private String categoryName;
    private String synopsis;
    private double price;
    

   
    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public int getFilmTime() {
        return filmTime;
    }

    public void setFilmTime(int filmTime) {
        this.filmTime = filmTime;
    }
    

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoriaName) {
        this.categoryName = categoriaName;
    }
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    @Override
    public String toString() {
        return getFilmId() + "";
    }

    public void setFilmTime(String filmTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
