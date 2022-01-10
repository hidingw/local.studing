package com.local.studing.lesson3;

import com.local.studing.lesson3.customThrows.MyArrayDataException;
import com.local.studing.lesson3.customThrows.MyArraySizeException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String[][] myArray = new String[4][4];
        System.out.println("Pls, input array of integer 4x4: ");
        try {
            getUserInput(myArray);
            processingArray(myArray);
        } catch (MyArraySizeException e) {
            System.out.println("Incorrect size of array");
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect input type");
        }

    }

    public static void getUserInput(String [][] userArray) throws MyArraySizeException {
        Scanner sc = new Scanner(System.in);
        int row = 0;

        sc.useDelimiter("\n");

            while (sc.hasNext()) {
                String[] line = sc.next().split(" ");
                if (line.length > userArray[row].length) {
                    throw new MyArraySizeException();
                }

                userArray[row] = line;
                row++;

                if (row == userArray.length) {
                    break;
                }
            }
        }

    public static void processingArray (String [][] userArray) throws MyArrayDataException {
        int sum = 0;
        for (String[] line: userArray) {
            for (String elem: line) {
                try {
                    sum += Integer.parseInt(elem);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println("Summary: " + sum);
    }
}
