package model;

import java.util.ArrayList;


public class Rent {
    
    private int rentId;
    private double rentPrice;
    private String rentDate;
    private int rentClient;
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

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public int getRentClient() {
        return rentClient;
    }

    public void setRentClient(Client rentClient) {
        this.setRentClient(rentClient);
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

    public void setRentClient(int rentClient) {
        this.rentClient = rentClient;
    }
                         
   

}
