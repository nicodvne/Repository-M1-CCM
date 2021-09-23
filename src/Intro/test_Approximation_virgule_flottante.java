package Intro;
import java.lang.Math;
public class test_Approximation_virgule_flottante {
	
	/*public static void main(String[] args) { 
		double d = 0.0; int nb = 0;
		double expected = 1.0;
		while (d != 1.0 && nb < 10 ) { // boucle infinie!!!
		d += 0.1; 
		nb++;
		}
		System.out.println("nb: " + nb + " d: " + d);
	
		
	}*/
	
	public static void main(String[] args) { 
		final double EPSILON =0.00001;
		double d=0.0;
		double expected=1.0;
	
		while (Math.abs(expected-d) > EPSILON)  {
		
		d+=0.1;
		}
		System.out.println(d); // 0.9999999999999999	
		
	}
}
