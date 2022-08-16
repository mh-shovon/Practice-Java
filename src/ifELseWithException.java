import java.util.Scanner;

public class ifELseWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter Your First Number in Integer: ");

            int firstNumber = input.nextInt();

            System.out.println("Enter Your Second Number in Integer: ");
            int secondNumber = input.nextInt();
            if(firstNumber>secondNumber){
                System.out.println("First Number is grater than Second Number");
            }

            else {
                System.out.println("Second Number is grater than First Number");
            }
        }
        catch (Exception e){
            System.out.println("Wrong Input!!!.\nEnter an Integer Value.");
        }

    }
}
