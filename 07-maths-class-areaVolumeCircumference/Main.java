import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Program to get the area, circumference and volume

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + " cm");

        System.out.println("The area is: " + area + " cm²");

        System.out.println("The volume is: " + volume  + " cm³");

        scanner.close();
    }
}