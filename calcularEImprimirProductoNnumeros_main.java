package calcularEImprimirProductoNnumeros;
import java.util.Scanner;
public class calcularEImprimirProductoNnumeros_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner (System.in);
		short n, s,producto= 1;
		
		System.out.println("ingrese la cantidad de numeros");
		n=tc.nextShort();
		
		for(short i=1; i<=n; i++) {
			System.out.println("ingrese los numeros"+i);
			s=tc.nextShort();
			producto *= s;
		}
		System.out.println("el promedio de: "+producto);
	}

}
