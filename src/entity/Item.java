package entity;

import java.math.BigDecimal;


public class Item {

    private String name;
    private int quantity;
    private BigDecimal price;


    public Item(String name, int quantity, BigDecimal price) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public void setName(String name) {

        this.name = name;
    }


    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    public void setPrice(BigDecimal price) {

        this.price = price;
    }


    public String getName() {

        return name;
    }


    public int getQuantity() {

        return quantity;
    }


    public BigDecimal getPrice() {

        return price;
    }
}
