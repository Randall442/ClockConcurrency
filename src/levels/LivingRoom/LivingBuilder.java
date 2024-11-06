package levels.LivingRoom;

import levels.Kitchen.Kitchen;

public class LivingBuilder implements LivingRoomBuilder<Living>{
    private boolean lightSwitch;
    private boolean roomLocked;
    private boolean windowLocked;


    @Override
    public LivingRoomBuilder<Living> setLights(boolean onOff) {
        this.lightSwitch = onOff;
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> setRoomLock(boolean openClosed) {
        this.roomLocked = openClosed;
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> setWindowLock(boolean openClosed) {
        this.windowLocked = openClosed;
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> addCouch() {
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> couchSetup() {
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> addRecliner() {
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> reclinerSetup() {
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> addBookShelf() {
        return this;
    }

    @Override
    public LivingRoomBuilder<Living> bookShelfSetup() {
        return this;
    }

    @Override
    public Living buildLivingRoom() {
        return new Living(lightSwitch, roomLocked, windowLocked);
    }
}
