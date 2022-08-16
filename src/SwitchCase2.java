import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the TEA & COFFEE shop \n" +
                "Input 1: Tea \n" +
                "Input 2: Coffee");
        System.out.println("Your Input is: ");
        int num = input.nextInt();
       /*or we can take it in one line by using -->
        System.out.println("Your Input is: " + input.nextInt() ); */
        switch (num){
            case 1:
                System.out.println("Preparing Your Tea ... \n" +
                        "Here is your Tea \n" +
                        "Have a nice drink");
                break;
            case  2:
                System.out.println("Preparing Your Coffee ... \n" +
                        "Here is your Coffee \n" +
                        "Have a nice drink");
                break;
            default:
                System.out.println("Your Order is not ready yet.");
        }

    }
}
