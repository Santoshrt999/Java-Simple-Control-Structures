/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

import java.util.Scanner;

/**
 * This is PizzaOrder Main Class
 * @author Goteti Santosh Ravi Teja
 */
public class PizzaOrderDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          String order = "Y";
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Northwest Pizza!");
            
            
            
                   System.out.print("Please enter a name for order: ");
            String name = sc.nextLine();
                  
            
            System.out.print("Please choose Delivery(D) or Pick up(P): ");
            String dop = sc.nextLine(); //if we use char then find the alphabet at charAt() method.
            switch (dop) {
                case "D":

                    
                    // String address;
                    System.out.print("Please enter your address: ");
                    String address = sc.nextLine();
                    //String contactNumber;
                    System.out.print("Please enter your contact number: ");
                    String contactNumber = sc.nextLine();
                    //char size;
                    System.out.print("Please choose the size of pizza(S/M/L): ");
                    char size = sc.nextLine().charAt(0);
                    //String toppings;
                    System.out.print("Please enter the toppings you want to add separated by a comma: ");
                    String toppings = sc.nextLine();
                    System.out.print("****************************************************\n");

                    //Created the pizzaorder object1 with arguments.
                    PizzaOrder pizzaorderObj1 = new PizzaOrder(name, address, contactNumber, size, toppings);
                    System.out.println("Please review your order below:");
                    System.out.println(pizzaorderObj1.toString());
                    System.out.println("");
                    System.out.println("Delivery charges :$"+pizzaorderObj1.getDELIVERY_CHARGE());
                    System.out.print("****************************************************\n");
                    System.out.println("Total bill amount to be paid: $" + pizzaorderObj1.getFinalPrice(dop));
                    System.out.print("****************************************************\n");
                    System.out.println("Do you wish to place another order?(Y/N): ");
                    order = sc.nextLine();
                    break;
                case "P":
                    
                    //String address;
                    System.out.print("Please enter your address: ");
                    address = sc.nextLine();
                    //String contactNumber;
                    System.out.print("Please enter your contact number: ");
                    contactNumber = sc.nextLine();
                    //char size;
                    System.out.print("Please choose the size of pizza(S/M/L): ");
                    size = sc.nextLine().charAt(0);
                    //String toppings;
                    System.out.print("Please enter the toppings you want to add separated by a comma: ");
                    toppings = sc.nextLine();
                    System.out.print("****************************************************\n");

                   //created the pizzaorder object2 with arguments
                    PizzaOrder pizzaorderObj2 = new PizzaOrder(name, address, contactNumber, size, toppings);
                    System.out.println("Please review your order below:");
                    System.out.println( pizzaorderObj2.toString());
                    System.out.println("****************************************************");
                    System.out.println("Total bill amount to be paid: $" + pizzaorderObj2.getFinalPrice(dop));
                    System.out.print("****************************************************\n");
                    System.out.println("Do you wish to place another order?(Y/N): ");
                    order = sc.nextLine();
                    break;
            }
        }while(order.equals("Y"));
        System.out.println("Thank you for your order!");
        
        
        
       





    
}

    
    
}
