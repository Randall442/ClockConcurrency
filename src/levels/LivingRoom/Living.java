package levels.LivingRoom;

import levels.Room;

public class Living extends Room {
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;

    public Living(boolean lightSwitch, boolean roomLocked, boolean windowLocked)
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
        return 'L';
    }
}
