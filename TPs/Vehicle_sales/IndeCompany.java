package Software_Eng_TPs.Design_PatterTP.Vehicle_sales;

import java.util.ArrayList;
import java.util.List;

public class IndeCompany implements Company {
    String name;
    List<Vehicle> vehicles =  new ArrayList<>();

    public IndeCompany(String name) {
        this.name = name;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    @Override
    public void display() {
        System.out.println("Company Name: " + name);
        System.out.println("Vehicles:");
        for  (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
    }
    @Override
    public double CalculateCost() {
        double cost = 1;
        for  (Vehicle vehicle : vehicles) {
            cost*= vehicle.maintainanceCost;
        }
        return cost ;
    }
}
