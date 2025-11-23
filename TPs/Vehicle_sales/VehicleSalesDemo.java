package Software_Eng_TPs.Design_PatterTP.Vehicle_sales;

public class VehicleSalesDemo {
    public static void main(String[] args) {
        IndeCompany company1 = new IndeCompany("Toyota Dealers");
        company1.addVehicle(new Vehicle("Camry", 500));
        company1.addVehicle(new Vehicle("Corolla", 400));

        IndeCompany company2 = new IndeCompany("Honda Dealers");
        company2.addVehicle(new Vehicle("Civic", 450));
        company2.addVehicle(new Vehicle("Accord", 550));


        ParentCompany parent = new ParentCompany("Auto Group");
        parent.addCompany(company1);
        parent.addCompany(company2);

        parent.display();

        System.out.println("Total maintenance cost: " + parent.CalculateCost());
    }
}
