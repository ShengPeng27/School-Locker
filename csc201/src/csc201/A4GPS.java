package csc201;

import java.util.Random;

public class A4GPS {
	/*Sheng Peng
	 * With (x, y) as the coordinates of the car, consider the initial position (0,0).
	At each intersection, the only directions available are North, South, East or West
	The GPS is broken, and it chooses the direction randomly at each intersection, which happens every 5 minutes
	The assumption is that the car has the same speed at all times, including when it changes direction and turns. 
	Write a program that calculates the distance from the initial point to the location point of the driver after one hour of d
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The speed is 60m/h, so the car drive 5 miles
		//every time.
		final int TURNS=12;
		final int DISTANCE_PER_UNIT=5;//in miles
		int x=0, y=0;
		for (int i=0; i<TURNS;i++){
			Random rand = new Random();
			int direction = rand.nextInt(4);
			//0 for north, 1 for east, 2 for south, 3 for west
			switch (direction) {
			case 0:
				y=y+1;//north 
				break;
			case 1:
				x=x+1;//east
				break;
			case 2:
				y=y-1;
				break;
			case 3:
				x=x-1;
				break;
			}
		}
		double distance = Math.sqrt(x*x+y*y)*DISTANCE_PER_UNIT;
		//initial point is (0,0), we don't need to write minus 0 here
		System.out.print("After one hour driving, ");
		System.out.print("the distance away from the initial point is ");
		System.out.println(distance+" miles.");
	}

}
