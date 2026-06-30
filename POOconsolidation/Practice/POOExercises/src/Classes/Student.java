package POOExercises.src.Classes;

public class Student {

    //attributes
    private final String name;
    private final int age;
    private float[] notes = new  float[3];


    //constructor
    public Student(String name, int age, float[] notes) {
        this.name = name;
        this.age = age;
        this.notes = notes;
    }


    //methods
    public void getStudent(){
        System.out.println("\nStudent name is "+ this.name +"\n");
        System.out.println("Student age is "+ this.age +"\n");

        for(int i=0; i<this.notes.length; i++) {

            System.out.println("The " + (i+1) + " note is: " + notes[i]);
        }
    }

    public void studentAverage(){
        float sum = 0;

        for(float note:this.notes){
            sum += note;
        }
        sum /= notes.length;
        System.out.println("The avarege notes is: " + sum);

        if (sum < 6){
            System.out.println("\nStudant is not approved! I'm sorry...\n");
            return;
        }
        else {
            System.out.println("\nStudant is approved! Congratulations!\n");
            return;
        }
    }
}
