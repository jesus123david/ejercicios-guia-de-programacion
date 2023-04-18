package cosenoNumero;
import java.util.Scanner;
public class coseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		double num;
		
		System.out.println("Ingrese el numero");
		num=leer.nextDouble();
		
		double resultado = Math.cos(num);
		
		System.out.println("El coseno de " + num + " es igual a " + resultado);
		
	}

}
