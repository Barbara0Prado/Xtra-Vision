package entities;
 
public class Film extends Item {
    
    public Film(Category category){
        super(category);
    }

    private String director;
    private int time;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Film" 
                + "\n" + "ID = " + getId()
                + "\n" + "Director = " + director
                + "\n" + "Time = " + time
                + "\n" + "Title = " + getTitle() 
                + "\n" + "Synopsis = " + getSynopsis()
                + "\n" + "Price = " + getPrice()
                + "\n" + "Rental Period = " + getRentPeriod()
                + "\n" + "Category = " + getCategory();
    }
}
