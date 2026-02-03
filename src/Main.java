import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("LET THE GAMES BEGIN!!\n\n\n");
            System.out.printf("Select your champion:\n(1)- Wiazard\n(2)- Healer\n(3)- Warrior\n\n"); //tratamento de erro para a leitura dos "\n"
            option = sc.nextInt();


            //tratamento de erro de digitação
            if(option < 0 || option > 3)
            {
                System.out.printf("Character not found, try again...\n\n");
            }
        }while(option < 0 || option > 3);


        switch (option){
            case 1:
                String name;
                Scanner crt1 = new Scanner(System.in);

                Wizard wizard = new Wizard();
                System.out.printf("Your champion is a Wizard! 🧙‍♂️\n");

                System.out.printf("Name: %s\n");
                name = crt1.nextLine();

                wizard.getName(name);
                crt1.close();
        }
    }
}
