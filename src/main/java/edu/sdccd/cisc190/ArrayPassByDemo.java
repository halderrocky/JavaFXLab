package edu.sdccd.cisc190;

public class ArrayPassByDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        printArray(numbers);

        modifyArray(numbers);
        numbers[3] = -200;
        modifyArrValue(numbers[3]);

        printArray(numbers);


    }

    // when passing a primitive data type as an input parameter to a method,
    // it is pass by value!
    public static void modifyArrValue (int index) {
        index = -99;
    }

    //when passing a primitive array as an input parameter to a method,
    //it is pass by reference

    public static void modifyArray(int[] arr) {
       arr[1] = 99;
    }

    public static void printArray(int[] arr) {
        for(int num: arr) System.out.println(num);
    }

}
