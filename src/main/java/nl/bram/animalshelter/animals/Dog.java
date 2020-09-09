package nl.bram.animalshelter.animals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal {
    public LocalDateTime lastWalk;
    public boolean needsWalk;

    public Dog(String name, Gender gender) {
        super(name, gender);
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

    public boolean isNeedsWalk() {
        if(ChronoUnit.DAYS.between(lastWalk, LocalDateTime.now()) > 0L) {
            return true;
        } else {
            return false;
        }
    }
}
