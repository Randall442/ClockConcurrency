package levels.Garage;

import levels.Room;

public class Garage extends Room {
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;

    public Garage(boolean lightSwitch, boolean roomLocked, boolean windowLocked)
    {
        this.lightSwitch = lightSwitch;
        this.roomLocked = roomLocked;
        this.windowLocked = windowLocked;
    }
    @Override
    public boolean lights() {
        return lightSwitch;
    }

    @Override
    public boolean doorsLocked() {
        return roomLocked;
    }

    @Override
    public boolean windowsLocked() {
        return windowLocked;
    }

    @Override
    public char getRoomSymbol() {
        return 'G';
    }
}
