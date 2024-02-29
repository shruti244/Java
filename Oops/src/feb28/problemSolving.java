package feb28;
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}   
public class problemSolving {

	public static void main(String[] args) {
        // Creating an Employee
        Employee emp1 = new Employee();
        /*emp1.name = "triveni";
        emp1.age = 19;
        emp1.phoneNumber = "753148920";
        emp1.address = "thane";
        emp1.salary = 50000.00;
        */

        // Creating a Manager
        Manager m1 = new Manager();
        m1.name = "Shruti";
        m1.age = 20;
        m1.phoneNumber = "8765432190";
        m1.address = "kalyan";
        m1.salary = 80000.00;
        m1.department = "Human Resources";
        emp1.specialization = "Software Development";

        // Printing details
        System.out.println("Manager Details -");
        System.out.println("Name: " + m1.name);
        System.out.println("Age: " + m1.age);
        System.out.println("Phone Number: " + m1.phoneNumber);
        System.out.println("Address: " + m1.address);
        m1.printSalary();
        System.out.println("Specialization: " + emp1.specialization);
        System.out.println("Department: " + m1.department);
    }
}

