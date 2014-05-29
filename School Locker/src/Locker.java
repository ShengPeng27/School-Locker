import java.util.Scanner;


/**
 * @author Sheng
 *
 */
public class Locker {	
	private int numberOfBook;
	private String studentName;
	private int number1;
	private int number2;
	private int number3;
	private int lockNumber;
	public Locker()
	{}
	public Locker(int number1, int number2,int number3,int numberOfBook,int lockNumber, String studentName){
		this.lockNumber=lockNumber;
		this.number1=number1;
		this.number2=number2;
		this.number3=number3;
		this.numberOfBook=numberOfBook;
		this.studentName=studentName;
		
	}
	
	
	CombinationLock l1=new CombinationLock(number1,number2,number3);

	
	public void putBookInLocker(){
		numberOfBook++;
	}
	public boolean removeBookFromLocker(){
		if (numberOfBook>=1){
			numberOfBook--;
			return true;
		}
		else{
			return false;
		}
	}
	public void openLocker(){
		System.out.println("Please enter three numbers to try to opne the lock");
		Scanner keyboard=new Scanner(System.in);
		int dial1= keyboard.nextInt();
		int dial2= keyboard.nextInt();
		int dial3= keyboard.nextInt();
		if (l1.openLock(dial1, dial2, dial3)){
			System.out.println("The lock is opened successfully");
		}
		else {
			System.out.println("You fail to open the lock");
		}
	}
	public int getNumberOfBook() {
		return numberOfBook;
	}
	public void setNumberOfBook(int numberOfBook) {
		this.numberOfBook = numberOfBook;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public int getLockNumber() {
		return lockNumber;
	}
	public void setLockNumber(int lockNumber) {
		this.lockNumber = lockNumber;
	}
	public String toString() {
		return "Locker [numberOfBook=" + numberOfBook + ", studentName="
				+ studentName + ", number1=" + number1 + ", number2=" + number2
				+ ", number3=" + number3 + ", lockNumber=" + lockNumber
				+ ", l1=" + l1 + "]";
	}
	
}
