package com.example.whichnumberishigher;

public class BiggerNumberGame {
    private long number1;
    private long number2;
    private int points;
    private int max_numb;
    private int min_numb;

    public BiggerNumberGame(int max_numb, int min_numb) {
        this.max_numb = max_numb;
        this.min_numb = min_numb;
    }
    public void generatRandomNumbers(){
        // resetting the two numbers
        number1 = 0;
        number2 = 0;
        // loops through random numbers until both numbers are not equal
        while(number1 == number2){
            number1 = Math.round(min_numb + (Math.random() * (max_numb - min_numb)));
            number2 = Math.round(min_numb + (Math.random() * (max_numb - min_numb)));
        }
    }

    public boolean compareNumbers(){
        // returns true if number1 is larger then number2
        // otherwise returns false
        if(number1 > number2){
            return true;
        }
        else {
            return false;
        }
    }
    // getters and setters
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setMax_numb(int max_numb) {
        this.max_numb = max_numb;
    }

    public void setMin_numb(int min_numb) {
        this.min_numb = min_numb;
    }

    public long getNumber1() {
        return number1;
    }

    public long getNumber2() {
        return number2;
    }

    public int getPoints() {
        return points;
    }

    public int getMax_numb() {
        return max_numb;
    }

    public int getMin_numb() {
        return min_numb;
    }
}