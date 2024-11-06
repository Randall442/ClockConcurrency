package view;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class CustomThreadTimer {


    private int seconds = 0;
    private Timer timer;
    private JLabel label;
    private StartWindow window;

    public CustomThreadTimer(JLabel label)
    {
        this.label = label;
        timer = new Timer("Custom Timer Thread");

    }

    public void start(){

        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run() {
                seconds++;
                SwingUtilities.invokeLater(() -> label.setText("Time: " + seconds + " seconds"));

                if(seconds == 30)
                {
                    System.out.println("You survived for 30 seconds!");
                }
            }
        }, 0, 1000);
    }

    public void stop()
    {
        timer.cancel();
    }


}

