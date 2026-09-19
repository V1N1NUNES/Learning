package ModernJava.H_Generics.Models;

public class generic<T>{
    private String nomes[] = new String[10];
    private float valores[] = new float[10];
    private int numerozinhos[] = new int[10];


//    public float multiplicar(T num1, T num2){
//        float result;
//
//        return result = (float)num1 * (float)num2;
//    }

    public void guardaCoisas(T coisa){
        if(coisa instanceof String){
            System.out.println("-------------------------------");
            System.out.println("Guardado junto dos nomes ;)");
            System.out.println("ta ai ó: ");
            for(int i=0;i<10;i++){
                System.out.println(nomes[i]);
            }
            System.out.println("-------------------------------");
        }else if(coisa instanceof Float){
            System.out.println("-------------------------------");
            System.out.println("Guardado na caixinha dos valores ;)");
            System.out.println("ta ai ó: ");
            for(int i=0;i<10;i++){
                System.out.println(valores[i]);
            }
            System.out.println("-------------------------------");
        }else{
            System.out.println("-------------------------------");
            System.out.println("Guardado na caixinha dos numerozinhosinhos ;)");
            System.out.println("ta ai ó: ");
            for(int i=0;i<10;i++){
                System.out.println(numerozinhos[i]);
            }
            System.out.println("-------------------------------");
        }
    }

}
