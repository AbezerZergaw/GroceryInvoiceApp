import java.util.HashSet;
import java.util.Scanner;

public class InvoiceApp {


    public static void main(String[] args) {
        //creating HashSet for all the items
        HashSet<GroceryItems> myItems = new HashSet<>();

        int itemsPurchased = 0;
        Scanner input = new Scanner(System.in);
        String data;
        double totalPurchased = 0;

        //adding items using do while loop
        do {
            System.out.println("Enter Item Name");
            GroceryItems items = new GroceryItems();
            String itemName = input.nextLine();
            items.setItemName(itemName);


            System.out.println("Enter Item Price");
            double priceItem = input.nextDouble();
            items.setPrice(priceItem);

            System.out.println("Enter Item Quantity");
            int numberOfItem = input.nextInt();
            input.nextLine();
            items.setQuantity(numberOfItem);

            double cost = numberOfItem * priceItem;
            items.setCost(cost);
            totalPurchased = cost + totalPurchased;
            myItems.add(items);
            itemsPurchased++;

            System.out.println("Do you have another Item? Yes or No");
            data = input.nextLine();
            //input.nextLine();

        } while (data.equalsIgnoreCase("Yes"));


        System.out.println("Item Name" +"\t\t"+"Price"+"\t\t"+ "Quantity"+"\t\t"+"Cost");

        //printing all the items using for enhance loop
        for (GroceryItems obj : myItems) {

           System.out.println(obj.getItemName() +"\t\t\t"+obj.getPrice()+"\t\t\t"	+
                obj.getQuantity() +"\t\t\t"+obj.getCost());
        }

        System.out.printf("Total Purchase Amount = %.2f \n",totalPurchased);
        System.out.println("Total Items Purchased: " + itemsPurchased);

    }


}
