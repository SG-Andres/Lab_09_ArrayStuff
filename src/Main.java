import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[])
    {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        System.out.println("task 9:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d | ", dataPoints[r]);
            if (r % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");

        int sum = 0;
        for (int r = 0; r < dataPoints.length; r++) {
            sum += dataPoints[r];
        }
        double avg = sum / dataPoints.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        //task1 100 thing idk
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = x;
        }
        System.out.println("task 1:");
        for (int x = 0; x < dataPoints.length; x++) {

            System.out.printf("%5d ", dataPoints[x]);
            if (x % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println(""); //line breaks for space
        //end of task 1

        //task 2 the random one 1-100
        Random rand = new Random();

        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        System.out.println("task 2:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d ", dataPoints[r]);
            if (r % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println(""); //line breaks for space
        //end of task 2

        // task 3 add " | " for spacing between each value
        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        System.out.println("task 3:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d | ", dataPoints[r]);
            if (r % 20 == 0) {
                System.out.println("");
            }

        }
        System.out.println("");
        System.out.println("");
        // end of task 3

        // task 4 find avg
        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        System.out.println("task 4:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d | ", dataPoints[r]);
            if (r % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");

        int sum = 0;
        for (int r = 0; r < dataPoints.length; r++) {
            sum += dataPoints[r];
        }
        double avg = sum / dataPoints.length;
        System.out.println("the average of the array is: " + avg);
        System.out.println("");
        System.out.println("");

        // end of task 4

        //Part 2: Linear scan (search) (10pts) Task 5
        Scanner pipe = new Scanner(System.in);

        // task 5-6 count how many times scanner pipe is in loop?

        int rangedInt = SafeInput.getRangedInt (pipe, "enter an integer in range", 1, 100);
        System.out.println("You entered: " + rangedInt);

        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        //count for when input appears
        int guessGood = 0;
        for (int r = 0; r < dataPoints.length; r++) {
            if (dataPoints[r] == rangedInt) {
                guessGood++;
            }
        }
        System.out.println("Task 6:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d | ", dataPoints[r]);
            if ((r + 1) % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("\n" + rangedInt + " has appeared in the array: " + guessGood + " times" );



        //task7
        int rangedInt2 = SafeInput.getRangedInt (pipe, "\nenter an integer in range", 1, 100);
        System.out.println("You entered: " + rangedInt2);

        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        //count for when input appears
        int guessGood2 = 0;
        int found = -1;
        for (int r = 0; r < dataPoints.length; r++) {
            if (dataPoints[r] == rangedInt2) {
               found = r;
                break;
            }
        }

        System.out.println("\n\nTask 7:");
        for (int r = 0; r < dataPoints.length; r++) {
            System.out.printf("%5d | ", dataPoints[r]);
            if ((r + 1) % 20 == 0) {
                System.out.println("");
            }
            if (dataPoints[r] == rangedInt2) {
                break;}
        }
        if (found != -1) {
            System.out.println("\n The value " + rangedInt + " was found at array index: " + found);}

            else {
            System.out.println("\n The value " + rangedInt + " was not found in the array");
        }
            //task 7 end

        //task 8 minmax
        for (int r = 0; r < dataPoints.length; r++) {
            dataPoints[r] = rand.nextInt(100) + 1;
        }
        int max = dataPoints[0];
        int min = dataPoints[0];

        for (int r = 1; r < dataPoints.length; r++) {
            if (dataPoints[r] < min) {
                min = dataPoints[r];
            }
            if (dataPoints[r] > max) {
                max = dataPoints[r];
            }
        }
        System.out.println("\nTask 8:");
        for (int r = 0; r < dataPoints.length; r++) {

            System.out.printf("%5d | ", dataPoints[r]);
            if ((r + 1) % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("\nMinimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        System.out.println("");
        System.out.println("");


        //task 9 i think i did this right?


            System.out.println("the average of dataPoints is " + getAverage(dataPoints));

        }
    }
