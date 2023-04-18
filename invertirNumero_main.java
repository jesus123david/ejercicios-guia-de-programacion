package numeroInvertido;
import java.util.Scanner;
public class invertirNumero_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner invertir = new Scanner (System.in);
		
		System.out.println("ingrese el numero para invertirlo ");
		int numero=invertir.nextInt();
		
		if (numero > 99 && numero < 1000) {
			
		int cifra1=numero%10;
		int cifra2=(numero/10)%10;
		int cifra3=numero/100;
		int numeroInvertido=(cifra1*100)+(cifra2*10)+cifra3;
		System.out.println("el numero invertido es "+numeroInvertido);
		
		}
		else {
			System.out.println("introdujo un numero no valido");
		}
	}

}
