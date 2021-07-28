package com.assignments;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Here's the total of two rolls of a standard die.");
        DiceRoll roll = new DiceRoll();
        IntegerAddition addTheDice = new IntegerAddition();
        CharAt character = new CharAt();
        int rollOne = roll.roll();
        System.out.println(rollOne + " is the first roll.");
        int rollTwo = roll.roll();
        System.out.println(rollTwo + " is the second roll.");
        System.out.println(addTheDice.add(rollOne, rollTwo) + " is the total.");
        System.out.println("The middle letter of assignments is " + character.middleOfWord());
    }
}
