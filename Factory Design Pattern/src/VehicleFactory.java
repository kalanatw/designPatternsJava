public class VehicleFactory {

    public Vehicle getInstance(String str) {
        try {


            if ((str.equals("Car")) || str.equals("car")) {
                return new Car();
            } else if ((str.equals("Lorry")) || str.equals("lorry")) {
                return new Lorry();
            } else {


                System.out.println("Invalid");
            };
        }
        catch (Exception ex){
            System.out.println("Invalid Input");
        }
        return null;
    }

}
