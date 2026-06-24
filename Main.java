public class Main {
    public static void main(String[] args){
        //printf - method used to format output

        // %[flags] [width] [.precision] [specifier-character]

        String name = "Spongebob";
        int age  = 30;
        double height = 70.578;
        char firstLetter = 'R';
        boolean isEmployed = false;

        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("You are %.2f inches tall\n", height);
        System.out.printf("Your actual name begins with %c\n", firstLetter);
        System.out.printf("Are you employed? : %b\n",isEmployed);

        System.out.printf("My name is %s and I am %.2f inches tall\n",name,height);
    }
}