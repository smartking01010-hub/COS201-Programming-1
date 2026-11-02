import java.util.Scanner; 
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new 
        Scanner(System.in);
        System.out.print("Enter Item Name: ");
        String itemName = 
        input.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity =
        input.nextInt();
        System.out.print("Enter Unit Price: ");
        double unitPrice =
        input.nextDouble(); 
        double totalCost = quantity * unitPrice;
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total cost: " + totalCost);
        input.close();
    }
    }        


