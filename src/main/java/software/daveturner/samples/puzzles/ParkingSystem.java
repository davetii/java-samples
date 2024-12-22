package software.daveturner.samples.puzzles;

public class ParkingSystem {

    private final int[] carTypes;
    ParkingSystem(int small, int med, int big) {
        carTypes = new int[]{0, small, med, big};
    }

    public boolean addCar(int t) {
        if (t < 1 || t > carTypes.length) { return false;}
        if(carTypes[t] == 0) { return false; }
        carTypes[t]--;
        return true;
    }
}
