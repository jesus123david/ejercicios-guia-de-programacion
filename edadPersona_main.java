package edadPersona;
import java.util.Scanner;
public class edadPersona_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner check = new Scanner (System.in);
		byte edad;
		
		System.out.println("ingresa tu edad");
		edad=check.nextByte();
		
		if(edad<=13) {
			System.out.println("NIÑO");
		}
		else if(edad>13 && edad <= 25) {
			System.out.println("JOVEN");
		}
		else if(edad>25) {
			System.out.println("ADULTO");
		}
	}

}
