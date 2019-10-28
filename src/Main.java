import sun.awt.event.IgnorePaintEvent;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(returnDayInMonth(Months.APRIL));
        //System.out.println(differenceBetweenMinAndMaxElementsInArray(makeArrayWithRandomElements(6)));
        //System.out.println(comparisonElementsTwoArrays(makeArrayWithRandomElements(2), makeArrayWithRandomElements(3)));
        //System.out.println(searchMissedNumberFromZeroToNineInArray(new int[]{1, 0, 4, 9, 6, 5, 3, 8, 7}));

    }

    public static int returnDayInMonth (Months months){
        int a = 0;
        switch (months) {
            case JANUARY:
                a = 31;
                break;
            case FEBRUARY:
                a = 28;
                break;
            case MARCH:
                a = 31;
                break;
            case APRIL:
                a = 30;
                break;
            case MAY:
                a = 31;
                break;
            case JUNE:
                a = 30;
                break;
            case JULY:
                a = 31;
                break;
            case AUGUST:
                a = 31;
                break;
            case SEPTEMBER:
                a = 30;
                break;
            case OCTOBER:
                a = 31;
                break;
            case NOVEMBER:
                a = 30;
                break;
            case DECEMBER:
                a = 31;
                break;
        }
        return a;
    }

    public static int[] makeArrayWithRandomElements (int amountOfElemets) {
        int[] array = new int[amountOfElemets];
        for (int i = 0; i < amountOfElemets; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int minElementInArray(int[] givenArray) {
        int minElement = givenArray[0];
        for (int i = 1; i < givenArray.length; i++) {
            if (givenArray[i] < minElement) {
                minElement = givenArray[i];
            }
        }
        return minElement;
    }

    public static int maxElementInArray (int[] givenArray) {
        int maxElement = givenArray[0];
        for (int i = 1; i < givenArray.length; i++) {
            if (givenArray[i] > maxElement) {
                maxElement = givenArray[i];
            }
        }
        return maxElement;
    }

    public static int differenceBetweenMinAndMaxElementsInArray (int [] givenArray) {
        //System.out.println(Arrays.toString(givenArray));
        int minElement = minElementInArray(givenArray);
        int maxElement = maxElementInArray(givenArray);
        int difference = maxElement - minElement;
        return difference;
    }

    public static boolean comparisonElementsTwoArrays(int[] givenArray1, int[] givenArray2) {
        System.out.println(Arrays.toString(givenArray1));
        System.out.println(Arrays.toString(givenArray2));
        if (givenArray1.length != givenArray2.length) {
            return false;
        }
        else {
            for (int i = 0; i < givenArray1.length; i++) {
                if (givenArray1[i] != givenArray2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int searchMissedNumberFromZeroToNineInArray (int[] givenArray) {
        final int[] arrayWithNumbersFromZeroToNine = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int missedNumber = 0;

        for (int i = 0; i < arrayWithNumbersFromZeroToNine.length; i++) {
            int counter = 0;
            for (int j = 0; j < givenArray.length; j++) {
                if (arrayWithNumbersFromZeroToNine[i] != givenArray[j]) {
                     counter++;
                     if (counter == givenArray.length) {
                         missedNumber = arrayWithNumbersFromZeroToNine[i];
                     }
                }
                else {
                    break;
                }
            }
        }
        return missedNumber;

    }

    public static int[][] generateTwoDimensionalArray(int length, int width) {
        int[][] array = new int[length][width];
        //int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 - 5);
                /*array[i][j] = number;
                number ++;*/
            }
        }
        return array;
    }

    public static void printTwoDimensionalArray(int[][] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            System.out.println(Arrays.toString(givenArray[i]));
        }
        /*System.out.println();
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray[i].length; j++) {
                System.out.print(givenArray[i][j] + "\t");
            }
            System.out.println();
        }*/
    }

    public static void swapOddAndEvenLinesIn2DArray(int[][] givenArray) {
        printTwoDimensionalArray(givenArray);
        for (int i = 0; i < givenArray.length; i++) {
            int[] tmp = new int[givenArray.length];
            if (i % 2 != 0) {
                tmp = givenArray[i-1];
                givenArray[i-1] = givenArray[i];
                givenArray[i] = tmp;
            }
        }
        System.out.println();
        printTwoDimensionalArray(givenArray);
    }

    public static int[] sumOfLine(int[][] givenArray) {
        printTwoDimensionalArray(givenArray);
        System.out.println();
        int[] array = new int[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            int sumOfLine = 0;
            for (int j = 0; j < givenArray[i].length; j++) {
                sumOfLine += givenArray[i][j];
            }
            array[i] = sumOfLine;
        }
        return array;
    }


}
