public class Main {
    public static void main(String[] args) {
        VehicleFactory f1=new VehicleFactory();
        Vehicle a1= f1.getInstance("Car");
        a1.drive();
        a1.park();
        a1= f1.getInstance("Lorry");
        a1.park();
        a1.drive();
    }
}
