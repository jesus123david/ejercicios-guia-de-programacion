package edadSuficienteParaBeber;
import java.util.Scanner;
public class edadSuficiente_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner (System.in);
		
		System.out.println("ingrese su edad ");
		short edad=e.nextShort();
		
		if(edad >= 16 && edad <= 75) {
			System.out.println("tiene la edad correcta para botar");
		}
		else {
			System.out.println("no tiene la edad suficiente para botar");
		}
	}

}
