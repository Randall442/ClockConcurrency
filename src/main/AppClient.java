package main;

import controller.Engine;
import model.Database;
import view.Gui;

public enum AppClient {
    INSTANCE;

    private final Gui gui = new Gui();
    private final Database db = new Database();
    private final Engine engine = new Engine(gui, db);


    public Engine getEngine() {
        return engine;
    }

}
