package entities;
 
public class Film extends Item {
    
    public Film(Category category){
        super(category);
    }

    private String filmDirector;
    private int filmTime;

   
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
    
    @Override
    public String toString() {
        return "Film" 
                + "\n" + "ID = " + getItemId()
                + "\n" + "Director = " + filmDirector
                + "\n" + "Time = " + filmTime
                + "\n" + "Title = " + getItemTitle() 
                + "\n" + "Synopsis = " + getItemSynopsis()
                + "\n" + "Price = " + getItemPrice()
                + "\n" + "Rental Period = " + getItemRentPeriod()
                + "\n" + "Category = " + getItemCategory();
    }

}
