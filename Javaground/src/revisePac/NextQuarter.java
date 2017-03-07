package revisePac;

import java.util.Calendar;

public class NextQuarter {
public	int day;
public int month;
public	int year;
public NextQuarter(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
			
}
	public static NextQuarter findFirstdate(NextQuarter nq) {
	
		if (nq.month <= 3 ) {
			nq.day = 1;
			nq.month = 4;
			Calendar now = Calendar.getInstance();   // Gets the current date and time
			int year = now.get(Calendar.YEAR);       // The current year
			nq.year = year;
		}
		else if(nq.month > 3 && nq.month <= 6 ) {
			nq.day = 1;
			nq.month = 7;
			Calendar now = Calendar.getInstance();   // Gets the current date and time
			int year = now.get(Calendar.YEAR);       // The current year
			nq.year = year;
		}
		else if(nq.month > 6 && nq.month <= 9 ) {
			nq.day = 1;
			nq.month = 12;
			Calendar now = Calendar.getInstance();   // Gets the current date and time
			int year = now.get(Calendar.YEAR);       // The current year
			nq.year = year;
		}
		else  {
			nq.day = 1;
			nq.month = 1;
			Calendar now = Calendar.getInstance();   // Gets the current date and time
			int year = now.get(Calendar.YEAR) + 1;       // The current year
			nq.year = year;
		}
		return nq;
	}

	public static void main(String[] args) {
		
        NextQuarter nq = new NextQuarter(1,1,2017);
       nq =  nq.findFirstdate(nq);
       System.out.println(nq.month + " "+ nq.day +" "+ nq.year);

	}

}
