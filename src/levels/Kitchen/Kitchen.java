package levels.Kitchen;

import levels.Room;

public class Kitchen extends Room {
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;

    public Kitchen(boolean lightSwitch, boolean roomLocked, boolean windowLocked)
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
        return 'K';
    }


}
