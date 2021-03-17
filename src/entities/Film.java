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
}
