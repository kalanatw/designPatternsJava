public class Car implements Vehicle {

    @Override
    public void park() {
        System.out.println("Car is Parking");
    }

    @Override
    public void drive() {
        System.out.println("Car is Driving");
    }
}
