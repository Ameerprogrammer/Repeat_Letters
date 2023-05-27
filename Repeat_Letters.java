//Ameer Ahmed

import java.util.Scanner;

public class Repeat_Letters {
    public static String repeat(String str, int n) {

        //edge case in an empty string
        if(str.length() == 0) {
            System.out.println("The string is empty!");
        }

        char[] chars = str.toCharArray();

        StringBuilder repeatedStr = new StringBuilder();

        //negative n value for input
        if(n <= -1) {
            System.out.println("Repetitions can't be negative!");
        }

        //edge case
        else if(n == 0) {
            System.out.println("You entered no repetitions.");
        }

        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            for(int j = 0; j < n; j++) {
                repeatedStr.append(c);
            }
        }
        return repeatedStr.toString();
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of repetitions: ");
        int repetition = scanner.nextInt();

        if(input.length() == 0) {
            System.out.println("The string is empty!");
        }

        //edge case for null value
        else if (input == null) {
                System.out.println("The string can't be null!");
        }

        else {
            String repeatedString = repeat(input, repetition);
            System.out.println("Repeated string: " + repeatedString);

        }
    }
}