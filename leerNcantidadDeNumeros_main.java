package leerNcantidadDeNumeros;
import java.util.Scanner;
public class leerNcantidadDeNumeros_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner O = new Scanner (System.in);
		System.out.println("ingrese el numero de digitos que desea");
		byte n=O.nextByte();
		
		float suma = 0;
		float promedio;
		
		for(byte i=0; i < n; i++) {
			System.out.println("ingrese el numero "+(i+1)+": ");
			float num = O.nextFloat();
			suma+=num;
		}
		promedio=suma / n;
		
		System.out.println("la suma es:"+ suma);
		System.out.println("el promedio es: "+promedio);
	}

}
