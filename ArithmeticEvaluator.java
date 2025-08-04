import java.util.Scanner;

public class ArithmeticEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three inputs a,b,c,d to solve the equation \"(a + b)*c/d \" ");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();
        int res = (a + b)*c/d;
        System.out.println("The result of the equation (a + b) * c / d is: " + res);
    }
}
