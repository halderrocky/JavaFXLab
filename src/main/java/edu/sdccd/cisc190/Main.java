package edu.sdccd.cisc190;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                         //0,1,2,3,4,5
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(numbers.length);
        System.out.printf("The number at index %d is %d%n", 5, numbers[5]);

        int[] moreNumbers = new int[5];
        moreNumbers[0] = 7;
        moreNumbers[1] = 8;
        moreNumbers[2] = 9;
        moreNumbers[3] = 10;
        moreNumbers[4] = 11;

        System.out.println(moreNumbers.length);

        int[] userNumbers = new int[3];
        System.out.printf("Enter %d numbers separated by Enter: ", userNumbers.length);
        for(int i = 0; i < userNumbers.length; i++)
            userNumbers[i] = input.nextInt();

        for(int i = 0; i < userNumbers.length; i++)
            System.out.println(userNumbers[i]);

        int sum = 0;
        for(int i = 0; i < userNumbers.length; i++)
            sum += (userNumbers[i]);

        System.out.printf("The sum of your numbers is %d%n ", sum);

        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < userNumbers.length; i++) {
            if(userNumbers[i] > maxValue) maxValue = userNumbers[i];
        }

        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        int i = 0;
        for(int userNumber : userNumbers) {
            if(userNumber < minValue) {
                minValue = userNumber;
                minIndex = i;
            }
            i++;
        }
        System.out.printf("The min value is %d%n ", minValue);

    }
}