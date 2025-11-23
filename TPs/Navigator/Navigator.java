package Software_Eng_TPs.Design_PatterTP.Navigator;

import java.util.Scanner;

public class Navigator {
    String Strategy;
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(int choice) {
        switch (choice) {
            case 1:
                this.routeStrategy = new WalkingStrategy();
                break;
            case 2:
                this.routeStrategy = new CarStrategy();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public void execute(int distance) {
        System.out.println("Navigator executing...");
        System.out.println("Route Strategy: " + routeStrategy);
        System.out.println("Time : " +  routeStrategy.CalculateRoute(distance) + " hours" );
    }

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        System.out.println("Welcome to the Route Strategy");
        System.out.println("Please enter the Route Strategy: ");
        System.out.println("1) Walking");
        System.out.println("2) Car");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        navigator.setRouteStrategy(choice);
        System.out.println("Enter Route Distance in km");
        int distance = sc.nextInt();
        navigator.execute(distance);
    }
}