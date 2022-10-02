package Week5;

public class App {

	public static void main(String[] args) {
		//System.out.println("This is the beginning of the Asterisk Logger");
		Logger asteriskLogger = new asteriskLogger();
		asteriskLogger.Log("Hello");
		asteriskLogger.Error("Hello");
		//System.out.println("This is the end of the Asterisk Logger");
		
		Logger spacedLogger = new spacedLogger();
		spacedLogger.Log("Hello");
		spacedLogger.Error("Helloo");

	}

}
