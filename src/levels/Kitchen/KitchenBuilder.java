package levels.Kitchen;

public class KitchenBuilder implements KitchenRoomBuilder<Kitchen>{
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;

    @Override
    public KitchenRoomBuilder<Kitchen> setLights(boolean onOff) {
        this.lightSwitch = onOff;
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> setRoomLock(boolean openClosed) {
        this.roomLocked = openClosed;
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> setWindowLock(boolean openClosed) {
        this.windowLocked = openClosed;
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> addFridge() {
        System.out.println("Fridge was added");
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> fridgeSetup() {
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> addFreezer() {
        return null;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> setFreezer() {
        return null;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> addSink() {
        return this;
    }

    @Override
    public KitchenRoomBuilder<Kitchen> sinkSetup() {
        return this;
    }

    @Override
    public Kitchen buildKitchen() {
        return new Kitchen(lightSwitch, roomLocked, windowLocked);
    }

}
