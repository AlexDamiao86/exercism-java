public class Lasagna {
    private static final int LASAGNA_BAKING_TIME = 40;
    private static final int PREPARATION_TIME_BY_LAYER = 2;

    public int expectedMinutesInOven() {
        return LASAGNA_BAKING_TIME;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return (LASAGNA_BAKING_TIME - minutesInOven);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return (PREPARATION_TIME_BY_LAYER * numberOfLayers);
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return (this.preparationTimeInMinutes(numberOfLayers) + minutesInOven);
    }
}
