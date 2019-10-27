import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //generateTwoDimensionalArray(2, 5);
        //printTwoDimensionalArray(generateTwoDimensionalArray(2, 5));
        /*int year = 1900;
        int month = 12;
        int day = 5;
        String s = "My birthday at " + year + " " + month + " " + day;
        System.out.println(s);*/
        //System.out.printf("My birthday at %d.%d.%d", year, month, day);
        /*Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println(str);
        System.out.println(i);
        System.out.println(d);*/
        //swapOddAndEvenLinesIn2DArray(generateTwoDimensionalArray(6,6));
        System.out.println(Arrays.toString(sumOfLine(generateTwoDimensionalArray(4,4))));
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
