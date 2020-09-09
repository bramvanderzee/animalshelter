package nl.bram.animalshelter.animals;

public class Cat extends Animal {
    private String badHabits;
    private final Float BEGINPRICE = 350F;
    private final Float MINIMUMPRICE = 35F;
    private final Float DISCOUNT = 20F;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        setBadHabits(badHabits);
    }

    private Float calculatePrice() {
        Float discount = this.DISCOUNT * (float)badHabits.chars().count();

        Float price = this.BEGINPRICE - discount;
        if(price < this.MINIMUMPRICE) {
            return this.MINIMUMPRICE;
        } else {
            return price;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, bad habits: %s", super.toString(), getBadHabits().toLowerCase());
    }

    // GETTERS AND SETTERS

    public String getBadHabits() {
        return this.badHabits;
    }

    private void setBadHabits(String badHabits) {
        this.badHabits = badHabits;
    }

    public Float getPrice() {
        return this.calculatePrice();
    }
    
}
