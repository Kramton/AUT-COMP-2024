package Task03_2;

import java.util.Random;
import java.util.Scanner;

public class MathQuizProgram {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int score = 0;
        boolean loop = true;
        while (loop) {
            int operator = rand.nextInt(4);
            double rand1 = rand.nextInt(100);
            double rand2 = rand.nextInt(100);

            System.out.println("Score: " + score + "\n");
            String answer = "";
            try {
                if (operator == 0) {
                    System.out.println(rand1 + " + " + rand2);
                    answer = scan.next();

                    if (answer.toLowerCase().equals("x")) {
                        break;
                    }

                    double result = Double.parseDouble(answer);
                    add(rand1, rand2);

                    if (result == add(rand1, rand2)) {
                        System.out.println("Correct!");
                        score += 10;
                    } else {
                        System.out.println("Wrong answer.");
                        score -= 10;
                    }
                } else if (operator == 1) {
                    System.out.println(rand1 + " - " + rand2);
                    answer = scan.next();

                    if (answer.toLowerCase().equals("x")) {
                        break;
                    }

                    double result = Double.parseDouble(answer);
                    subtract(rand1, rand2);

                    if (result == subtract(rand1, rand2)) {
                        System.out.println("Correct!");
                        score += 10;
                    } else {
                        System.out.println("Wrong answer.");
                        score -= 10;
                    }
                } else if (operator == 2) {
                    System.out.println(rand1 + " * " + rand2);
                    answer = scan.next();

                    if (answer.toLowerCase().equals("x")) {
                        break;
                    }

                    double result = Double.parseDouble(answer);
                    multiply(rand1, rand2);

                    if (result == multiply(rand1, rand2)) {
                        System.out.println("Correct!");
                        score += 10;
                    } else {
                        System.out.println("Wrong answer.");
                        score -= 10;
                    }
                } else if (operator == 3) {
                    System.out.println(rand1 + " / " + rand2);
                    answer = scan.next();

                    if (answer.toLowerCase().equals("x")) {
                        break;
                    }
                    
                    double result = Double.parseDouble(answer);
                    divide(rand1, rand2);

                    if (result == divide(rand1, rand2)) {
                        System.out.println("Correct!");
                        score += 10;
                    } else {
                        System.out.println("Wrong answer.");
                        score -= 10;
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
            System.out.println();
        }
        
        System.out.println("Score: " + score);
        System.out.println("Goodbye!");
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
