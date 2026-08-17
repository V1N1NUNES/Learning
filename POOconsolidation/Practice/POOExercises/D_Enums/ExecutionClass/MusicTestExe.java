package POOExercises.D_Enums.ExecutionClass;

import POOExercises.D_Enums.ModelClass.Music;
import POOExercises.D_Enums.ModelClass.MusicTest;

import java.util.Scanner;

public class MusicTestExe {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("É um músico de verdade?:\n1- Músico\n2- Cantor");
        int option = r.nextInt();

        MusicTest test = new MusicTest();

        test.testMusic(option);

    }
}
