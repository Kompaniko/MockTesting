package org.example;

public class Dog {
    private final int legsCount;
    private final String sound;

    public Dog() {
        legsCount = 4;
        sound = "Mau";
    }

    public Dog(int legsCount, String sound){
        this.legsCount = legsCount;
        this.sound = sound;
    }

    public Dog createHalfDog() {
        return new Dog(2,"Af af Gaf");
    }
    public int getLegsCount() {
        return legsCount;
    }
}
