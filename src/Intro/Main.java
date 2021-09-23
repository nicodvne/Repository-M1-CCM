package Intro;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 25;
		int z = x + y;
		
		System.out.println("Sum of x+y = " + z);
		System.out.println("Date et heure du jour : " + LocalDateTime.now());
		if(args != null) {
			for(int i = 0; i<args.length; i++) {
				System.out.println("args["+i+"]="+args[i]);
			}
		}
	}

}
