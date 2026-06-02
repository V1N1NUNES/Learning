package POOExercises.src.Test;

import POOExercises.src.Classes.Car;

import java.util.Scanner;

public class Cars {

    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        Car car = new Car();

        System.out.println("First Car\n");
        System.out.println("Manufacturer: ");
        String manufacturer = read.nextLine();
        System.out.println("Color: ");
        String color = read.nextLine();
        System.out.println("Model: ");
        String model = read.nextLine();
        System.out.println("Year: ");
        int year = read.nextInt();
        System.out.println("Price: ");
        float price = read.nextFloat();
        System.out.println("Category: ");
        String category = read.nextLine();

        car.setManufacturer(manufacturer);
        car.setColor(color);
        car.setModel(model);
        car.setYear(year);
        car.setPrice(price);
        car.setCategory(category);

        System.out.println("Your first car has: \nManufacturer: " + car.getManufacturer() + "\nColor: " + car.getColor() + "\nModel: " + car.getModel() + "\nCategory: " + car.getCategory() + "\nYear: " + car.getYear() + "\nPrice: U$" + car.getPrice());

        System.out.println("Second car\n");
        System.out.println("Manufacturer: ");
        String manufacturer2 = read.nextLine();
        System.out.println("Color: ");
        String color2 = read.nextLine();
        System.out.println("Model: ");
        String model2 = read.nextLine();
        System.out.println("Year: ");
        int year2 = read.nextInt();
        System.out.println("Price: ");
        float price2 = read.nextFloat();
        System.out.println("Category: ");
        String category2 = read.nextLine();

        Car car2 = new Car(manufacturer2, color2, model2, category2, year2, price2);

        System.out.println("Your second car has: \nManufacturer: " + car2.getManufacturer() + "\nColor: " + car2.getColor() + "\nModel: " + car2.getModel() + "\nCategory: " + car2.getCategory() + "\nYear: " + car2.getYear() + "\nPrice: U$" + car2.getPrice());

    }
}
