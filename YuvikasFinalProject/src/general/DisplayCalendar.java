package general;

import java.util.Scanner;

public class DisplayCalendar {

    public static void main(String[] args) {
        int Y = 2018;    // year
        int startDayOfMonth = 5;
        int startSayOfMonth = 0;
		int spaces = startSayOfMonth;
		
		
        String[] months = {
                "",                               
                "          January", "          February", "          March",
                "          April", "          May", "          June",
                "          July", "          August", "          September",
                "          October", "          November", "          December"
            };

           
            int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

            for (int M = 1; M <= 12; M++) {

            // check for leap year
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;

          
            // print calendar header
            // Display the month and year
            System.out.println(" "+ months[M] + " " + Y);

          
            System.out.println("___________________________________");
            System.out.println(" Mon  Tue  Wed  Thurs  Fri  Sat Sun ");

            // spaces required
               spaces = (days[M-1] + spaces)%7;

            // print the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }

            System.out.println();
        }
    }
}

        