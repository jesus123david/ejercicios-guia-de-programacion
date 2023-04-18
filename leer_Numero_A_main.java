package leerNumeroA;
import java.util.Scanner;
public class leer_Numero_A_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner (System.in);
		float A, y;
		
		System.out.println("digite el numero");
		A=dato.nextFloat();
		
		if(A>0) {
			System.out.println(y=(float) Math.pow(2, A));
		}
		else if(A==0) {
			System.out.println("no valido");
		}
		else if(A<0) {
			System.out.println(y=(A+5));
		}
	}

}
