package org.example;

public class Cat {
    private final int legsCount;
    private final String sound;

    public Cat() {
        legsCount = 4;
        sound = "Mau";
    }

    public Cat(int legsCount, String sound){
        this.legsCount = legsCount;
        this.sound = sound;
    }

    public Cat createHalfCat() {
        return new Cat(2,"maw maw");
    }
    public int getLegsCount() {
        return legsCount;
    }
}
