package levels.bathroom;

import levels.Garage.GarageRoomBuilder;

public interface BathRoomBuilder<T> {
    BathRoomBuilder<T> setLights(boolean onOff);
    BathRoomBuilder<T> setRoomLock(boolean openClosed);
    BathRoomBuilder<T> setWindowLock(boolean openClosed);

    BathRoomBuilder<T> addBath();
    BathRoomBuilder<T> setBath();
    BathRoomBuilder<T> addToilet();
    BathRoomBuilder<T> setToilet();
    BathRoomBuilder<T> addSink();
    BathRoomBuilder<T> setSink();
    //kitchen specific

    T buildBathroom();
}
