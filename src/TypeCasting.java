import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int myInt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        myInt = sc.nextInt();
        double myDouble = myInt;
        System.out.println(myDouble);

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        System.out.println(myDouble1);
        System.out.println(myInt1);

    }
}
