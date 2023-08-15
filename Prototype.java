// a prototype for virtual shopping in a grocery store

package project;

import java.util.Scanner;

public abstract class Prototype {
    float cigprice, nprice, shprice, quantity;

    // function for owner to set price
    public abstract void setPrice();

    // function to get price
    public float getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prototype own = new Owner();
        System.out.println("Are you a owner? ");
        char ask = sc.next().charAt(0);
        if (ask == 'y') {
            own.setPrice();
        }
        char ch;
        float total = 0;
        do {
            System.out.println("Choose any of the followings:\n1. Cigarettes\n2. Noodles\n3. Shampoo\n4. Exit");
            int key = sc.nextInt();

            switch (key) {
                case 1:
                    total += own.cigprice;
                    break;
                case 2:
                    total += own.nprice;
                    break;
                case 3:
                    total += own.shprice;
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct choice!!\n");
                    break;
            }
            System.out.println("Continue?");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        System.out.println("Your total is " + total);
    }
}
