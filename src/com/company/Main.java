package com.company;
public class Main {

    public static void main(String[] args) {
        //Obtain the total milliseconds since midnight ,Jan 1 ,1970
        long totalMilliseconds = System.currentTimeMillis();

        //Obtain the total seconds since midnight,Tan 1,1970
        long totalSeconds = totalMilliseconds /1000;

        //Compute the current second in then minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinutes = totalSeconds /60;

        //Computer the current minute in the hour
        long currentMinute = totalMinutes % 60;

        //Obtain the total hour
        long totalHour = totalMinutes / 60;

        //Computer the current hour in the day
        long currentHour = totalHour % 24 ;

        //Display result
        System.out.println("Current time is "+ currentHour + ":" + currentMinute +":" + currentSecond + " GMT");
    }
}
