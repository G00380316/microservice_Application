package ie.atu.shopping_cart;

import lombok.Getter;

public class Item {
    @Getter
    private String name;
    private double price;
    private int ID;

    public Item(String name, double price, int ID) {
        this.name = name;
        this.price = price;
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public int getID(){
        return ID;
    }
}
