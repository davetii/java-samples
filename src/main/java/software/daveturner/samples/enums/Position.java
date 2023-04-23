package software.daveturner.samples.enums;

public enum Position {
    PG(0, "Point Guard"),
    CG(1, "Combo Guard"),
    BG(2, "Big Guard"),
    WING(3, "Wing"),
    SF(4, "Small Forward"),
    F(5, "Forward"),
    PF(6, "Power Forward"),
    FC(7, "Forward Center"),
    C(8, "Center");

    private final int id;
    private final String descr;

    Position(int id, String descr) {
        this.id = id;
        this.descr = descr;
    }

    public int getId() {
        return id;
    }
    public String getDescr() { return descr; }

    public int getAdjustedSpeed(int speed) {
        if(this.id == 0) { return speed + 3; }
        if(this.id == 1) { return speed + 2; }
        if(this.id == 2) { return speed + 1; }
        if(this.id == 7) { return speed - 1; }
        if(this.id == 8) { return speed - 2; }
        return speed;
    }
}
