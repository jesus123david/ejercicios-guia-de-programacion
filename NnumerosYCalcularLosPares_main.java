package NnumerosYCalcularLosPares;
import java.util.Scanner;
public class NnumerosYCalcularLosPares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner (System.in);
		short n,dig,par=0,impar=0;
		
		System.out.println("introduzca la cantidad de numeros ");
		n=S.nextShort();
		
		for(short i=1; i<=n; i++) {
			System.out.println("ingrese los numeros "+i+":");
			dig=S.nextShort();
			
			if(dig % 2 == 0) {
				par++;
			}
			else{
				impar++;
			}
		}
		System.out.println("la cantidad de numeros pares es: "+par);
		System.out.println("la cantidad de numeros impares es: "+impar);
	}

}
