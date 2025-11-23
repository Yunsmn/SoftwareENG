package Software_Eng_TPs.Design_PatterTP.Vehicle_sales;

import java.util.ArrayList;
import java.util.List;

public class ParentCompany implements Company {
    String name;
    List<Company> companies =  new ArrayList<>();

    public ParentCompany(String name) {
        this.name = name;
    }

    public void addCompany(Company company) {
        companies.add(company);
    }
    public void removeCompany(Company company) {
        companies.remove(company);
    }
    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Companies: ");
        for (Company company : companies) {
            company.display();
        }
    }
    @Override
    public double CalculateCost() {
        double cost = 0;
        for (Company company : companies) {
            cost*= company.CalculateCost();
        }
        return cost;
    }
}
