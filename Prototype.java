// a prototype for virtual shopping in a grocery store

package project;

import java.util.Scanner;

public abstract class Prototype {
    float cigprice, nprice, shprice;

    //  function for owner to set price 
        public abstract void setPrice();

    // function to get price
    public float getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prototype own = new Owner();
        
        //query to ask whether the current user is owner or not
        System.out.println("Are you a owner? ");
        char ask = sc.next().charAt(0);
        if (ask == 'y'|| ask == 'Y') {
            own.setPrice();
        }
        char ch;
        float total = 0;
        do {
            System.out.println("Choose any of the followings:\n1. Cigarettes\n2. Noodles\n3. Shampoo\n4. Exit");
            int key = sc.nextInt();
            System.out.println("What is the quantity of the desired product?");
            int quantity = sc.nextInt();
            switch (key) {
                case 1:
                    total += own.cigprice*quantity;
                    break;
                case 2:
                    total += own.nprice*quantity;
                    break;
                case 3:
                    total += own.shprice*quantity;
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct choice!!\n");
                    break;
            }
            System.out.println("For continue press y or Y");
            ch = sc.next().charAt(0);
        } while (ch == 'y'|| ch == 'Y');
        System.out.println("Your total is " + total);
    }
}
