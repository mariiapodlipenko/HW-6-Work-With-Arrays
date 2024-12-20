package app;

import java.util.Arrays;

public class Main {

    static int[] intArray;
    static int sumOfNegativeNumbers;
    static int evenNumbersQuantity;
    static int oddNumbersQuantity;

    public static void main(String[] args) {

        intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 201) - 100;
        }

        System.out.println("Elements in array: " + Arrays.toString(intArray));

        sumOfNegativeNumbers = 0;
        for (int number : intArray) {
            if (number < 0) {
                sumOfNegativeNumbers += number;
            }
        }

        System.out.println("Sum of negative numbers: " + sumOfNegativeNumbers);

        evenNumbersQuantity = 0;
        oddNumbersQuantity = 0;

        for (int number : intArray) {
            if (number % 2 == 0) {
                evenNumbersQuantity++;
            } else {
                oddNumbersQuantity++;
            }
        }
        System.out.println("Quantity of even numbers: " + evenNumbersQuantity);
        System.out.println("Quantity of odd numbers: " + oddNumbersQuantity);

        int minValue = intArray[0];
        int maxValue = intArray[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                minIndex = i;
            }
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
                maxIndex = i;
            }
        }

        System.out.println("Minimum value: " + minValue + " (with index " + minIndex + ")");
        System.out.println("Maximum value: " + maxValue + " (with index " + maxIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                firstNegativeIndex = i;
                break;

            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("No negative numbers in array");
        } else {
            double sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < intArray.length; i++) {
                sum += intArray[i];
                count++;
            }
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average of numbers after first negative: %.2f\n", average);
            } else {
                System.out.println("No numbers after the first negative number.");
            }
        }


    }
}
