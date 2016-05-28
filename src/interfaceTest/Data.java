package interfaceTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.lang.time.StopWatch;

public class Data {
	public static void main(String args[]){
		Date dt = new Date();
		SimpleDateFormat time=new SimpleDateFormat("yyyyMMddhhmmss");
		System.out.println(time.format(dt));
		final StopWatch watch = new StopWatch();  
	    watch.start();  
	    Timer timer = new Timer();  
	    /* void java.util.Timer.schedule(TimerTask task, long delay) */  
	    timer.schedule(new TimerTask() {  
	        public void run() {  
	            watch.stop();  
	            System.out.println("-------任务执行--------");  
	            System.out.println(watch.getTime());  
	        }  
	    }, 2000);// delay=2000毫秒 后执行该任务  
	}
}
/*var myDate = new Date();
var s = myDate.getFullYear();
var m = myDate.getMonth()+1;
var l = myDate.getDate();
var t = s+""+m+""+l;
//alert(t)*/