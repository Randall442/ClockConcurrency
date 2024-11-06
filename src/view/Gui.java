package view;

import java.awt.event.ActionListener;

public class Gui {

    StartWindow startWindow;
    public Gui(){
        startWindow = new StartWindow();

    }

    public StartWindow getStartWindow()
    {
        return startWindow;
    }

    public void setButtonListeners(ActionListener listener)
    {
        startWindow.getStartBtn().addActionListener(listener);
        startWindow.getEndBtn().addActionListener(listener);
    }
}
