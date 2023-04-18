package evaluarFuncion;
import java.util.Scanner;
public class funcion_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner evaluado = new Scanner(System.in);
		double x = 1.0;
		double y=  5.0 * Math.pow(x, 4) + 2.0 * Math.pow(x, 3) + 3.0 *  Math.pow(x, 2) + 7.0;
		
		
		System.out.println("digite el valor de x");
		x = evaluado.nextDouble();
		y=  5.0 * Math.pow(x, 4) + 2.0 * Math.pow(x, 3) + 3.0 *  Math.pow(x, 2) + 7.0;
		
		System.out.println("cuando la el valor de x cambia a" +x+   "El valor de y es"+y);
		}

}
