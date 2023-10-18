import products.Product;
import vehicles.*;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Land Vehicles");
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));
        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(200, 120, new Product(10000, 3, "2015 Dacia Duster"), new Engine(100, 150));
        car.startEngine();
        Engine betterEngine = new Engine(300, 400);
        car.setEngine(betterEngine);
        System.out.println(car.getHp());


        System.out.println("Water Vehicles");
        Speedboat speedboat = new Speedboat(500, 90, new Product(40_000, 1, "Flying Dutchman"), new Motor(250, 300), "flat-bottom");
        speedboat.startEngine();
        Motor betterMotor = new Motor(300, 400);
        speedboat.setMotor(betterMotor);
        System.out.println(speedboat.getHullType());
        System.out.println(speedboat.getHp());
        System.out.println(speedboat.getTitle());
        speedboat.stopEngine();

        Kayak kayak = new Kayak(30, 8, new Product(300, 2, "AquaTec"), "round-bottom");
        System.out.println(kayak.getHullType());
        System.out.println(kayak.getPrice());
        System.out.println(kayak.getTitle());


        System.out.println("Air Vehicles");
        Plane plane = new Plane(120000, 2000, new Product(1000000, 1, "Emirates"), new Motor(500, 900), "primary & secondary", "fully articulated", 700);
        plane.startEngine();
        System.out.println(plane.getTitle());
        System.out.println(plane.getPrice());
        System.out.println(plane.getRadarType());
        System.out.println(plane.getRotorType());
        System.out.println(plane.getThrust());
        plane.stopEngine();

        Helicopter helicopter = new Helicopter(115, 201, new Product(804_000, 5, "The Flying One"), "Electronically Scanned Array (AESA) radar", "semirigid", 8976);
        System.out.println(helicopter.getTitle());
        System.out.println(helicopter.getPrice());
        System.out.println(helicopter.getRadarType());
        System.out.println(helicopter.getRotorType());
        System.out.println(helicopter.getThrust());


    }
}
