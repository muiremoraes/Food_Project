/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

import java.util.*;

/**
 *
 * @author marym
 */
public class LinkedListFood {
    
    private LinkedList<FoodItem> foodList;
    
    public LinkedListFood(){
        foodList = new LinkedList<>();
    }
    //creates instance of LinkedListFood class
    
     public void addFood(FoodItem food) {
        foodList.add(food);
    }
     //adding a food to the food list 
    
     
     public FoodItem recentFoodItem() {         
        if (!foodList.isEmpty()) {
            return foodList.get(foodList.size()-1); //getting the size of list minus 1 to get most recently added thing
        } else {
            return null;
        }
    }
    // if not empty then return 0 in the list which is most recent 
    //if it is empty return null
     
     public int howManyItem(){
         return foodList.size();
     }
     //returns how many items in the linked list
     
      public boolean isEmpty() {
        return foodList.isEmpty();
    }
   // returns true or false depending on if the list is empty ot not
          
       public FoodItem searchFood(String foodItem) {
        for (FoodItem f : foodList) {
            //.contain means u find piece of that string in the name of the song 
            if (f.getName().contains(foodItem)) {
                return f;
            }
        }
        return null;
    }
       
      public void deleteFood(String foodItem){ // delete the sting food item
          FoodItem foodsearch = this.searchFood(foodItem); //search food item  make something equal that search
          if ((foodsearch != null)) { //if not not rqual to null than remove it 
            foodList.remove(foodsearch);
          }
        
} 

    int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
}
