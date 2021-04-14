package entities;

import java.util.ArrayList;
import java.util.Date;

public class Rent {
    
    private int rentId;
    private double rentPrice;
    private Date rentDate;
    private Client rentClient;
    private User rentUser;
    private String returnDate;
        
    //in case that we want to use more than one object for renting
    //use an arrayList for storage all objects

 
    
     
    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Client getRentClient() {
        return rentClient;
    }

    public void setRentClient(Client rentClient) {
        this.rentClient = rentClient;
    }

    public User getRentUser() {
        return rentUser;
    }

    public void setRentUser(User rentUser) {
        this.rentUser = rentUser;
    } 


    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
                         
   

}
