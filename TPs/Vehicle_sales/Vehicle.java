package Software_Eng_TPs.Design_PatterTP.Vehicle_sales;

public class Vehicle {
    String name;
    double maintainanceCost;
    public Vehicle(String name, double maintainanceCost){
        this.name = name;
        this.maintainanceCost = maintainanceCost;
    }
    public String getName() {
        return name;
    }
}
