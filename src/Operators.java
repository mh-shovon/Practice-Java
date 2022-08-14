import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int num1,num2;
        Scanner Num1 = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        num1 = Num1.nextInt();
        Scanner Num2 = new Scanner(System.in);
        System.out.println("Enter Number2: ");
        num2 = Num2.nextInt();
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;
        System.out.println("The sum is: \n" + sum );
        System.out.println("The sub is: \n" + sub );
        System.out.println("The mul is: \n" + mul );
        System.out.println("The div is: \n" + div );
        System.out.println("The mod is: \n" + mod );
    }
}
