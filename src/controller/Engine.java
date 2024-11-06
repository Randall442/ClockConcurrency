package controller;

import levels.*;
import levels.Garage.Garage;
import levels.Garage.GarageBuilder;
import levels.Kitchen.Kitchen;
import levels.Kitchen.KitchenBuilder;
import levels.LivingRoom.Living;
import levels.LivingRoom.LivingBuilder;
import levels.LivingRoom.LivingRoomBuilder;
import levels.bathroom.Bath;
import levels.bathroom.BathBuilder;
import levels.hallway.Hallway;
import levels.hallway.HallwayBuilder;
import model.Database;
import view.CustomThreadTimer;
import view.Gui;
import view.StartWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    Gui gui;
    Database db;
    CustomThreadTimer timer;
    LevelGridSystem levels;

    public Engine(Gui gui, Database db)
    {
        this.gui = gui;
        this.db = db;
        levels = new LevelGridSystem();
        createRooms();
        JLabel label = gui.getStartWindow().getLabel();
        this.timer = new CustomThreadTimer(label);

        gui.setButtonListeners(this);

    }

    public StartWindow getStartWindow()
    {
        return gui.getStartWindow();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == gui.getStartWindow().getStartBtn())
        {
            timer.start();

        }
        else if ( source == gui.getStartWindow().getEndBtn())
        {
            timer.stop();
        }

    }

    public void createRooms()
    {
        createHallways();
        createBathrooms();
        createGarage();
        createKitchens();
        createLivingRooms();


        levels.printMap();
    }

    public void createHallways()
    {
        Hallway hallwayOne = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(7, 3, hallwayOne);

        Hallway hallwayTwo = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(6, 3, hallwayTwo);

        Hallway hallwayThree = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(5, 3, hallwayThree);

        Hallway hallwayFour = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(4, 3, hallwayFour);

        Hallway hallwayFive = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(4, 2, hallwayFive);

        Hallway hallwaySix = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(4, 1, hallwaySix);

        Hallway hallwaySeven = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(3, 5, hallwaySeven);

        Hallway hallwayEight = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(3, 4, hallwayEight);

        Hallway hallwayNine = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(3, 3, hallwayNine);

        Hallway hallwayTen = new HallwayBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(false)
                .buildHallway();
        levels.setRoomToGrid(5, 3, hallwayTen);
    }

    public void createKitchens()
    {
        Kitchen kitchen = new KitchenBuilder().setLights(true)
                .setRoomLock(true)
                .setWindowLock(false)
                .addFridge()
                .addSink()
                .buildKitchen();
        levels.setRoomToGrid(4,0, kitchen);
    }

    public void createLivingRooms()
    {
        Living livingRoomOne = new LivingBuilder().setLights(true)
                .setRoomLock(false)
                .setWindowLock(true)
                .addCouch()
                .addRecliner()
                .addBookShelf()
                .buildLivingRoom();
        levels.setRoomToGrid(3,6, livingRoomOne);
    }

    public void createGarage()
    {
        Garage garageOne = new GarageBuilder().setLights(false)
                .setRoomLock(true)
                .setWindowLock(false)
                .addToolBox()
                .addVehicle()
                .garageBuild();
        levels.setRoomToGrid(7,4, garageOne);
    }
    public void createBathrooms()
    {
        Bath bathroomOne = new BathBuilder().setLights(false)
                .setRoomLock(true)
                .setWindowLock(false)
                .buildBathroom();
        levels.setRoomToGrid(3,2, bathroomOne);
    }
}
