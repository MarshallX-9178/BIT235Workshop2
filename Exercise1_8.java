import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();


        boolean areEqual = str1.equals(str2);
        System.out.println("the two given strings are equal: " + areEqual);


        if (str1.length() > 0 && str2.length() > 0) {
            char c1 = str1.charAt(0);
            char c2 = str2.charAt(0);

            System.out.println("First character of string 1: " + c1);
            System.out.println("First character of string 2: " + c2);
            System.out.println("First characters are equal: " + (c1 == c2));
        } else {
            System.out.println("One or both strings are empty, cannot compare first characters.");
        }

        input.close();
    }
}