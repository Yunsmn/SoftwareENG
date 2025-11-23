package Software_Eng_TPs.Design_PatterTP.Navigator;

public class WalkingStrategy implements RouteStrategy {
    final int Speed = 8;
    @Override
    public double CalculateRoute(int distance) {
        return (double) distance /Speed;
    }

    @Override
    public String toString() {
        return "WalkingStrategy";
    }
}
