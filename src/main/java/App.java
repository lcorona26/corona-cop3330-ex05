/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;
/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        String n1 = app.readN1();
        String n2 = app.readN2();
        String add = app.Add(n1, n2);
        String sub = app.Sub(n1, n2);
        String mul = app.Multiply(n1, n2);
        String div = app.Divide(n1, n2);
        app.printOutput(add, sub, mul, div);
    }

    private void printOutput(String add, String sub, String mul, String div) {
        String newline = System.lineSeparator();
        System.out.print(add + newline + sub + newline + mul + newline + div);
    }

    private String readN1() {
        System.out.print("What is the first number? ");
        String n1 = in.nextLine();
        return n1;
    }

    private String readN2() {
        System.out.print("What is the second number? ");
        String n2 = in.nextLine();
        return n2;
    }
    private String Add(String n1, String n2) {
        int intN1 = Integer.parseInt(n1);
        int intN2 = Integer.parseInt(n2);
        int sum = intN1 + intN2;
        return intN1 + " + " + intN2 + " = " + sum;

    }
    private String Sub(String n1, String n2) {
        int intN1 = Integer.parseInt(n1);
        int intN2 = Integer.parseInt(n2);
        int sum = intN1 - intN2;
        return intN1 + " - " + intN2 + " = " + sum;

    }

    private String Multiply(String n1, String n2) {
        int intN1 = Integer.parseInt(n1);
        int intN2 = Integer.parseInt(n2);
        int sum = intN1 * intN2;
        return intN1 + " * " + intN2 + " = " + sum;

    }

    private String Divide(String n1, String n2) {
        int intN1 = Integer.parseInt(n1);
        int intN2 = Integer.parseInt(n2);
        int sum = intN1 / intN2;
        return intN1 + " / " + intN2 + " = " + sum;

    }
}
