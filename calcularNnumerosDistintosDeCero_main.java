package calcularNnumerosDistintosDeCero;
import java.util.Scanner;
public class calcularNnumerosDistintosDeCero_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eso = new Scanner (System.in);
		float digi,n,sumaPositivos=0,contarNegativos=0;
		
		System.out.println("introduzca la cantidad de numeros");
		n=eso.nextFloat();
		
		for(float i=1; i<=n;i++) {
			System.out.println("ingrese los numeros");
			digi=eso.nextFloat();
			
			if(digi>0) {
				sumaPositivos += digi;
			}
			else if(digi<0){
				contarNegativos++;
			}
		}
		System.out.println("la suma de los numeros es: "+sumaPositivos);
		System.out.println("la cantidad de numeros negativos es:"+contarNegativos);
	
	}

}
