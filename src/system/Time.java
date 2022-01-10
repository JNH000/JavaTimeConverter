package system;

import ui.Interface;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
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
                        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                        DateFormat dateFormat = new SimpleDateFormat("EEE, MMM d");
                        Date date = new Date();
                        Date date1 = new Date();
                        TimeZone timeZone = TimeZone.getTimeZone(Interface.getSelection());
                        timeFormat.setTimeZone(timeZone);
                        dateFormat.setTimeZone(timeZone);
                        Interface.uiText.setText(timeFormat.format(date));
                        Interface.uiTextSmall.setText(dateFormat.format(date1));
                    }

                });
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

}
