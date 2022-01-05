package system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {


    public Time(){

    }

    public String GetCurrentDateTimeActionPerformed(){
        DateFormat dateAndTime = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String currentDateTime = dateAndTime.format(date);
        return currentDateTime;
    }
}
