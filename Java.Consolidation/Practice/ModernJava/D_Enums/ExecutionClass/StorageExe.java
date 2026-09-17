package ModernJava.D_Enums.ExecutionClass;

import java.util.Scanner;

public class StorageExe {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int select, option;

            System.out.println("Chose Size Tshirt: \n-1: Child\n-2 P(Small)\n-3 Medio(medium)\n-4 large(grande)\n-5 ExtraLarge(gordox)\n-6 SuperLarge(gordo abissal)");
            option = r.nextInt();
            System.out.println("how many Tshirts for this size?");
            int quant = r.nextInt();

            System.out.println("Add new products in the bag?\n1- yes  2- No");
            select = r.nextInt();

    }
}
