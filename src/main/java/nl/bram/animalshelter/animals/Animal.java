package nl.bram.animalshelter.animals;

import java.time.LocalDateTime;

public class Animal {
    public String name;
    public Gender gender;
    public Reservor reservedBy;
    
    public Animal(String name, Gender gender) {
        setName(name);
        setGender(gender);
    }

    public boolean Reserve(String reservedBy) {
        if(this.reservedBy == null) {
            setReservedBy(new Reservor(reservedBy, LocalDateTime.now()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if (getReservedBy() != null)
        {
            reserved = String.format("reserved by %s", getReservedBy().name);
        }
        return String.format("%s, %s, %s", getName(), getGender(), reserved);
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
 
    public Reservor getReservedBy() {
        return this.reservedBy;
    }

    private void setReservedBy(Reservor reservedBy) {
        this.reservedBy = reservedBy;
    }
}
