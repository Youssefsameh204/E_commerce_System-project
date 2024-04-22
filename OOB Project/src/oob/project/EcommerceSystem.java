package oob.project;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce System!");
        ElectronicProduct smartphone = new ElectronicProduct("Samsung", 1, 1, "Smart Phone", 599.99f);
        ClothingProduct tshirt = new ClothingProduct("Medium", "Cotton", 2, "T_Shirt", 19.99f);
        BookProduct OOP = new BookProduct("O’Reilly", "X Publications", 3, "OOP", 39.99f);
        Customer youssef = new Customer();
        System.out.println("please Enter your Id ");
        youssef.setCustomerId(in.nextInt());
        System.out.println("please Enter your Name ");
        youssef.setName(in.next());
        System.out.println("please Enter your address ");
        youssef.setAddress(in.next());
        System.out.println("How many products you want to add to your cart ? ");
        Cart c1 = new Cart();
        c1.setnProducts(in.nextInt());
        c1.setCustomerId(youssef.getCustomerId());
        int x = 0;
        for (int i = 1; i <= c1.getnProducts(); i++) {
System.out.println("Which product would you like to add ? 1_" + smartphone.getName() + " 2_" + tshirt.getName() + " 3_" + OOP.getName());
            int choose = in.nextInt();
            if (choose == 1) {
                c1.addProduct(smartphone, x);
                x++;
            } else if (choose == 2) {
                c1.addProduct(tshirt, x);
                x++;

            } else if (choose == 3) {
                c1.addProduct(OOP, x);
                x++;

            } else {
                System.out.println("invalid! choose 1 or 2 or 3 only.");
                i--;
            }
        }
        Order youssefOrder = new Order(c1);
        youssefOrder.setCustomerId(c1.getCustomerId());
        youssefOrder.setnProducts(c1.getnProducts());
        youssefOrder.setTotalPrice(c1.getTotalPrice());
        System.out.println("Your total is : $" + youssefOrder.getTotalPrice() + " Would you like to place the order? 1_yes  2-no ");
        int verify = in.nextInt();
        if (c1.placeOrder(verify)) {
            youssefOrder.printOrderInfo(c1);
        } else {
            System.out.println("End of program");
        }

    }

}
