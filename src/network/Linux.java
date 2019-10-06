package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mitmTool.main.Parse_types;

public class Linux {

	private static Adapter[] interfaces;
	public static Adapter[] get_network_interfaces()
	{	
		
		return interfaces;
	}
	
	public static String run(String command)
	{
		try {

			Process p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			String output = "";

			while ((line = buf.readLine()) != null) {
				output += line + '\n';
	  		}
			
			return output;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); }
		
		return null;
	}
	public static void parse_output_for(Parse_types type)
	{
		switch(type)
		{
		// NETWORK INTERFACES
		case NETWORK_INTERFACES:
			
			break;
		}
	}
	
}
