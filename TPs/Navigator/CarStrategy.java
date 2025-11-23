package Software_Eng_TPs.Design_PatterTP.Navigator;

public class CarStrategy implements RouteStrategy {
    final int speed = 50;
    @Override
    public double CalculateRoute(int distance) {
        return (double) distance / speed;
    }
    public String toString(){
        return "Car Strategy";
    }
}
