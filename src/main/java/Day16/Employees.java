package Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    int id;
    String name;
    int age;
    String address;
    String phoneNumber;

    public Employees() {
    }

    public Employees(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    // Thêm thông tin nhân viên

    public ArrayList<Employees> addEmployee() {
        ArrayList<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees(115, "Hương", 20, "Hà Nội1","01234569"));
        employees.add(new Employees(116, "Viet", 21, "Việt trì","01245697"));
        employees.add(new Employees(117, "Đào", 22, "Hưng Yên","09547896"));
        employees.add(new Employees(118, "Kim", 23, "Cao Bằng","09874562"));
        employees.add(new Employees(119, "Khánh", 24, "Bắc Cạn","04568728"));
        System.out.println("Showing up list of Employees");
        for (Employees e : employees) {
            System.out.println(e);
        }
        return employees;
    }

    public void updateEmployee(ArrayList<Employees> employees){
        //Nhập vào tên nhân viên và tìm kiếm xem tên bạn vừa nhập có trong danh sách không, nếu có tiến hành sửa thông tin nhân viên đó, nếu không thông báo ra không có nhân viên này,
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Entering name of Employees: ");
        name = scanner.nextLine();
        Boolean haveEmployee = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).name.equals(name)) {
                System.out.println("Please change info");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Input ID: ");
                int id = scanner1.nextInt();
                employees.set(i, new Employees(id, name, 35, "Em ơi Hà Nội phố","09568745"));
                haveEmployee =true;
                break;
            }
        }
        if(!haveEmployee){
            System.out.println("The info not found");
        }else {
            System.out.println("The info is after changing: ");
            for (Employees e : employees) {
                System.out.println(e);
            }
        }
    }

    public void removeEmployee(ArrayList<Employees> employees){
        //Nhập vào một mã nhân viên và kiểm tra xem có mã này trong danh sách nhân viên không, nếu có xóa nhân viên đó ra khỏi danh sách, nếu không thông báo là không có nhân viên này.
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Entering ID:");
        id = scanner.nextInt();
        Boolean haveEmployee = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).id==id) {
                System.out.println("Please remove info");
                employees.remove(i);
                haveEmployee =true;
                break;
            }
        }
        if(!haveEmployee){
            System.out.println("The info not found");
        }else {
            System.out.println("After few moment: ");
            for (Employees e : employees) {
                System.out.println(e);
            }
        }
    }


}