import java.util.Scanner;
public class CalculateTotalExpenses {
    public static double calculateTotalExpenses(int quant, double pricePerItem)
    {
        double totalExpenses = quant * pricePerItem;
        double discount = 0;
        if (quant > 50)
        {
            discount = 0.1 * totalExpenses;
        } 
        else if (quant >= 25 && quant <= 50)
        {
            discount = 0.05 * totalExpenses;
        }
        return totalExpenses - discount;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = sc.nextDouble();
        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);
        System.out.println("Total expenses after discount: $" + totalExpenses);
        sc.close();
    }
}
