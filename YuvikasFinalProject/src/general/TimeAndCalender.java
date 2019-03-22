package general;

	import java.util.Scanner;
	import java.util.Calendar;
public class TimeAndCalender {
	
	

	    public static void main(String[] args) {
	        int Y = 2018;    
	        int startDayOfMonth = 5;
	        int startSayOfMonth = 0;
			int spaces = startSayOfMonth;
			Calendar cal = Calendar.getInstance();
		    int year = cal.get(Calendar.YEAR);
		    int month = cal.get(Calendar.MONTH);      
	        int day = cal.get(Calendar.DAY_OF_MONTH);
	        int hour = cal.get(Calendar.HOUR_OF_DAY);
		    int minute = cal.get(Calendar.MINUTE);
	        int second = cal.get(Calendar.SECOND);
			
		     
		      System.out.println(""
		      		+ ""
		      		+ ""
		      		+ "");
		      
		      System.out.printf("Today is: %4d/%02d/%02d It is currently: %02d:%02d:%02d\n",
			            month, day , year, hour, minute, second);
		      
		      
		      System.out.println(""
		      		+ ""
		      		+ ""
		      		+ "");
		      
		      
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

	            
	            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
	                days[M] = 29;

	          
	            
	            System.out.println(" "+ months[M] + " " + Y);

	          
	            System.out.println("___________________________________");
	            System.out.println(" Mon  Tue  Wed  Thurs  Fri  Sat Sun ");

	            
	               spaces = (days[M-1] + spaces)%7;

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

	        


        