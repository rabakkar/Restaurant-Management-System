package oopProjectResturant;
import java.util.*;
import java.util.ArrayList;

public class RestaurantDishes extends Dishes   {
	
	

	     /**
	     * Declare DishId attribute holds the dish`s id in the menu 
	     */ 
	    private long DishId; 
	     
	 
	     /** 
	     * Declare DishPrice attribute holds the dish`s price in the menu 
	     */ 
	    private int DishPrice; 
	     
	   
	     /** 
	     * Non parameterized constructor 
	     */ 
	    public RestaurantDishes() { 
	      
	     super(null); 
	     DishId = 0; 
	     DishPrice = 0; 
	    }    //END of RestaurantMenu constructor (no parameters) 
	 
	     
	     /** 
	     * Dishes is a constructor of class Dishes 
	     * parameter DishId as the id number of the dish 
	     * DishName as the name of the dish 
	     * parameter DishPrice as the price of the dish 
	     */ 
	    public RestaurantDishes(int DishId, String DishName, int DishPrice){ 
	     super(DishName); 
	        this.DishId = DishId; 
	        this.DishPrice = DishPrice; 
	    }//END of Dishes constructor (with parameters) 
	 
	     /**
	     * getDishId a method that returns the id of the dish 
	     * return DishId 
	     */ 
	    public long getDishId() { 
	  return DishId; 
	 } 
	 
	     /**
	     * setDishId a method that changes the id number of the dish 
	     * parameter DishId as the new id 
	     */ 
	    public void setDishId(long DishId){ 
	        this.DishId = DishId; 
	    }//END of setDishId 
	        
	     
	     /**
	     * getDishPrice a method that returns the price of the dish 
	     * return DishPrice 
	     */ 
	    public int getDishPrice(){ 
	        return DishPrice; 
	    }//END of getDishPrice 
	     
	     /**
	     * setDishPrice a method that changes the price of the dish 
	     * parameter DishPrice as the new dish's price 
	     */ 
	    public void setDishPrice(int DishPrice){ 
	        this.DishPrice = DishPrice; 
	    }//END of setDishPrice 
	     
	    
	     /** 
	     * displayInfo  
	     * prints the restaurant`s menu  
	     */ 
	    public void displayInfo(ArrayList<RestaurantDishes> Menu){ 
	        for (int i = 0 ; i<Menu.size();i++) 
	          System.out.println(Menu.get(i)); 
	    }//END of the method displayInfo  
	     
	     /**
	     * toString shows a specific item from the list 
	     * return a as the item 
	     */ 
	    @Override 
	    public String toString(){ 
	        String a = (getDishId()+"- " +super.getDishName()+ " :" + getDishPrice()+"Rs\n"); 
	        return a; 
	    }//END of toString
}//End of class RestaurantDishes
