package levels.Garage;

public interface GarageRoomBuilder<T> {
    //common things rooms have
    GarageRoomBuilder<T> setLights(boolean onOff);
    GarageRoomBuilder<T> setRoomLock(boolean openClosed);
    GarageRoomBuilder<T> setWindowLock(boolean openClosed);


    //Garage specific
    GarageRoomBuilder<T> addVehicle();
    GarageRoomBuilder<T> setVehicle();
    GarageRoomBuilder<T> addToolBox();
    GarageRoomBuilder<T> setToolBox();
    //kitchen specific

    T garageBuild();
}

