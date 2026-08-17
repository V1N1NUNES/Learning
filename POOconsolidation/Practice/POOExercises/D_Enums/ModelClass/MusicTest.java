package POOExercises.D_Enums.ModelClass;

public class MusicTest {

    public void testMusic(int option) {
        Music musico;
        if (option == 1) {
            musico = Music.MUSICO;
            System.out.println("É músico bb " + musico.getDescription());
        } else if (option == 2) {
            musico = Music.CANTOR;
            System.out.println("É apenas cantor pae... " + musico.getDescription());
        }
    }
}
