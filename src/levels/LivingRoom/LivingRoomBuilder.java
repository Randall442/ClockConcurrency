package levels.LivingRoom;

import levels.Kitchen.KitchenRoomBuilder;

public interface LivingRoomBuilder<T> {
   LivingRoomBuilder<T> setLights(boolean onOff);
   LivingRoomBuilder<T> setRoomLock(boolean openClosed);
   LivingRoomBuilder<T> setWindowLock(boolean openClosed);

   LivingRoomBuilder<T> addCouch();
   LivingRoomBuilder<T> couchSetup();
   LivingRoomBuilder<T> addRecliner();
   LivingRoomBuilder<T> reclinerSetup();
   LivingRoomBuilder<T> addBookShelf();
   LivingRoomBuilder<T> bookShelfSetup();

    T buildLivingRoom();
}
