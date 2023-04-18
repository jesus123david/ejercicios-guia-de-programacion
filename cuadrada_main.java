package raizCuadrada;
import java.util.Scanner;
public class cuadrada_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mitad = new Scanner(System.in);
		float num;
		
		System.out.println("Introduzca el digito deseado");
		num=mitad.nextFloat();
		
		System.out.println("El valor de num es:"+(Math.sqrt(num)));

	}

}
