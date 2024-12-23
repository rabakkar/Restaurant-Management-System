package oopProjectResturant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Order {
	


    /**
    * Declare attribute input that get information from user  
    */ 
    Scanner input = new Scanner (System.in);  
 
    private String receiptsFilePath = "receipts.txt";
    private ArrayList<String> allOrders;
    
     /**
     * Declare  boolean attribute (flag)  
     * to control on loops 
     */ 
    boolean flag = false; 
    
     /** 
     * Declare OrderId attribute holds the Order Id 
     */ 
    private String OrderId; 
     
     /** 
     * Declare CostMenu as a static attribute holds the costumer own menu 
     */ 
    public static ArrayList<RestaurantDishes> CostMenu = new ArrayList<>(); 
     
     /** 
     * Non parameterized constructor 
     */ 
    public Order (){ 
      
    	OrderId = null; 
    	allOrders = new ArrayList<>();
        readOrdersFromFile();
        
    }//END of Order constructor (no parameters) 
     
     /** 
     * Order is a constructor of class Order 
     * parameter Costumer Phone Number as Costumer Phone Number 
     */ 
    public Order(String OrderId) { 
        this.OrderId = OrderId; 
        allOrders = new ArrayList<>();
        readOrdersFromFile();
 
    }//END of order constructor (with parameters) 
 
     /**
     * getOrderId a method that returns the Order Id  
     * return Costumer Phone Number as costumer number 
     */ 
    public String getOrderId() { 
        return OrderId; 
    }//END of getOrderId 
 
     /** 
     * setOrderId a method that changes the order ID 
     * parameter OrderId as Order Id 
     */ 
    public void setOrderId(String OrderId) { 
        this.OrderId = OrderId; 
    }//END of setOrderId

     

    /** 
     * this method (anyThingElse) is response on costumer case  
     * so its check if costumer want to continue adding / removing , or not  
     * by : entering yes, to continue adding/removing, or entering no, to stop adding/removing 
     * if yes, it will return true 
     * if no, it will  return false 
     * in another case, the method will display massage to user thats  
     * ask to enter yes or no only, then give him another chance 
     * and this method only will be used in (addOrder) and (removeOrder) methods 
     * return flag 
     */ 
 
    public boolean anyThingElse(){ 
        System.out.println(); 
        System.out.println("would you like Anything else?"); 
        String choice = input.next();    
        if (choice.equalsIgnoreCase("yes")) 
            flag = true; 
        else if (choice.equalsIgnoreCase("no")) 
            flag = false; 
        else{ 
            System.out.println("you entered invalid value!!, please enter yes or no only\n"); 
            return anyThingElse(); 
        }//END of else 
        return flag; 
    }//END of checking user desire method
     

/** 
 * this method (addOrder) has arg from type ArrayList RestaurantDishes and get from costumer two informations: 
 * 1- the ID`s of dish he want to add to his menu 
 * 2- the case if he want to continue or not (from anyThingelse Method)  
 * then at last it return an ArrayList that costumer created 
 * return CostMenu: its a static attribute from type ArrayList that holds costumer created menu 
 * this method has a try and multi catch with do-while loop in the input (orderID)  
 * it will be run if 
 * costumer entered integer that is larger than the size of ArrayList(MainMenu) in createRestaurantMenu(method in RetaurantMenu class) 
 * (IndexOutOfBoundsException) 
 * or if, costumer entered String in (input.nextInt)(InputMismatchException) 
 */ 
 
   public ArrayList<RestaurantDishes> addOrder(ArrayList<RestaurantDishes> Menu){  
    int orderID; 
    boolean select =true; 
    do{     
        try{ 
            while (select==true){ 
                System.out.println(); 
                System.out.println("what would you like to order"); 
                System.out.println("please enter the ID`s of dish that you would like to order"); 
                orderID = input.nextInt(); 
                CostMenu.add(Menu.get(orderID-1)) ; 
                select =anyThingElse();  
            }//end of while 
               
             flag = false; 
         }catch (IndexOutOfBoundsException |InputMismatchException e){ 
            System.out.println("you entered an invalid value!!"); 
            System.out.println("please enter a number between 1-20"); 
            input.next(); // where input is an object of Scanner class  
                          // input.next(); is used to clear the scanner buffer 
            System.out.println(); 
            flag= true;                
        }//end of catch 
        }while (flag==true); //end of do-while catch and try   
 return CostMenu; 
}//end of a method adding objects(orders) to the arrayList
   
   
   /** 
    * this method (removeOrder) has arg from type ArrayList RestaurantDishes and get from costumer two informations: 
    * 1- the IDs of dish he want to remove(by entering the IDs) from his menu  
    * 2- the case if he want to continue or not (from anyThingelse Method)  
    * then at last it return an ArrayList that costumer created after removing 
    * return CostMenu: its the static attribute from type ArrayList that holds costumer created menu 
    * if user entered invalid value (not number)  
    * a massage will display then, he will be given another chance 
    *  
    * make do-while loop to repeat checking on input by try-catch 
    * the try-catch will run when the user enter value is not an integer (NumberFormatException)  
    * or when,  costumer enter integer that is larger than the size of ArrayList of(MainMenu) attribute in method (createRestaurantMenu)in class (RetaurantMenu) 
    *(IndexOutOfBoundsException) 
    * then will give another chance until inputting right value  
    */ 
    
   public ArrayList<RestaurantDishes> removeOrder(ArrayList<RestaurantDishes> Menu){  
       boolean select =true; 
       do{     
           try{ 
               while (select==true){ 
               System.out.println(); 
               System.out.println("what would u like to delete?");  
               System.out.println("Enter the dish ID that u want to cancel"); 
               int IdOfDish = input.nextInt(); 
             
                   if (IdOfDish>=1 || IdOfDish>=20){ 
                       CostMenu.remove(IdOfDish-1); 
                   }//END of lemets check 
                   else{ 
                      System.out.println("you entered invalid value!!, please enter the ID of dish you selected /n"); 
                      removeOrder(Menu); 
                   } 
                   select =anyThingElse();    
               }//END of while 
               flag = false; 
            }catch (IndexOutOfBoundsException |InputMismatchException |NumberFormatException e){ 
               System.out.println("you entered an invalid value!!"); 
               System.out.println("Please enter only the ID of dish" ); 
               System.out.println(); 
               flag= true;                
           }//END of catch 
           }while (flag==true); //END of do-while catch and try  
   
      return CostMenu; 
   }//END of removing orders
   
   /**
    * searchMaxPrice has arg from type ArrayList RestaurantDishes 
    * Firs will check CostMenu 
    * If it was empty The method will hand error by printing massage then give a second chance
    * If it wasn't the method will search on max price among the order
    */
   
   public void searchMaxPrice(ArrayList<RestaurantDishes> Menu){
       if  (CostMenu.isEmpty()){
           System.out.println("take an order first please");  
           areYouSatisfide(Menu);
       }//end of if no order taken
       else{
           RestaurantDishes DishWithMaxPrice = CostMenu.get(0);
           // Find the maximum price
           for (int i=0; i<CostMenu.size();i++) {
               if (CostMenu.get(i).getDishPrice() > DishWithMaxPrice.getDishPrice()) {
                   DishWithMaxPrice = CostMenu.get(i);
               }//end of if
           }//END of for 
           
           System.out.println(DishWithMaxPrice);
       }//End of else
   }//end of a method searchMaxPrice
   
   /** 
    * this method (totalPrice) has arg from type ArrayList RestaurantDishes 
    * the method calculate`s the total price by 
    * getting Price of each items of the arrayList that costumer created (the 
    * static attribute: CostMenu) 
    * 
    * parameter GetPrice as the costumer`s order(CostMenu) 
    * return total 
    */ 
   
   public int totalPrice(ArrayList<RestaurantDishes> GetPrice){ 
       int total = 0; 
       for (int i = 0; i < GetPrice.size(); i++) { 
           total += GetPrice.get(i).getDishPrice(); 
       }//END of for get price 
       return total; 
   }//END of method
   
   
   public void sortMaxPrice(ArrayList<RestaurantDishes> CostMenu) {
       if (CostMenu.isEmpty()) {
           System.out.println("Please take an order first.");
           return;
       }

       // Sort the menu by descending order of price
       Collections.sort(CostMenu, new Comparator<RestaurantDishes>() {
           @Override
           public int compare(RestaurantDishes dish1, RestaurantDishes dish2) {
               return Double.compare(dish2.getDishPrice(), dish1.getDishPrice());
           }
       });

       // Print the sorted menu
       for (RestaurantDishes dish : CostMenu) {
           System.out.println(dish);
       }
   }
   
   /** 
    * this method (areYouSatisfide) has arg from type ArrayList RestaurantDishes and it will get from costumer one information: 
    * the ID`s of the choice he want to select for his menu (1 , 2 ,3 , 4 , 5, 6, 7) 
    * 1, as displaying the Resturant menu by 2D array 
    * 2, as adding dishes to the (CostMenu) attribute  
    * 3, as removing dishes from the (CostMenu) attribute 
    * 4, as displaying the order 
    * 5, as searching the highest price dish in the order
    * 6, as sorting by displaying the menu prices from highest to lowest
    * 7, as checking out  
    */ 
  
    public void areYouSatisfide(ArrayList<RestaurantDishes> Menu){ 
     RestaurantDishes RestMenu = new RestaurantDishes();  
     String[][] menu = new String[20][3]; 
      
     //Dish ID 
     menu[0][0] = "1-"; 
     menu[1][0] = "2-"; 
     menu[2][0] = "3-"; 
     menu[3][0] = "4-"; 
     menu[4][0] = "5-"; 
     menu[5][0] = "6-"; 
     menu[6][0] = "7-"; 
     menu[7][0] = "8-"; 
     menu[8][0] = "9-"; 
     menu[9][0] = "10-"; 
     menu[10][0] = "11-"; 
     menu[11][0] = "12-"; 
     menu[12][0] = "13-"; 
     menu[13][0] = "14-"; 
     menu[14][0] = "15-"; 
     menu[15][0] = "16-"; 
     menu[16][0] = "17-"; 
     menu[17][0] = "18-"; 
     menu[18][0] = "19-"; 
     menu[19][0] = "20-"; 

      
     //Dish name 
     menu[0][1] = "Margherita Pizza"; 
     menu[1][1] = "Pepperoni Pizza"; 
     menu[2][1] = "Burrata Pizza"; 
     menu[3][1] = "Spaghetti"; 
     menu[4][1] = "Fettucini Alfredo"; 
     menu[5][1] = "Lasagna"; 
     menu[6][1] = "Burrata And Tomato Salad"; 
     menu[7][1] = "Caesar Salad"; 
     menu[8][1] = "Spicy Dynamite Shrimp"; 
     menu[9][1] = "French Fries"; 
     menu[10][1] = "Creme Brulee"; 
     menu[11][1] = "Tiramisu"; 
     menu[12][1] = "Raspberry Gelato"; 
     menu[13][1] = "Malteaser Gelato"; 
     menu[14][1] = "Cola"; 
     menu[15][1] = "Sprite"; 
     menu[16][1] = "Passion Fruit Soda"; 
     menu[17][1] = "Lemonade"; 
     menu[18][1] = "Orange Juice"; 
     menu[19][1] = "Water"; 
      
      
     //price 
     menu[0][2] = "60RS"; 
     menu[1][2] = "65RS"; 
     menu[2][2] = "69RS"; 
     menu[3][2] = "45RS"; 
     menu[4][2] = "50RS"; 
     menu[5][2] = "55RS"; 
     menu[6][2] = "40RS"; 
     menu[7][2] = "35RS"; 
     menu[8][2] = "55RS"; 
     menu[9][2] = "20RS"; 
     menu[10][2] = "40RS"; 
     menu[11][2] = "30RS"; 
     menu[12][2] = "25RS"; 
     menu[13][2] = "27RS"; 
     menu[14][2] = "6RS"; 
     menu[15][2] = "6RS"; 
     menu[16][2] = "12RS"; 
     menu[17][2] = "11RS"; 
     menu[18][2] = "10RS"; 
     menu[19][2] = "5RS"; 

      
      
      int totPr; 
      int choice = 0; 
      flag = false; 
      do{ 
           System.out.println(); 
           System.out.println("Select the services you want: \n 1:See the Resturant menu. \n 2:add. \n 3:remove. \n 4:Show me my order. \n 5:Search highest price. \n 6:See the menu prices from highest to lowest. \n 7:Check out.");
           try{ 
               choice = input.nextInt(); 
               flag = false; 
           }//END of try 
           catch (InputMismatchException e){ 
               System.out.println("you entered invalid value!!"); 
               System.out.println("pleas only enter an integer number"); 
               input.next() ; // where input is an object of Scanner class  
                              // input.next(); is used to clear the scanner buffer 
               System.out.println();                
               flag = true; 
               }//END of catch out of bounds | input is not int 
            
       }while (flag==true);//END of do-while catch and try     
       switch(choice){ 
               case 1:  
                for (int row = 0; row < 20; row++) 
                { 
                 for (int col = 0; col < 3; col++) 
                 { 
                  System.out.print(menu[row][col] + " "); 
                 }  // end of for loop of col 
                  
                 System.out.println( ); 
                }  // end of for loop of row 
                 
                   areYouSatisfide(Menu); 
                   break; 
               case 2:  
                addOrder(Menu);
                areYouSatisfide(Menu); 
                break; 
            case 3: 
             removeOrder(Menu);                   
                areYouSatisfide(Menu); 
                 break; 
            case 4: 
                System.out.println("\nyour order now is:"); 
                displayInfo(); 
                areYouSatisfide(Menu); 
                break; 
            case 5: 
                searchMaxPrice(Menu);                   
                areYouSatisfide(Menu); 
                 break; 
            case 6:
            	sortMaxPrice(Menu);
                areYouSatisfide(Menu); 
            	break;
            case 7:
                System.out.println("Your receipt:" );
                displayInfo();
                totPr = totalPrice(CostMenu);
                System.out.println("your bill is : " + totPr);
                break;
            default:
                System.out.println("please!!\n only enter a number of these (from 1 to 6)/n");
                areYouSatisfide(Menu);

        }//END of switch cases  
}//END of checking user desire method
    
    /**
    * this method (displayInfo) 
    *  prints what did costumer order (the static attribute: CostMenu)  
    */
   public void displayInfo(){
       for (int i = 0 ; i<CostMenu.size();i++)
       System.out.println(CostMenu.get(i));
   }//END of displayInfo
   
    /**
    * toString a method that prints the Order Id
    * return Order Id
    */
   @Override
   public String toString(){
       return ("Order Id =" + OrderId);
       }//END of toString 
   
   public void writeOrderIntoFile() {
       String info = "Your receipt:\n";
       for (int i = 0; i < CostMenu.size(); i++) {
           info += CostMenu.get(i);
       }
       info += "your bill is : " + totalPrice(CostMenu) + "\n";
       info += "==========================\n";
       allOrders.add(info);
       try {
           FileWriter fileWriter = new FileWriter(receiptsFilePath);
           for (String order : allOrders) {
               fileWriter.write(order);
           }
           fileWriter.close();
           System.out.println("Receipts info has been written to file " + receiptsFilePath);
       } catch (Exception e) {
           System.out.println("Error writing admins to file: " + e.getMessage());
       }

   }

   public void readOrdersFromFile() {
       allOrders = new ArrayList<>();
       try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader(receiptsFilePath));
           String currLine;
           String receiptInfo = "";
           while ((currLine = bufferedReader.readLine()) != null) {
               currLine = currLine.trim();
               if (currLine.equals("==========================")) {
                   receiptInfo += currLine.trim() + "\n";
                   allOrders.add(receiptInfo);
                   receiptInfo = "";
               } else {
                   receiptInfo += currLine.trim() + "\n";
               }
           }
           bufferedReader.close();
       } catch (Exception e) {
           
       }
   }
   }//END of Order Class
                