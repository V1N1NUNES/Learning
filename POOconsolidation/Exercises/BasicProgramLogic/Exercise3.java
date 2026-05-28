package BasicProgramLogic;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        float payment;
        double taxes;
        Scanner read = new Scanner(System.in);

        System.out.println("Payment value: \n");
        payment = read.nextFloat();

        taxes = payment < 1000 ? payment * 0.05 : payment >= 1000 && payment < 2000 ? payment * 0.1 : payment >= 2000 && payment < 4000 ? payment * 0.15 : payment >= 4000 ? payment * 0.2 : 0;
        double SalePaymenttaxes = payment - taxes;


        System.out.println("Your payment: "+ payment + "\nYour taxes about payment: "+ taxes + "\nSale payment: " + SalePaymenttaxes);
    }
}
