import java.util.Random;

public class RefuelTask implements Runnable{
    // attributes
    private FuelStation fuelStation;
    private int vehicleNumber;
    private Random random = new Random();

    // constructor
    public RefuelTask(FuelStation fuelStation, int vehicleNumber){
        this.fuelStation = fuelStation;
        this.vehicleNumber = vehicleNumber;

    }

    @Override
    public void run(){
        // simulate random to refuel amount between 10 and 50 liters
        int refuelAmount = random.nextInt(41) + 10; // 41 possibility from 10 liters

        // call the synchronized refuel method in FuelStation class
        fuelStation.refuel(refuelAmount, vehicleNumber);
    }

}
