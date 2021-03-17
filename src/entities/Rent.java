package entities;

import java.util.ArrayList;
import java.util.Date;

public class Rent {
    
    private int id;
    private double price;
    private Date date;
    private Client client;
    private User user;
        
    //in case that we want to use more than one object for renting
    //use an arrayList for storage all objects

    private ArrayList< ItemRent> itemRent;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public User getUser() {
        return user;
    }
           
    public ArrayList< ItemRent> getItemRent() {
        return itemRent;
    }
    public void setItemRent(ArrayList< ItemRent> itemRent) {
        this.itemRent = itemRent;
    }
}
