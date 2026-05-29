package POOExercises.src.Classes;

public class Estudant {
    String name;
    int age;
    float[] results;

    //constructor
    public Estudant(String name, int age, float[] results){
        this.name = name;
        this.age = age;
        this.results = results;
    }

    //view and update methods
    public void getEstudantResult(Estudant people){
        float average = 0.0f;
        float sum = 0.0f;

        System.out.println("Estudant name: " +  people.name);
        System.out.println("Estudant age: " + people.age);
        for(int i = 0; i<results.length; i++){
            System.out.println( i+1 + " Estudant result: " + results[i]);

            sum += results[i];
            average =  sum/3;
        }

        System.out.println("Average result: " + average);
        if(average <= 5.99){
            System.out.println("REJECTED");
        }else {
            System.out.println("APPROVED");
        }
    }
}
