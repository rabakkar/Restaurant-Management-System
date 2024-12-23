package oopProjectResturant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/**
    * parameter args the command line arguments
    */
   public static void main(String[] args) {
	   
	
	   
	   //cost is an object of class order use to call areYouSatisfide method
	   
      Order cost = new Order(); 
       
      //These objects use to make the Restaurant menu
      
      RestaurantDishes obj1 = new RestaurantDishes(1,"Margherita Pizza",60); 
      RestaurantDishes obj2 = new RestaurantDishes(2,"Pepperoni Pizza",65); 
      RestaurantDishes obj3 = new RestaurantDishes(3,"Burrata Pizza",69); 
      RestaurantDishes obj4 = new RestaurantDishes(4,"Spaghetti",45); 
      RestaurantDishes obj5 = new RestaurantDishes(5,"Fettucini Alfredo",50); 
      RestaurantDishes obj6 = new RestaurantDishes(6,"Lasagna",55); 
      RestaurantDishes obj7 = new RestaurantDishes(7,"Burrata And Tomato Salad",40); 
      RestaurantDishes obj8 = new RestaurantDishes(8,"Caesar Salad",35); 
      RestaurantDishes obj9 = new RestaurantDishes(9,"Spicy Dynamite Shrimp",55); 
      RestaurantDishes obj10 = new RestaurantDishes(10,"French Fries",20); 
      RestaurantDishes obj11 = new RestaurantDishes(11,"Creme Brulee",40); 
      RestaurantDishes obj12 = new RestaurantDishes(12,"Tiramisu",30); 
      RestaurantDishes obj13 = new RestaurantDishes(13,"Raspberry Gelato",25); 
      RestaurantDishes obj14 = new RestaurantDishes(14,"Malteaser Gelato",27); 
      RestaurantDishes obj15 = new RestaurantDishes(15,"Cola",6); 
      RestaurantDishes obj16 = new RestaurantDishes(16,"Sprite",6); 
      RestaurantDishes obj17 = new RestaurantDishes(17,"Passion Fruit Soda",12); 
      RestaurantDishes obj18 = new RestaurantDishes(18,"Lemonade",11); 
      RestaurantDishes obj19 = new RestaurantDishes(19,"Orange Juice",10); 
      RestaurantDishes obj20 = new RestaurantDishes(20,"Water",5); 
       
       
      
      ArrayList<RestaurantDishes> MainMenu = new ArrayList <RestaurantDishes>(); 
       
       
      MainMenu.add(obj1); 
      MainMenu.add(obj2); 
      MainMenu.add(obj3); 
      MainMenu.add(obj4); 
      MainMenu.add(obj5); 
      MainMenu.add(obj6); 
      MainMenu.add(obj7); 
      MainMenu.add(obj8); 
      MainMenu.add(obj9); 
      MainMenu.add(obj10); 
      MainMenu.add(obj11); 
      MainMenu.add(obj12); 
      MainMenu.add(obj13); 
      MainMenu.add(obj14); 
      MainMenu.add(obj15); 
      MainMenu.add(obj16); 
      MainMenu.add(obj17); 
      MainMenu.add(obj18); 
      MainMenu.add(obj19); 
      MainMenu.add(obj20);  
       

  
         
      /** 
       * Display welcoming Massage to costumer 
       */ 
      System.out.println("*    *    *   *****  **     *****     ***    ***********  *****"); 
      System.out.println("*    *    *   *      **   **     *   *   *   *    *    *  *"); 
      System.out.println("*    *    *   *****  **  **          *   *   *    *    *  *****"); 
      System.out.println("*    *    *   *      **   **     *   *   *   *    *    *  *"); 
      System.out.println("***********   *****  **     *****     ***    *    *    *  *****"); 
      
      System.out.println("Welcome to Salernoo,s Restaurant \nFresh Italian Food !!");

         
        cost.areYouSatisfide(MainMenu); 
         
   }
	        
	      
}//End of Main class
	 
