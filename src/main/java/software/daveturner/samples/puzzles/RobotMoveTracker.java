package software.daveturner.samples.puzzles;

public class RobotMoveTracker {

    private final int[] axis = {0,0};

    public void move(String direction) {
        if (direction.equals("L")) { axis[0]++; }
        if (direction.equals("R")) { axis[0]--; }
        if (direction.equals("U")) { axis[1]++; }
        if (direction.equals("D")) { axis[1]--; }
    }

    public boolean isWhereWeStarted() {
        return axis[0] == 0 && axis[1] == 0;
    }

}
