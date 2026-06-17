import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1,7);
        System.out.println("The first random number is: " + number1);

        number2 = random.nextDouble();
        System.out.println("The second random number is: " + number2);

        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }



    }
}