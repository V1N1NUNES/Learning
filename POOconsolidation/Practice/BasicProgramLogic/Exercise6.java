package BasicProgramLogic;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        float CarPrice;
        int installments;
        double priceInstallments;
        Scanner read  = new Scanner(System.in);


        System.out.println("What's Car price?:\n");
        CarPrice= read.nextFloat();
        System.out.println("How manu installments?:\n");
        installments = read.nextInt();

        for(; installments<CarPrice;  installments--){
            if(installments > 60 ){
                System.out.println("Sorry, but we can't divide in"+ installments + "times!\n");
                break;
            }
            System.out.println("installments quantity: "+ installments + "\n price of installment: "+ CarPrice);
        }
    }
}
