import java.util.*;

public class Addtwoinputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("Sum is: "+sum);

    }
}
