import java.util.Scanner;

public class CoffeApp {
    private static CoffeApp app;
    private CoffeApp(){}

    public static CoffeApp getInstance(){
        if (app==null){
            app =new CoffeApp();
        }
        return app;
    }
    public void coffeemain(){
        System.out.println("Hello Welcome to Coffee Shop \n\n.................\n\nEach coffee is 5$");

    }
    public int addCoffee(int num){
        Scanner x=new Scanner(System.in);
        int price=num*5;
        System.out.println("Your Price is:"+price+"$");
        return price;
    }
}

