package volumenCilindro;
import java.util.Scanner;
public class cilindro_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int expo=2;
		int radio, altura;
		
		System.out.println("Introduzca el radio");
		radio=leer.nextInt();
		
		System.out.println("Introduzca la altura");
		altura=leer.nextInt();
		
		double volumen=(Math.PI*(Math.pow(radio, expo)*altura));
		System.out.println("El volumen del cilindro es:\n"+volumen);
	}

}
