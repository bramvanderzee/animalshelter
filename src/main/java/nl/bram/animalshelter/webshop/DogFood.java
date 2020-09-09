package nl.bram.animalshelter.webshop;

import nl.bram.animalshelter.interfaces.ISellable;

public class DogFood implements ISellable {
    private String name;
    private Float price;

    public DogFood(String name, Float price) {
        this.setName(name);
        this.setPrice(price);
    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }
    
    private void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }
    
    private void setPrice(Float price) {
        this.price = price;
    }
}
