package nl.bram.animalshelter.animals;

public class Cat extends Animal {
    private String badHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        setBadHabits(badHabits);
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
    
}
