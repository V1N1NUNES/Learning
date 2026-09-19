package ModernJava.F_Execptions.Models;

public abstract class ValidarUsuario {

    public static boolean validacao(int idade) throws IdadeInvalidaExeption {
        boolean status = false;
        status = idade < 18;

        if(status){
            throw new IdadeInvalidaExeption("Menor de idade não pode fi");
            //endpoint program
        }
        return status;
    }
}
