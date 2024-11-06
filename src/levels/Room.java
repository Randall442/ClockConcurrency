package levels;

abstract public class Room {
    public abstract boolean lights();
    public abstract boolean doorsLocked();
    public abstract boolean windowsLocked();

    public abstract char getRoomSymbol();
}
