import java.util.Scanner;

public class Exercise1 {

   private static class People{
       //variables declare
       String name;
       String location;
       String phone;

       //Class people constructor
       public People(String name,String location,String phone){
           this.name=name;
           this.location=location;
           this.phone=phone;
       }

       public String getName(){
           return name;
       }
       public String getLocation(){
           return location;
       }
       public String getPhone(){
           return phone;
       }
   }


    public static void main(String[] args) {
       //variables declare on main
        String name;
        String location;
        String phone;
        Scanner read = new Scanner(System.in);

        //Reading output
        System.out.println("Text your name: \n");
        name = read.nextLine();
        System.out.println("Text your location: \n");
        location = read.nextLine();
        System.out.println("Text your phone: \n");
        phone = read.nextLine();

        //initialization for people variable
        People people = new People(name,location,phone);

        //Print result and data
        System.out.println("O " + name +  ",domiciliado no endereço " + people.location +  ", e telefone " +  people.phone +  " não possui nenhum tipo de pendencia.");
    }
}
