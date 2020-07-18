/*Parker Abegg*/

import java.util.Scanner;

public class week4Assignment {
	
    // Function to calculate the Surface Area and Volume of a box
	
	 public static void main(String[] args)
	 {
	   int width, length, height;
	   int volume, surfaceArea;
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("Please enter the width of your box: ");
	   width = scan.nextInt();
	   
	   System.out.println("Please enter the height of your box: ");
	   height = scan.nextInt();
	   
	   System.out.println("Please enter the length of your box: ");
	   length = scan.nextInt();
	   
	   volume = width * length * height;
	   
	   surfaceArea = 2* (length*height + length*width + width*height);
	   
	   System.out.println("Dimensions: " );
	   System.out.println("Height: " + height + " Width " + width + " Length " + length);
	   System.out.println("Volume of the box: " + volume);
	   System.out.println("Surface Area of the box: " + surfaceArea);
	   
	 }
}