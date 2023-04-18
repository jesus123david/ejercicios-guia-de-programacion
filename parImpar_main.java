package numeroParImpar;
import java.util.Scanner;
public class parImpar_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner digito = new Scanner(System.in);
		float myNumero;
		
		System.out.println("escriba el numero que desea");
		myNumero=digito.nextFloat();
		
		if(myNumero % 2 == 0) {
			System.out.println("el numero es par ");
		}
		
		else {
			System.out.println("el numero no es par ");
		}
	}

}
