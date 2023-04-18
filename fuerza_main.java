package fuerzaDeUnCuerpo;
import java.util.Scanner;
public class fuerza_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner (System.in);
		int M, A;
		
		System.out.println("masa del objeto");
		M=f.nextInt();
		System.out.println("aceleracion del objeto");
		A=f.nextInt();
		
		System.out.println("la fuerza del objeto es:\n"+M*A);
	}

}
