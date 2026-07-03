package PracticeProjects.CarRental.Models;

public class Client {
    private String id;
    private String name;
    private String email;
    private int age;

    //constructors
    public Client(String id, String name, String email, int age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public Client(){

    }

    //methods getters and setters
    public void showClient(){
        System.out.println("Client " + "Id:" + this.id+ "Name:" + this.name+ "MailContact:" +this.email + " Client Age:"+ this.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
