public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed < 0 || speed > 10) {
            throw new IllegalArgumentException("Speed must be between 1 and 10");
        }

        double baseRate = 221.0; 
        double efficiency = 1.0; 
        if (speed >= 5 && speed <= 8) {
            efficiency = 0.9; 
        } else if (speed == 9) {
            efficiency = 0.8; 
        } else if (speed == 10) {
            efficiency = 0.77; 
        }

        // Calculate the production rate per hour
        return speed * baseRate * efficiency;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
