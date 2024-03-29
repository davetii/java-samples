package software.daveturner.samples.compare;

import software.daveturner.samples.enums.Position;

public class Player {

    private final String name;
    private final Position position;

    public Player(String newName, Position newPosition) {
        name = newName;
        position = newPosition;
    }

    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }

}
