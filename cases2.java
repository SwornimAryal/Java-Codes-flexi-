// case study 2: case 2
class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + (0.05 * baseSalary);
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 2000;
    }
}

class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (0.10 * baseSalary);
    }
}

public class cases2 {
    public static void main(String[] args) {

        Employee e = new Employee("Swornim", 10000);
        Manager m = new Manager("Rahul", 10000);
        Executive ex = new Executive("Amit", 10000);

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Executive Salary: " + ex.calculateSalary());
    }
}