package encontrarElValorDeY;
import java.util.Scanner;
public class valorY_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner valor = new Scanner(System.in);
		double x=2.0;
		double c=2.5;
		double y=x*c-2.0;
		
		System.out.println("Imprima el valor de x:");
		x=valor.nextDouble();
		y=x*c-2.0;
		System.out.println("si x es igual a:" + x + "el valor y es: " +y );
		
		
	}

}
