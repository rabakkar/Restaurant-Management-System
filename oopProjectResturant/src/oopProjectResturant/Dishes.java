package oopProjectResturant;

public class Dishes {


     /** 
     * Declare DishName attribute holds the dish`s name in the menu 
     */ 
    private String DishName; 
     
     /**
     * Non parameterized constructor 
     */ 
  public Dishes() { 
      
     DishName = null; 
     
    }//END of RestaurantMenu constructor (no parameters) 
     
    /**
     * Dishes is a constructor of class Dishes 
     * parameter DishName as the name of the dish 
     */ 
    public Dishes(String DishName){ 
         
        this.DishName = DishName; 
         
    }//END of Dishes constructor (with parameters) 
     
    /**
     * getDishName a method that returns the name of the dish 
     * return DishName 
     */ 
    public String getDishName(){ 
        return DishName; 
    }//END of getDishName 
     
    /** 
     * setDishName a method that changes the name of the dish 
     * parameter DishName as the new dish's name 
     */ 
    public void setDishName(String DishName){ 
        this.DishName = DishName; 
    }//END of setDishName

}
