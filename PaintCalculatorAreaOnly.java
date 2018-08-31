///You are painting a room and need to calculate the amount of paint that must be purchased.  All length and area calculations will be in feet and will be entered and stored as integers

///Prompt the user for the length, width, and height of a room.


 ///Prompt the user for the number of doors and number of windows.

///Assume that doors are 21 square feet and windows are 12 square feet.

///Calculate and display the area to be painted.  (You will not be painting the ceiling, floors, doors or windows.)
import cs1.Keyboard;


public class PaintCalculatorAreaOnly
{
	public static void main(String[] args)
	{
		int length;
		int width;
		int height;
		int door;
		int window;
		int windowtotal;
		int doortotal;
		int areaSide;
		int areaSide2;
		int areaTotal;
		int areaTotalR;



		System.out.println("Enter the room dimensions below: ");
		System.out.print("Length? "); length = Keyboard.readInt();
		System.out.print("Width? "); width = Keyboard.readInt();
		System.out.print("Height? "); height = Keyboard.readInt();
		System.out.println("");

		System.out.print("How many doors does the room have? "); door = Keyboard.readInt();
		System.out.print("How many windows does the room have? "); window = Keyboard.readInt();
		System.out.println("");

		doortotal = door * 21;
		windowtotal = window * 12;


		areaSide = height * width;
		areaSide2 = height * length;
		areaTotal = (areaSide * 2) + (areaSide2 * 2);
		areaTotalR = areaTotal - (windowtotal + doortotal);
		System.out.println("Total Area "+areaTotalR);














































	}
}
