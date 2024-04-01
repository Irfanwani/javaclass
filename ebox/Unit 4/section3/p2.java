import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
		String str=sc.next();
		try {

		Date sd=new SimpleDateFormat("MM-dd-yyyy").parse(str);
		String sd1=new SimpleDateFormat("EEE, MMM d, yy").format(sd);
		System.out.println("Date Format with EEE, MMM d, yy : "+sd1);
		String sd2=new SimpleDateFormat("dd.MM.yyyy").format(sd);
		System.out.println("Date Format with dd.MM.yyyy : "+sd2);
		String sd3=new SimpleDateFormat("dd/MM/yyyy").format(sd);
		System.out.println("Date Format with dd dd/MM/yyyy : "+sd3);
		}
catch(ParseException e) {};
	}
}
