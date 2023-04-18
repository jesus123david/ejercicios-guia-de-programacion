package calcularFactorial;
import java.util.Scanner;
public class calcularFactorial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner logic = new Scanner (System.in);
		short num, resultado=1;
		
		System.out.println("ingrese el numero");
		num=logic.nextShort();
		
		for(short i=1; i<=num; i++) {
			resultado=(short) (resultado*i);
		}
		System.out.println("el factorial de "+num+" es igual a: "+resultado);
	}

}
