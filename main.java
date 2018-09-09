/*
 * 
 * Module 1
 * CEN3024 - Software Development I
 * Cayla Parks
 * 9/2/2018
 * 
 * Main (executable) module
 * 
 */

package module1;

import java.util.Scanner;

class Seat
{
	private boolean LightOn;
	
	public Seat()
	{
		LightOn = false;
	}

	public void setLight(Boolean value)
	{
		LightOn = value;
	}
	
	public boolean LightValue()
	{
		return LightOn;
	}
	
	public String StrLightValue()
	{
		if(LightOn == false)
			return "off";
		else
			return "on";
	}
}

public class main {

	public static void main(String[] args) {
		
		Seat Seat1 = new Seat();
		Seat Seat2 = new Seat();
		Seat Seat3 = new Seat();
		Seat Seat4 = new Seat();
		Seat Seat5 = new Seat();
		
		Boolean quit = false;
		Scanner scaninput = new Scanner(System.in);
		String kbInput;
		String Help_L1 = "Valid commands:";
		String Help_L2 = "'seat <1-5> call <on/off>' to set seating lights for seats 1-5.";
		String Help_L3 = "'list lights' or 'list call lights' to list call light statuses.";
		String Help_L4 = "'turn off all' or 'all lights off' to use the attendant's lights-off button.";
		String Help_L5 = "'exit', 'quit', or 'x' to exit program.";
		String Help_L6 = "'help', or '?' to display this list of commands.";

		System.out.println("Seat Attendant Call Light Simulator");
		System.out.println(" ");
		System.out.println(Help_L1);
		System.out.println(Help_L2);
		System.out.println(Help_L3);
		System.out.println(Help_L4);
		System.out.println(Help_L5);
		System.out.println(Help_L6);
		
		while (quit == false)
		{
			System.out.println(" ");
	
			kbInput = scaninput.nextLine();
			
			switch (kbInput)
			{
				case "seat 1 call on":
				{
					Seat1.setLight(true);
					System.out.println(" ");
					System.out.println("Seat 1 call light turned on.");
					break;
				}

				case "seat 1 call off":
				{
					Seat1.setLight(false);
					System.out.println(" ");
					System.out.println("Seat 1 call light turned off.");
					break;
				}
			
				case "seat 2 call on":
				{
					Seat2.setLight(true);
					System.out.println(" ");
					System.out.println("Seat 2 call light turned on.");
					break;
				}
				
				case "seat 2 call off":
				{
					Seat2.setLight(false);
					System.out.println(" ");
					System.out.println("Seat 2 call light turned off.");
					break;
				}
				
				case "seat 3 call on":
				{
					Seat3.setLight(true);
					System.out.println(" ");
					System.out.println("Seat 3 call light turned on.");
					break;
				}
				
				case "seat 3 call off":
				{
					Seat3.setLight(false);
					System.out.println(" ");
					System.out.println("Seat 3 call light turned off.");
					break;
				}
				
				case "seat 4 call on":
				{
					Seat4.setLight(true);
					System.out.println(" ");
					System.out.println("Seat 4 call light turned on.");
					break;
				}
				
				case "seat 4 call off":
				{
					Seat4.setLight(false);
					System.out.println(" ");
					System.out.println("Seat 4 call light turned off.");
					break;
				}
				
				case "seat 5 call on":
				{
					Seat5.setLight(true);
					System.out.println(" ");
					System.out.println("Seat 5 call light turned on.");
					break;
				}
				
				case "seat 5 call off":
				{
					Seat5.setLight(false);
					System.out.println(" ");
					System.out.println("Seat 5 call light turned off.");
					break;
				}
				
				case "list lights":
				case "list call lights":
				{
					System.out.println(" ");
					System.out.println("Seat 1 call light: " + Seat1.StrLightValue());
					System.out.println("Seat 2 call light: " + Seat2.StrLightValue());
					System.out.println("Seat 3 call light: " + Seat3.StrLightValue());
					System.out.println("Seat 4 call light: " + Seat4.StrLightValue());
					System.out.println("Seat 5 call light: " + Seat5.StrLightValue());
					break;
				}
				
				case "turn off all":
				case "all lights off":
				{
					Seat1.setLight(false);
					Seat2.setLight(false);
					Seat3.setLight(false);
					Seat4.setLight(false);
					Seat5.setLight(false);
					System.out.println(" ");
					System.out.println("All lights turned off.");
					break;
				}
				
				case "quit":
				case "exit":
				case "x":
				{
					//Exit, pursued by a bear.
					
					System.out.println(" ");
					System.out.println("Good-bye!");
					quit = true;
					scaninput.close();
					break;
				}
				
				case "help":
				case "?":
				{
					//Help menu
					System.out.println(Help_L1);
					System.out.println(Help_L2);
					System.out.println(Help_L3);
					System.out.println(Help_L4);
					System.out.println(Help_L5);
					System.out.println(Help_L6);
					break;
				}
				
				default:
				{
					//invalid entry.  give an error message, stay in the while loop
					System.out.println(" ");
					System.out.println("Invalid or unrecognized command entered.");
					break;
				}
			}
		}
		
	}

}
