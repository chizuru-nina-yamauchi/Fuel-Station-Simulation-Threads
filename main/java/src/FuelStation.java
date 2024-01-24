public class FuelStation {
    // attributes
    private int fuelSupply;
    // constructor
    public FuelStation(int fuelSupply){
        this.fuelSupply = fuelSupply;
    }

    // synchronized method to refuel a vehicle
    public synchronized void refuel(int amount, int vehicleNumber) {

        // if there is enough fuel -> refuel
        if (fuelSupply >= amount) {
            fuelSupply -= amount;
            System.out.println("Vehicle " + vehicleNumber + " refueled " + amount + " liters. Remaining fuel: " + fuelSupply + " liters.");
        } else { // not enough fuel
            System.out.println("Vehicle " + vehicleNumber + " cannot refuel. Not enough fuel supply.");
        }
    }

    // method to get a current fuel supply
    public int getCurrentFuelSupply() {
            return fuelSupply;

        }


    }



