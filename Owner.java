package project;

import java.util.Scanner;

public class Owner extends Prototype {
    Scanner sc = new Scanner(System.in);

    public void setPrice() {
        char ch;
        do {

            System.out.println("Enter the product:\n1. Cigarettes\n2. Noodles\n3. Shampoo");
            int key = sc.nextInt();
            if (key != 1 && key != 2 && key != 3) {
                System.exit(0);
            }
            System.out.println("Enter the price: ");
            float pr = sc.nextFloat();
            if (key == 1) {
                cigprice = pr;
            } else if (key == 2) {
                nprice = pr;
            } else if (key == 3) {
                shprice = pr;
            }
            System.out.println("Continue?(y or Y)");
            ch = sc.next().charAt(0);
        } while (ch == 'y'|| ch == 'Y');
    }
}
