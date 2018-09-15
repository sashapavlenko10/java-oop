
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.GregorianCalendar;
	import java.util.Scanner;

	public class Task_6_1 {
	    public static void main(String[] args) throws ParseException {
	        Scanner sc = new Scanner(System.in);  
	        Calendar currentDate = Calendar.getInstance();  
	        Calendar dataIn = new GregorianCalendar();  
	        try {
	            System.out.println("enter date (dd.mm.yyyy): ");
	            String dateString = sc.nextLine();
	            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	            dataIn.setTime(sdf.parse(dateString));

	            System.out.println("today : " + currentDate.getTime());
	            System.out.println("your date : " + dataIn.getTime());

	            System.out.println("delta year: " + (currentDate.get(Calendar.YEAR) - dataIn.get(Calendar.YEAR)));
	            System.out.println("delta mouth: " + (currentDate.get(Calendar.MONTH) - dataIn.get(Calendar.MONTH)));
	            System.out.println("delta day: " + (currentDate.get(Calendar.DAY_OF_MONTH) - dataIn.get(Calendar.DAY_OF_MONTH)));
	        }catch (ParseException e){
	            System.out.println("wrong date !!!");
	        }
	    }
	}



