package entities;

public class Item {
    
    private int itemId;
    private String itemTitle;
    private String itemSynopsis;
    private double itemPrice;
    private Category itemCategory;
    private int itemAvailability;
    private int itemRentPeriod;
    
    public Item(Category category){
        this.itemCategory = category;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemSynopsis() {
        return itemSynopsis;
    }

    public void setItemSynopsis(String itemSynopsis) {
        this.itemSynopsis = itemSynopsis;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Category getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(Category itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailability(int itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public int getItemRentPeriod() {
        return itemRentPeriod;
    }

    public void setItemRentPeriod(int itemRentPeriod) {
        this.itemRentPeriod = itemRentPeriod;
    }


    
}
