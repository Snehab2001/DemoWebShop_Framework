package GenericLibrary;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {

	public int getrandomNumber() {
		Random r = new Random();
		return r.nextInt(1000);
	}
	public String getTimeStamp() {
	LocalDateTime l=LocalDateTime.now();
	String date = l.toString().replace(":","-");
	return date;
	
}
}