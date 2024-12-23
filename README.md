# Restaurant Management System

## Project Description
The *Restaurant Management System* aims to streamline restaurant operations through a system that allows for menu management, order placement, price analysis, user authentication, and data persistence. This system provides a user-friendly interface, ensuring an easy and efficient experience for both customers and staff.

## Features
1. *Menu Management*  
   - Add, remove, and update dishes in the menu.  
   - Each dish will have an ID, name, and price.  

2. *Order Placement*  
   - Customers can select dishes from the menu to place orders.  
   - Options to add or remove dishes, calculate total price, and display order details.  

3. *Price Analysis*  
   - Search for the dish with the highest price in the menu.  
   - Sort dishes in descending order of price.  

4. *User Authentication*  
   - Login functionality for customers and staff using a username and password.  
   - Verifies credentials and provides appropriate access levels.  

5. *Data Persistence*  
   - Save and retrieve orders from a file (receipts.txt).  
   - Staff can write orders to a file and read saved orders for record-keeping and analysis.  

6. *User-Friendly Interface*  
   - Intuitive menus, prompts, and instructions to enhance usability.  
   - Simplifies the ordering process for customers and staff.  

---

## Project Classes and Design
### *1. Dishes Class*
- Represents a dish with attributes like name.  
- Can be extended to add more functionality in other classes.

### *2. RestaurantMenu Class*
- Manages dishes with attributes such as ID, name, and price.  
- Methods for accessing, modifying, and displaying menu information.

### *3. Order Class*
- *anyThingElse()*: Checks if the user wants to add or remove more dishes.  
- *addOrder()*: Allows customers to add dishes to their menu.  
- *removeOrder()*: Allows customers to remove dishes from their menu.  
- *searchMaxPrice()*: Finds the dish with the highest price in the menu.  
- *totalPrice()*: Calculates the total price of the selected dishes.  
- *sortMaxPrice()*: Sorts dishes in descending order by price.  
- *areYouSatisfide()*: Prompts customers for actions related to the menu.  
- *displayInfo()*: Displays the order details, such as the order number and selected dishes.  
- *toString()*: Returns a string representation of the order.  
- *writeOrdersToFile()*: Writes orders to the receipts.txt file.  
- *readOrdersFromFile()*: Reads saved orders from the receipts.txt file.  

### *4. User Class*
- Handles user login with a default username and password.  
- *authenticate()*: Verifies credentials and returns login status.  

### *5. Login Enum*
- Defines possible login outcomes: SUCCESS, USERNAME_INCORRECT, PASSWORD_INCORRECT.

### *6. Main Class*
- *authenticate()*: Verifies user credentials.  
- *RestaurantDishes()*: Constructor to create a new dish object.  
- *MainMenu.add()*: Adds dish objects to the menu list.  

---

## How to Use
1. Clone the repository and run the project in a Java-supported IDE.  
2. Follow the prompts to manage the menu, place orders, or analyze prices.  
3. Saved orders will be available in the receipts.txt file for future reference.

---

## File Structure
- Dishes.java: Represents individual dishes.  
- RestaurantMenu.java: Handles the menu's functionality.  
- Order.java: Manages order placement and related operations.  
- User.java: Handles user authentication.  
- Main.java: The main entry point for the system.

---

## Future Enhancements
- Add support for multiple users with different access levels.  
- Introduce graphical user interface (GUI) for better interaction.  
- Integrate payment gateway for online payments.

---

### Author
Developed by *Roz*.
