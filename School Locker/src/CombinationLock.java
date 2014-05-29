
/**
 * @author Sheng
 *
 */
public class CombinationLock {
	public CombinationLock()
	{}
	public CombinationLock(int number1,int number2,int number3)
	{		
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
	}


	private int dial=0;
	private int number1;
	private int number2;
	private int number3;
	
	public void resetDial(){
		dial = 0;
	}
	public int turnLeft(int numberOfTicks){
		if (dial>numberOfTicks){
			dial= dial-numberOfTicks;
		}
		else {
			dial = dial+40-numberOfTicks;
		}	
		return dial;
	}
		
	public int turnRight(int numberOfTicks){
		if (dial+numberOfTicks>39){
			dial = dial+numberOfTicks-40;
		}
		else {
			dial=dial+numberOfTicks;
		}
		return dial;
	}
	public boolean openLock(int dial1, int dial2,int dial3){
		if ((number1== dial1)&&(number2==dial2)&&(number3==dial3)){
			return true;	
		}
		else
			return false;
	}
	public int getDial() {
		return dial;
	}
	public void setDial(int dial) {
		this.dial = dial;
	}		
	public void setNumber1(int number1) {
		this.number1 = number1;
	}	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}	
	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	public String toString() {
		return "CombinationLock [dial=" + dial + ", number1=" + number1
				+ ", number2=" + number2 + ", number3=" + number3 + "]";
	}
	
}
