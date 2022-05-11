package Q1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Schedule {

    Date now = new Date();
    SimpleDateFormat dayf = new SimpleDateFormat("yyyyMMdd"); 

    private String schedule;
    private String place;
    private String day = dayf.format(now).toString();

    public Schedule(String schedule, String place){
        this.schedule = schedule;
        this.place = place;
    }

    public Schedule(String schedule, String place, String day){
        this.schedule = schedule;
        this.place = place;
        this.day = day;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPlace() {
        return place;
    }

    public String getDay() {
        return day;
    }
}
