package encapsulation;

import java.util.Scanner;

class Customer {
    private int ID;
    private String Name;
    private String Department;
    private float Salary;

    public Customer(int ID, String Name, String Department, float Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.Salary = Salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public float getSalary() {
        return Salary;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employees :");
        int n = scan.nextInt();
        Customer[] custArr = new Customer[n + 1];
        System.out.println(custArr.length);
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the ID of employee " + i + ":");
            int ID = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the Name of employee " + i + ":");
            String Name = scan.nextLine();
            System.out.println("Enter the Department of employee " + i + ":");
            String Department = scan.nextLine();
            System.out.println("Enter the Salary of employee " + i + ":");
            float Salary = scan.nextFloat();
            custArr[i] = new Customer(ID, Name, Department, Salary);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(custArr[i].getID());
            System.out.println(custArr[i].getName());
            System.out.println(custArr[i].getDepartment());
            System.out.println(custArr[i].getSalary());
            System.out.println();
        }
        scan.close();
    }
}
