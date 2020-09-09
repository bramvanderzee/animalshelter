package nl.bram.animalshelter.animals;

import java.time.LocalDateTime;

public class Reservor {
    public String name;
    public LocalDateTime reservedAt;

    public Reservor(String name, LocalDateTime reservedAt) {
        setName(name);
        setReservedAt(reservedAt);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getReservedAt() {
        return this.reservedAt;
    }

    public void setReservedAt(LocalDateTime reservedAt) {
        this.reservedAt = reservedAt;
    }
}
