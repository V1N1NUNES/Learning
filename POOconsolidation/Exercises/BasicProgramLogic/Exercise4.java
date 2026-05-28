package BasicProgramLogic;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        int number;
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Enter with a number 1 to 7: \n" );
            number = read.nextInt();

            switch(number){
                case 1:
                    System.out.println("It's a Monday!\n");
                    continue;
                case 2:
                    System.out.println("It's a Tuesday!\n");
                    continue;
                case 3:
                    System.out.println("It's a Wednesday!\n");
                    continue;
                case 4:
                    System.out.println("It's a Thursday!\n");
                    continue;
                case 5:
                    System.out.println("It's a friday!\n");
                    continue;
                case 6:
                    System.out.println("It's a Saturday!\n");
                    continue;
                case 7:
                    System.out.println("It's a Sunday!\n");
                    continue;
                default:
                    System.out.println("Sorry, but don't exist this day in the week calendar Baby!!!!!!\n");
                    System.exit(0);
            }
        }while(number<=7 && number>=1);
    }
}
