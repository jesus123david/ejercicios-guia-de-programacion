package NcantidadDeNumeros;
import java.util.Scanner;
public class NcantidadDeNumeros_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner D = new Scanner (System.in);
		short n;
		
		System.out.println("ingrese la cantidad de numeros que desea");
		n=D.nextShort();
		
		for(short i=1; i<=n;i++) {
			System.out.println(i);
		}
	}

}
