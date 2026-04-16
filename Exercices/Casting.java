public class Casting {



    public static void main(String[] args) {

        //this class created for practice casting transformations

        //widening (alargamento)
        int num1 = 999999999;
        double num2 = num1;

        //narrowing (estreitamento) - danger
        double num3 =  999999999D;
        int num4 = (int) num3;
        float num5 = 999999999.999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999f;


        System.out.println("Numbers");
    }

}
