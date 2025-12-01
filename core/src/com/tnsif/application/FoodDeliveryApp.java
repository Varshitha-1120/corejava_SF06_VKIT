package com.tnsif.application;

import java.util.Scanner;

import com.tnsif.onlinefooddelivery.Customer;
import com.tnsif.onlinefooddelivery.DeliveryPerson;
import com.tnsif.onlinefooddelivery.Fooditem;
import com.tnsif.onlinefooddelivery.Order;
import com.tnsif.onlinefooddelivery.Restaurant;
import com.tnsif.services.FoodDeliveryService;
import com.tnsif.services.FoodDeliveryServicesImpl;

public class FoodDeliveryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodDeliveryService service = new FoodDeliveryServicesImpl();

        int choice;

        do {
            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: adminMenu(service, sc); break;
                case 2: customerMenu(service, sc); break;
                case 3: System.out.println("Exiting..."); break;

                default: System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    // ===============================================================
    // ADMIN MENU
    // ===============================================================
    private static void adminMenu(FoodDeliveryService service, Scanner sc) {
        int ch;
        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item");
            System.out.println("3. Remove Food Item");
            System.out.println("4. View Restaurants and Menu");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person");
            System.out.println("8. Exit");
            System.out.print("Choose: ");
            ch = sc.nextInt();

            int id, rid, fid;
            String name;
            double price;

            switch (ch) {
                case 1:
                    System.out.print("Restaurant ID: ");
                    rid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Restaurant Name: ");
                    name = sc.nextLine();
                    service.addRestaurant(new Restaurant(rid, name));
                    System.out.println("Restaurant added successfully!");
                    break;

                case 2:
                    System.out.print("Restaurant ID: ");
                    rid = sc.nextInt();
                    System.out.print("Food Item ID: ");
                    fid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Food Name: ");
                    name = sc.nextLine();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    service.addFoodItemToRestaurant(rid, new Fooditem(fid, name, price));
                    break;

                case 3:
                    System.out.print("Restaurant ID: ");
                    rid = sc.nextInt();
                    System.out.print("Food Item ID: ");
                    fid = sc.nextInt();
                    service.removeFoodItemFromRestaurant(rid, fid);
                    break;

                case 4:
                    for (Restaurant r : service.getAllRestaurants()) {
                        System.out.println(r);
                        for (Fooditem fi : r.getMenu()) {
                            System.out.println(" - " + fi);
                        }
                    }
                    break;

                case 5:
                    for (Order o : service.getAllOrders()) {
                        System.out.println(o);
                    }
                    break;

                case 6:
                    System.out.print("Delivery Person ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Contact: ");
                    long cno = sc.nextLong();
                    service.addDeliveryPerson(new DeliveryPerson());
                    break;

                case 7:
                    System.out.print("Order ID: ");
                    int oid = sc.nextInt();
                    System.out.print("Delivery Person ID: ");
                    id = sc.nextInt();
                    service.assignDeliveryPersonToOrder(oid, id);
                    break;

                case 8:
                    System.out.println("Exiting Admin Menu...");
                    break;
            }

        } while (ch != 8);
    }

    // ===============================================================
    // CUSTOMER MENU
    // ===============================================================
    private static void customerMenu(FoodDeliveryService service, Scanner sc) {
        int ch;
        do {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            ch = sc.nextInt();

            int id, rid, fid, qty;
            String name;

            switch (ch) {
                case 1:
                    System.out.print("User ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Contact No: ");
                    long cno = sc.nextLong();
                    service.addCustomer(new Customer(id, name, cno));
                    break;

                case 2:
                    for (Restaurant r : service.getAllRestaurants()) {
                        System.out.println(r);
                        for (Fooditem fi : r.getMenu()) {
                            System.out.println(" - " + fi);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Customer ID: ");
                    id = sc.nextInt();
                    System.out.print("Restaurant ID: ");
                    rid = sc.nextInt();
                    System.out.print("Food Item ID: ");
                    fid = sc.nextInt();
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    service.addFoodToCart(id, rid, fid, qty);
                    break;

                case 4:
                    System.out.print("Customer ID: ");
                    id = sc.nextInt();
                    Customer c = service.findCustomerById(id);
                    double total = 0;
                    for (Fooditem fi : c.getCart().getItems().keySet()) {
                        int q = c.getCart().getItems().get(fi);
                        double cost = fi.getPrice() * q;
                        total += cost;
                        System.out.println("Food: " + fi.getName() + ", Qty=" + q + ", Cost=" + cost);
                    }
                    System.out.println("Total: " + total);
                    break;

                case 5:
                    System.out.print("Customer ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Delivery Address: ");
                    String addr = sc.nextLine();
                    Order o = service.placeOrder(id, addr);
                    System.out.println("Order placed! ID: " + o.getOrderId());
                    break;

                case 6:
                    for (Order o2 : service.getAllOrders()) {
                        System.out.println(o2);
                    }
                    break;

                case 7:
                    System.out.println("Exiting Customer Menu...");
                    break;
            }

        } while (ch != 7);
    }
}