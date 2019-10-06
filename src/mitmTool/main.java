package mitmTool;
import network.*;

public class main {
	public enum Parse_types
	{
		NETWORK_INTERFACES
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Running ifconfig for interfaces...");
			String output = Linux.run("ifconfig");
			System.out.println(output);
			
			
	}
	
	
}
