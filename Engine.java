public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    // Constructor
    public Engine(FuelType fuelType, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }
    public FuelType getFuelType() {
        return fuelType;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    // Refuel method
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    // Go method
    public boolean go() {
        if (currentFuelLevel > 0) {
            System.out.println("Remaining fuel level: " + currentFuelLevel);
            currentFuelLevel -= 10;
            return true;
        } else {
            System.out.println("Out of fuel.");
            return false;
        }
    }

    // main method
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    }