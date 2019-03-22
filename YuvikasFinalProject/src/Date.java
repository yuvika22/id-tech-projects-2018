
import java.util.Calendar;
public class Date {
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      // You cannot use Date class to extract individual Date fields
      int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH);      
      int day = cal.get(Calendar.DAY_OF_MONTH);
      int hour = cal.get(Calendar.HOUR_OF_DAY);
      int minute = cal.get(Calendar.MINUTE);
      int second = cal.get(Calendar.SECOND);
   
      System.out.printf("Today is: %4d/%02d/%02d It is currently: %02d:%02d:%02d\n",  // Pad with zero
              month+1, day, year, hour, minute, second);
       }
    }