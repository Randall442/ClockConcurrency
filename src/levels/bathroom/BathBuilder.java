package levels.bathroom;

import levels.Garage.Garage;
import levels.Garage.GarageRoomBuilder;

public class BathBuilder implements BathRoomBuilder<Bath>{
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;
    @Override
    public BathRoomBuilder<Bath> setLights(boolean onOff) {
        this.lightSwitch = onOff;
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> setRoomLock(boolean openClosed) {
        this.roomLocked = openClosed;
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> setWindowLock(boolean openClosed) {
        this.windowLocked = openClosed;
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> addBath() {
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> setBath() {
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> addToilet() {
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> setToilet() {
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> addSink() {
        return this;
    }

    @Override
    public BathRoomBuilder<Bath> setSink() {
        return this;
    }

    @Override
    public Bath buildBathroom() {
        return new Bath(lightSwitch, roomLocked, windowLocked);
    }


}
