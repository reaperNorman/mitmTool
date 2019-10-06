package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linux {

	public static void run(String command)
	{

		try {

			Process p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			String output = "";

			while ((line = buf.readLine()) != null) {
				output += line + "\n";

	  		System.out.println(output);
	  		}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); }
		
		
	}
	public static void parse_output()
	{
		
	}
	
}
