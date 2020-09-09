package nl.bram.animalshelter.animals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal {
    private LocalDateTime lastWalk;
    private static Integer numberOfDogs = -1;
    private final Float BEGINPRICE = 500F;
    private final Float MINIMUMPRICE = 50F;
    private final Float DISCOUNT = 50F;

    public Dog(String name, Gender gender) {
        super(name, gender);
        numberOfDogs += 1;
    }

    public void walk() {
        setLastWalk(LocalDateTime.now());
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        return String.format("%s, last walk: %s", super.toString(), getLastWalk().format(df));
    }
    
    // GETTERS AND SETTERS

    public LocalDateTime getLastWalk() {
        return this.lastWalk;
    }

    private void setLastWalk(LocalDateTime dateTime) {
        this.lastWalk = dateTime;
    }

    public Float getPrice() {
        Float discount = (float)numberOfDogs * this.DISCOUNT;

        Float price = this.BEGINPRICE - discount;
        if(price < this.MINIMUMPRICE) {
            return this.MINIMUMPRICE;
        } else {
            return price;
        }
    }

    public boolean needsWalk() {
        if(ChronoUnit.DAYS.between(getLastWalk(), LocalDateTime.now()) > 0L) {
            return true;
        } else {
            return false;
        }
    }
}
