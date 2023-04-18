package areaRectangulo;
import java.util.Scanner;
public class areaRectangulo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner(System.in);
		
		//B=base, H=altura 
		int B, H;
		
		System.out.println("Introduzca la base de su rectangulo");
		B=tecl.nextInt();
		
		System.out.println("Introduzca la altura de su rectangulo");
		H=tecl.nextInt();
		
		System.out.println("El area de su rectangulo es: "+B*H);
		
		

	}

}
