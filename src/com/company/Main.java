package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();
        String output = "";
        int numberAdd = 1;
        int i;
        for (i = 0; i < userInput; i++){
            String numberAdd1 = Integer.toString(numberAdd);
            output = output + numberAdd1;
            numberAdd += 1;
            System.out.println(output);
        }
        int length1;
        for (i = 0; i < userInput; i++){
            String numberAdd1 = Integer.toString(numberAdd);
            length1 = numberAdd1.length();
            output = output.substring(0,output.length()-length1);
            numberAdd -= 1;
            System.out.println(output);
        }
    }
}
