package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = input.nextInt();
        int spaceInsert = userInput;
        int invSpaceInsert = 0;
        String output = "";
        int numberAdd = 1;
        int i;
        int end;
        for (i = 0; i < userInput; i++){
            output = output.replaceAll(" ","");
            String numberAdd1 = Integer.toString(numberAdd);
            if (numberAdd1.equals("1")){
                output = output + numberAdd1;
            }
            else{
                output = numberAdd1 + output + numberAdd1;
            }
            end = 0;
            while (end < spaceInsert){
                output = " " + output;
                end++;
            }
            numberAdd += 1;
            spaceInsert = spaceInsert - 1;
            invSpaceInsert += 1;
            System.out.println(output);
        }
        spaceInsert = 1;
        int length1;
        for (i = 0; i < userInput; i++){
            spaceInsert += 1;
            output = output.trim();
            String numberAdd1 = Integer.toString(numberAdd);
            length1 = numberAdd1.length();
            output = output.substring(length1,output.length()-length1);
            for (i = 0; i < spaceInsert; i++){
                output = " " + output;
            }
            numberAdd -= 1;
            System.out.println(output);
        }
    }
}
