// case study 3: case 2
abstract class Robot {
    private String batteryId;
    protected double chargeLevel;

    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void reportStatus() {
        System.out.println("Battery ID: " + batteryId);
        System.out.println("Charge Level: " + chargeLevel + "%");
    }

    public void work() {
        performTask();
    }

    abstract void performTask();
}

class DroneRobot extends Robot {
    public DroneRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    void performTask() {
        chargeLevel -= 15;
        System.out.println("DroneRobot completed task at 2x speed");
    }
}

class GroundRobot extends Robot {
    public GroundRobot(String batteryId, double chargeLevel) {
        super(batteryId, chargeLevel);
    }

    void performTask() {
        System.out.println("Performing surface check");
        chargeLevel -= 5;
        System.out.println("GroundRobot completed task");
    }
}

public class case3 {
    public static void main(String[] args) {
        Robot r1 = new DroneRobot("DR-101", 100);
        Robot r2 = new GroundRobot("GR-202", 100);

        r1.reportStatus();
        r1.work();
        r1.reportStatus();

        System.out.println();

        r2.reportStatus();
        r2.work();
        r2.reportStatus();
    }
}