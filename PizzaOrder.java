/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaorder;

/**
 * This is PizzaOrder Class code file.
 * @author Goteti Santosh Ravi Teja
 */
public class PizzaOrder {

    private String name;
    private String address;
    private String contactNumber;
    private char size;
    private final double BASIC_CRUST_COST = 4.0;
    private final double BASIC_CHEESE_COST = 2.0;
    private final double BASIC_SAUSE_COST = 0.50;
    private final double DELIVERY_CHARGE = 2.75;
    private String toppings;

    /**
     *This is an argument Constructor
     * @param name - The parameter name is passed.
     * @param address - The parameter address is passed. 
     * @param contactNumber - The parameter contactNumber is passed.
     * @param size - The parameter size is passed.
     * @param toppings - The parameter toppings is passed.
     */
    public PizzaOrder(String name, String address, String contactNumber, char size, String toppings) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.size = size;
        this.toppings = toppings;
    }

    /**
     *This method is used to get the variable Name.
     * @return - the value of the Name property.
     */
    public String getName() {
        return name;
    }

    /**
     *This method is used to get the variable Address.
     * @return - the value of the Address property.
     */
    public String getAddress() {
        return address;
    }

    /**
     *This method is used to get the variable ContactNumber.
     * @return - the value of the ContactNumber property.
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     *This method is used to get the variable Size.
     * @return - the value of the Size property.
     */
    public char getSize() {
        return size;
    }

    /**
     *This method is used to get the variable BASIC_CRUST_COST.
     * @return - the value of the BASIC_CRUST_COST property.
     */
    public double getBASIC_CRUST_COST() {
        return BASIC_CRUST_COST;
    }

    /**
     *This method is used to get the variable BASIC_CHEESE_COST .
     * @return - the value of the BASIC_CHEESE_COST property.
     */
    public double getBASIC_CHEESE_COST() {
        return BASIC_CHEESE_COST;
    }

    /**
     *This method is used to get the variable BASIC_SAUSE_COST.
     * @return - the value of the BASIC_SAUSE_COST property.
     */
    public double getBASIC_SAUSE_COST() {
        return BASIC_SAUSE_COST;
    }

    /**
     *This method is used to get the Double value of DELIVERY_CHARGE.
     * @return - the value of the DELIVERY_CHARGE property.
     */
    public double getDELIVERY_CHARGE() {
        return DELIVERY_CHARGE;
    }

    /**
     *This method is used to get the variable toppings.
     * @return - the value of the toppings property.
     */
    public String getToppings() {
        return toppings;
    }

    /**
     *This method is used to get the value for  Number of toppings.
     * @return - the value of the Number of Toppings property.
     */
    public int getNumberOfToppings() {
        
        return toppings.split(",").length;//split comes (split by ())
        

    }

    /**
     *This method is used to get the variable FinalCrustCost.
     * @return - the value of the FinalCrustCost property.
     */
    public double getFinalCrustCost() {

      double finalCrustCost=0;
      
      switch(size){
          
          case 'S':
                  finalCrustCost = BASIC_CRUST_COST;
                  break;
          case 'M':
               finalCrustCost = BASIC_CRUST_COST * 1.3;
                  break;
          case 'L':
                   finalCrustCost = BASIC_CRUST_COST * 1.4;
                  break;
                  
          default:
                  break;
        
    }
      

    return finalCrustCost;

}

    /**
     *This method is used to get the variable FinalCheeseCost.
     * @return - the value of the FinalCheeseCost property.
     */
    public double getFinalCheeseCost(){ 
       
       
       
       double FinalCheeseCost = 0.0;
       
       
        switch (size) {
            case 'S':
                return BASIC_CHEESE_COST;
            case 'M':
                return BASIC_CHEESE_COST * 1.4;
            case 'L':
                return BASIC_CHEESE_COST * 1.8;
            default:
                break;
        }
       
          return FinalCheeseCost; 
       }
    
    /**
     *This method is used to get the variable Toppings cost.
     * @return - the value of the Toppings cost property.
     */
    public double getToppingsCost(){
    
    double toppingscost = 0.0;
    
    
    
        switch (size) {
            case 'S':
                return getNumberOfToppings() * 1.5;
            case 'M':
                return getNumberOfToppings() * 2.0;
            case 'L':
                return getNumberOfToppings() * 2.5;
            default:
                break;
        }
    

return toppingscost;


}

    /**
     *This method is used to get the variable FinalPrice.
     * @param deliveryOption - The deliveryOption can be chosen by the customer.
     * @return - the value of the Toppings cost property.
     */
    public double getFinalPrice(String deliveryOption){

    double FinalPrice = 0;
    switch(deliveryOption){
    
    
        case "D":
            FinalPrice = getFinalCrustCost() + getFinalCheeseCost()+ getToppingsCost()+BASIC_SAUSE_COST+ getDELIVERY_CHARGE();
        case "P":
            FinalPrice = getFinalCrustCost()+getFinalCheeseCost()+getToppingsCost()+ BASIC_SAUSE_COST;
    
    break;
    
    
    }
      return FinalPrice;
       }   

    /**
     *This method is overridden to determine a string representation of an object.
     * @return - The String values are returned.
     */
    @Override
    public String toString() {
        return "Order Name: " +name+"\nAddress: "+address+"\nContact Number: "+contactNumber+"\nPizza size: "+size+"\nNumber of toppings: "+getNumberOfToppings() + "\nCrust cost: $"+getFinalCrustCost()+ "\nSauce cost: $"+ BASIC_SAUSE_COST +"\nCheese cost: $"+getFinalCheeseCost()+"\nToppings cost: $"+getToppingsCost();
    }
          
          
          
       




    
    

    

   
}













        















