package parEimparEntre20And100;
import java.util.Scanner;
public class parEimparEntre20And100_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		byte contador = 0, suma = 0;
		
		for(byte i = 20 ; i <= 100; i++) {
			if(i % 2!=0) {
				contador++;
				suma+=i;
			}
		}
		System.out.println("entre el 20 y el 100 hay "+contador+" numeros impares");
		System.out.println("la suma de los sumeros impares es: "+suma);
	}

}
