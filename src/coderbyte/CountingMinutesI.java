package coderbyte;


import java.util.Scanner;

class Main16 {


    // solution :
    /*public static int CountingMinutesI(String str) {

        String[] timeParts = str.split("-");


        Integer[] totalMinutes = new Integer[2];

        for(int i = 0; i < timeParts.length; i++) {
            String currentTime = timeParts[i];
            int hourValue = Integer.valueOf(currentTime.substring(0, currentTime.indexOf(':')));
            int minuteValue = Integer.valueOf(currentTime.substring(currentTime.indexOf(':') + 1, currentTime.indexOf(':') + 3));

            boolean isPM = currentTime.toLowerCase().contains("pm");

            if (isPM && hourValue != 12) {
                hourValue += 12;
            } else if (!isPM && hourValue == 12) {
                hourValue = 0;
            }


            totalMinutes[i] = hourValue * 60 + minuteValue;
        }

        // Handle next day case
        if (totalMinutes[1] < totalMinutes[0]) {
            totalMinutes[1] += 24 * 60; // Add one day in minutes
        }

        return totalMinutes[1] - totalMinutes[0];
    }*/


    public static int CountingMinutesI(String str) {

        String[] timeParts = str.split("-");
        Integer[] totalMinute = new Integer[2];

        for (int i = 0; i < timeParts.length; i++) {
            String currentTime = timeParts[i];
            int hour = Integer.valueOf(currentTime.substring(0, currentTime.indexOf(':')));
            int minute = Integer.valueOf(currentTime.substring(currentTime.indexOf(':') + 1, currentTime.indexOf(':') + 3));

            boolean isPM = currentTime.toLowerCase().contains("pm");

            if (isPM && hour != 12) {
                hour += 12;
            } else if (!isPM && hour == 12) {
                hour = 0;
            }

            totalMinute[i] = hour * 60 + minute;

        }

        if (totalMinute[1] < totalMinute[0]) {
            totalMinute[1] += 24 * 60;
        }

        return totalMinute[1] - totalMinute[0];

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CountingMinutesI(s.nextLine()));
    }

}