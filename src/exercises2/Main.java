package exercises2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int min = 100000;
        int max = 999999;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println("Random number: " + randomNum);
        }
    }