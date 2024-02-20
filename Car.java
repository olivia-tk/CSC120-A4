import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    // Constructor
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<>();
        }
    // Accessors
    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    // Add passenger to the car
    public boolean addPassenger(Passenger passenger) {
        if (seatsRemaining() > 0) {
            passengers.add(passenger);
            return true;
        } else {
            System.out.println("No available seats in the car.");
            return false;
        }
    }

    // Remove passenger from the car
    public boolean removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            passengers.remove(passenger);
            return true;
        } else {
            System.out.println("Passenger is not onboard the car.");
            return false;
        }
    }

    // Print the list of passengers in the car
    public void printManifest() {
        if (!passengers.isEmpty()) {
            System.out.println("Passengers onboard:");
            for (Passenger passenger : passengers) {
                System.out.println("- " + passenger.getName());
            }
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

}