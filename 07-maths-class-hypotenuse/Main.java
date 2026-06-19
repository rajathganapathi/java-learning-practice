import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Program to get the hypotenuse based on user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The value of hypotenuse is: " + c + "cm");

        scanner.close();
    }
}