package Day16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Products pr = new Products();
        ArrayList<Products> products = pr.addProduct();
        pr.searchProduct(products, "Cigar");
        pr.deleteProduct(products, 120);


        Employees employee = new Employees();
        ArrayList<Employees> employees = employee.addEmployee();
        employee.updateEmployee(employees);
        employee.removeEmployee(employees);
    }
}
