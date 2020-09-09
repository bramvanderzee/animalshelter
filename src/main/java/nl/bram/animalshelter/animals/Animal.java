package nl.bram.animalshelter.animals;

import nl.bram.animalshelter.interfaces.ISellable;
import java.time.LocalDateTime;

public abstract class Animal implements ISellable {
    private String name;
    private Gender gender;
    private Reserver reservedBy;
    
    public Animal(String name, Gender gender) {
        this.setName(name);
        this.setGender(gender);
    }

    public boolean Reserve(String reservedBy) {
        if(this.reservedBy == null) {
            this.setReservedBy(new Reserver(reservedBy, LocalDateTime.now()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if(this.getReservedBy() != null)
        {
            reserved = String.format("reserved by %s", this.getReservedBy().getName());
        }
        return String.format("%s, %s, %s, %s", this.getName(), this.getGender(), this.getPrice(), reserved);
    }

    // GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return this.gender;
    }

    private void setGender(Gender gender) {
        this.gender = gender;
    }
 
    public Reserver getReservedBy() {
        return this.reservedBy;
    }

    private void setReservedBy(Reserver reservedBy) {
        this.reservedBy = reservedBy;
    }
}
