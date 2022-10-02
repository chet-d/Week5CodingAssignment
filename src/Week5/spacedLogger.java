package Week5;

public class spacedLogger implements Logger {

	@Override
	public void Log(String log) {
		
		System.out.println(log.replaceAll(".","$0 ").trim());
	}

	@Override
	public void Error(String error) {
		System.out.println("ERROR: " + error.replaceAll(".","$0 ").trim());
		
	}

}
