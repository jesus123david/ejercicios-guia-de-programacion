package perimetroAreaDeUnCirculo;
import java.util.Scanner;
public class perimetroAreaDeUnCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner check = new Scanner (System.in);
		int radio, expo=2;
		
		System.out.println("Introduzca el valor del radio de la circunferencia");
		radio=check.nextInt();
		
		System.out.println("El perimetro de la circunferencia es: "+2*(Math.PI*radio));
		
		System.out.println("El valor del area de la circunferencia es "+(Math.PI*Math.pow(radio, expo)));

	}

}
