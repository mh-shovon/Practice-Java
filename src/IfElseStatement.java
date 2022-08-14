public class IfElseStatement {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = 80;
        if(a>b && a>c){
            System.out.println("a is the largest number");
        } else if (b>a && b>c) {
            System.out.println("b is the largest number");
        }
        else {
            System.out.println("c is the largest number");
        }
    }
}
