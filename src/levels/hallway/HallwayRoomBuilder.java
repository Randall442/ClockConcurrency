package levels.hallway;

public interface HallwayRoomBuilder<T> {
    //common things rooms have
    HallwayRoomBuilder<T> setLights(boolean onOff);
    HallwayRoomBuilder<T> setRoomLock(boolean openClosed);
    HallwayRoomBuilder<T> setWindowLock(boolean openClosed);

    HallwayRoomBuilder<T> addVehicle();
    HallwayRoomBuilder<T> setVehicle();
    HallwayRoomBuilder<T> addToolBox();
    HallwayRoomBuilder<T> setToolBox();
    //kitchen specific

    T buildHallway();
}
