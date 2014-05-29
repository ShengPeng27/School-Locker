
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locker Mickey = new Locker(28,17,39,3,100,"Mickey Mouse");
		Locker Donald = new Locker(35,16,27,0,275,"Donald Duck");
		Mickey.openLocker();
		for (int i=0; i<3; i++){
			Mickey.putBookInLocker();
		}
		Donald.removeBookFromLocker();
		System.out.println(Mickey.toString());
		System.out.println(Donald.toString());
			
	}

}
