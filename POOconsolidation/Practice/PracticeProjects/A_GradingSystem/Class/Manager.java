package PracticeProjects.A_GradingSystem.Class;

public class Manager {
    //attributes
    static float[]  notes = new float[30];
    static int ArrayIndex = 0;

    //constructors

    //methods getters and setters

    //other methods
    public static void showNotes(){
        for(float i: notes){
            System.out.println(- i);
            //add Enum class for "approved or disapproved"
        }
    }

    public static float finalNote(float n1, float n2, float n3){
        float result = (n1+n2+n3)/3;

        notes[ArrayIndex] = result;
        ArrayIndex++;

        return result;
    }
}
