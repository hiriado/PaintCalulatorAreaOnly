import java.util.Scanner;


public class ModClock
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int mins;
		int hours;
		int time;
		int futuremin;
		int futurehour;
		System.out.print("What time is it right now 24 hour: ");
		time = input.nextInt();
		hours = time / 100;
		mins = time % 60;
		System.out.print("How many hours later?: ");
		futurehour = input.nextInt();
		System.out.print("How many minutes later?: ");
		futuremin = input.nextInt();
		mins =  mins + futuremin;
		hours = hours + futurehour;
		hours += mins / 60;
		mins = mins % 60;
		futurehour = hours % 24;
		System.out.println("Time: " + futurehour + ":" + mins);














	}
}