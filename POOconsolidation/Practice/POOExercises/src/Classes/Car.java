package POOExercises.src.Classes;

public class Car {
    String manufacturer;
    String model;
    String color;
    String category;
    int year;
    float price;

    //constructors
    public Car(String manufacturer, String model, String color, String category, int year, float price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.category = category;
        this.year = year;
        this.price = price;
    }

    public Car(){
        //void constructor
    }

    //methods getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
