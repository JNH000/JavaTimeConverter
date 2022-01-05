package system;

import ui.Interface;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Time{


    public Time(){
        ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
        e.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                        DateFormat dateAndTime = new SimpleDateFormat("HH:mm:ss");
                        Date date = new Date();
                        Interface.uiText.setText(dateAndTime.format(date));
                    }

                });
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

}
