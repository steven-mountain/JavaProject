package SropWatch9_6;
import java.util.GregorianCalendar;

public class StopWatch {
	private long startTime = 0;
	private long endTime = 0;
	StopWatch () {
		startTime =  new GregorianCalendar().getTimeInMillis();
	}
	
	public void start(){
		startTime = new GregorianCalendar().getTimeInMillis();
	}
	
	public void stop(){
		endTime =new GregorianCalendar().getTimeInMillis();
	}
	
	public long getElapsedTime(){
		return endTime - startTime;
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public long getendTime(){
		return endTime;
	}
}
