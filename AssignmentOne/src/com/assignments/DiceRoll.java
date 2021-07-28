package com.assignments;

import java.math.*;

public class DiceRoll {
    private int diceSides = 6;

    public int roll(){
        return (int)(Math.random() * diceSides) + 1;
    }


}
