package levels.Kitchen;

public interface KitchenRoomBuilder<T> {
    KitchenRoomBuilder<T> setLights(boolean onOff);
    KitchenRoomBuilder<T> setRoomLock(boolean openClosed);
    KitchenRoomBuilder<T> setWindowLock(boolean openClosed);

    KitchenRoomBuilder<T> addFridge();
    KitchenRoomBuilder<T> fridgeSetup();
    KitchenRoomBuilder<T> addFreezer();
    KitchenRoomBuilder<T> setFreezer();
    KitchenRoomBuilder<T> addSink();
    KitchenRoomBuilder<T> sinkSetup();

    T buildKitchen();
}
