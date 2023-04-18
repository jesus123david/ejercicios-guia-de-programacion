package leerTresNumeros;
import java.util.Scanner;
public class leerTresNumeros_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner I = new Scanner (System.in);
		float num1, num2, num3;
		
		 System.out.println("introduzca los numeros");
		 System.out.println("numero 1");
		 num1=I.nextFloat();
		 System.out.println("numero 2");
		 num2=I.nextFloat();
		 System.out.println("numero 3");
		 num3=I.nextFloat();
		 float suma=num1+num2+num3, promedio=suma/3;
		 
		 System.out.println("la suma de los numeros es: "+suma);
		 System.out.println("el promedio de los numeros es: "+promedio);
	}

}
