package calcularCapital;
import java.util.Scanner;
public class calcularCapital_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner interes = new Scanner (System.in);
		float prestamo;
		
		System.out.println("cuantos dolares desee que le prestemos?");
		prestamo=interes.nextFloat();
		
		//calcular el interes anual
		float primerInteres=(float) 0.07;
		float segundoInteres=(float) 0.06;
				
		if(prestamo >= 10000) {
			System.out.println("su prestamo esta aprobado "+prestamo+ " el interes es de7% "+primerInteres);
			System.out.println("interes anual es de: "+prestamo%primerInteres);
		}
		else {
			System.out.println("su prestamo es de :"+prestamo+" aprobado y su interes es de 6%"+segundoInteres);
			System.out.println("el interes anual es de: "+prestamo%segundoInteres);
		}
			
		}
	}


