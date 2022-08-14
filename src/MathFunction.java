public class MathFunction {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        float c = -5.87f;
        int maxNum= Math.max(a,b);
        System.out.println(maxNum);
        int minNum = Math.min(a,b);
        System.out.println(minNum);
        double Sqrt = Math.sqrt(a);
        System.out.println(Sqrt);
        System.out.println("Math abs :"+ Math.abs(c));
        int randomNum= (int) (Math.random()*100);
        System.out.println("Random Number: " + randomNum);
    }
}
