package springMybatis.util.LogUtil;



public class LogManager {
	private static MyLogger myLogger = new MyLogger();
	private LogManager() {
	}
	public synchronized static MyLogger getInstance(){
		if(myLogger==null){
			return new MyLogger();
		}else{
			return myLogger;
		}
	}
	
}
