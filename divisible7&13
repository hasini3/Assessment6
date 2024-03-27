import java.util.Scanner;
public class Divisibility7and13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 7 == 0 && num % 13 == 0) 
       {
            System.out.println(num + " is divisible by both 7 and 13.");
            int quot7 = num / 7;
            int rem7 = num % 7;
            int quot13 = num / 13;
            int rem13 = num % 13;
            System.out.println("Quotient when divided by 7: " + quot7);
            System.out.println("Remainder when divided by 7: " + rem7);
            System.out.println("Quotient when divided by 13: " + quot13);
            System.out.println("Remainder when divided by 13: " + rem13);
        } 
        else
        {
            System.out.println(num + " is not divisible by both 7 and 13.");
        }
        sc.close();
    }
}
