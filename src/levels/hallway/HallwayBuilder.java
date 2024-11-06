package levels.hallway;

public class HallwayBuilder implements HallwayRoomBuilder<Hallway> {
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;
    @Override
    public HallwayRoomBuilder<Hallway> setLights(boolean onOff) {
        this.lightSwitch = onOff;
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> setRoomLock(boolean openClosed) {
        this.roomLocked = openClosed;
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> setWindowLock(boolean openClosed) {
        this.windowLocked = openClosed;
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> addVehicle() {
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> setVehicle() {
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> addToolBox() {
        return this;
    }

    @Override
    public HallwayRoomBuilder<Hallway> setToolBox() {
        return this;
    }

    @Override
    public Hallway buildHallway() {
        return new Hallway(lightSwitch, roomLocked, windowLocked);
    }
}
