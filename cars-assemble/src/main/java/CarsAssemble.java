public class CarsAssemble {

    private static final int CARS_PRODUCED_BY_HOUR = 221;
    private static final int MINUTES_IN_HOUR = 60;

    public double successRate(int speed) {
        return (( speed < 5 ) ? 1 :
                    ( speed < 9 ) ? 0.9 :
                        ( speed < 10 ) ? 0.8 : 0.77);
    }

    public double productionRatePerHour(int speed) {
        return speed * CARS_PRODUCED_BY_HOUR * successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / MINUTES_IN_HOUR);
    }
}
