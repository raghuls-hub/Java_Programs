
import java.util.Scanner;

class Vehicle{
    String type;
    Vehicle(String t){
        type=t;
        System.out.print("Vehicle Created.");
    }
}

class Car extends Vehicle{
    String brand;
    Car(String t,String b){
        super(t);
        brand=b;
        System.out.println("Car Created.");
    }
}

public class Inheritance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Type: ");
        String t = sc.nextLine();
        Vehicle v1 = new Vehicle(t);
        System.out.print("Enter Type: ");
        t = sc.nextLine();
        System.out.print("Enter Brand: ");
        String b = sc.nextLine();
        Car c1 = new Car(t,b);
        sc.close();
    }
}
