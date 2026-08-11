package POOExercises.A_Classes;

public class Students {
    //attributes
    private String name;
    private int age;
    private String id;
    private String grade;
    //private Students []Students =  new Students[10];

    //constructors
    public Students(String name, int age, String id, String grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
    }

    public Students() {
        //void constructor
    }

    //get and set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //other methods
    public void showStudent() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Id: " + this.id);
        System.out.println("Grade: " + this.grade);
    }
//    public void ShowAllStudents() {
//        for(Students s: Students) {
//            s.showStudent();
//        }
//    }
}
