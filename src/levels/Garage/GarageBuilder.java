package levels.Garage;

public class GarageBuilder implements GarageRoomBuilder<Garage> {
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;
    @Override
    public GarageRoomBuilder<Garage> setLights(boolean onOff) {
        this.lightSwitch = onOff;
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> setRoomLock(boolean openClosed) {
        this.roomLocked = openClosed;
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> setWindowLock(boolean openClosed) {
        this.windowLocked = openClosed;
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> addVehicle() {
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> setVehicle() {
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> addToolBox() {
        return this;
    }

    @Override
    public GarageRoomBuilder<Garage> setToolBox() {
        return this;
    }

    @Override
    public Garage garageBuild() {
        return new Garage(lightSwitch, roomLocked, windowLocked);
    }

}
