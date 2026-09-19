package ModernJava.F_Execptions.Models;

public class IdadeInvalidaExeption extends RuntimeException{
    public IdadeInvalidaExeption(String message){
        super(message);
    }
    public IdadeInvalidaExeption(){
    }
}
