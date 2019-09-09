import java.util.Scanner;
public class Acitivity02 
{
    public static void main(String[] hassan)
    {
        final double pricePizza = 12.00; 
        final double priceToppings = 1.50; 
        final double taxRate = 0.05; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pizzas: ");
        int Pizza = sc.nextInt();
        System.out.print("Enter the total number of toppings: ");
        int Toppings = sc.nextInt();
        double total = Pizza * pricePizza; // calculating price of pizza
        double totalTop = Toppings * priceToppings;//calculating price of toppings
        double price = total + totalTop; //total price of pizza with toppings
        double tax = price * taxRate; // calculating tax
        double totalprice = tax + price ; //total price including tax
        System.out.println("\nReceipt: Number of Pizzas: "+Pizza+ "\nNumber of Toppings: "+Toppings+ "\nCost (incl tax):   "+totalprice);
    }//main
    
}//class
