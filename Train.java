import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    // Constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();
        
        // Create and attach cars to the train
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }
        // Accessors
        public Engine getEngine() {
            return engine;
        }

        public Car getCar(int i) {
            if (i >= 0 && i < cars.size()) {
                return cars.get(i);
            }
            return null;
        }

        public int getMaxCapacity() {
            int maxCapacity = 0;
            for (Car car : cars) {
                maxCapacity += car.getCapacity();
            }
            return maxCapacity;
        }
    
        public int seatsRemaining() {
            int remainingSeats = 0;
            for (Car car : this.cars) {
                remainingSeats += car.seatsRemaining();
            }
            return remainingSeats;
        }

        // Method to print manifest
    public void printManifest() {
        System.out.println("Train Manifest:");
        System.out.println("Engine Fuel Type: " + engine.getFuelType());
        System.out.println("Engine Current Fuel Level: " + engine.getCurrentFuelLevel());
        System.out.println("Maximum Train Capacity: " + getMaxCapacity());
        System.out.println("Remaining Seats: " + seatsRemaining());

        // Print manifest for each car
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + " Manifest:");
            cars.get(i).printManifest();
        }
}}
