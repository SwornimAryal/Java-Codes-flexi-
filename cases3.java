// case study 3: case 1
abstract class Plan {
    private String patientName;
    private double baseFee;

    public Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }
    public String getPatientName() {
        return patientName;
    }
    public double getBaseFee() {
        return baseFee;
    }
    abstract double calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }
    double calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {
    public GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }
    double calculateBill() {
        double surcharge = getBaseFee() * 0.10;
        return getBaseFee() + surcharge - 20;
    }
}

public class cases3 {
    public static void main(String[] args) {
        Plan p1 = new SilverPlan("Swornim", 100);
        Plan p2 = new GoldPlan("Rahane", 200);

        System.out.println("Patient: " + p1.getPatientName());
        System.out.println("Silver Plan Bill: $" + p1.calculateBill());

        System.out.println();

        System.out.println("Patient: " + p2.getPatientName());
        System.out.println("Gold Plan Bill: $" + p2.calculateBill());
    }
}