package PasarACentimetros;
import java.util.Scanner;
public class centimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner (System.in);
		int op, Y, F, I;
		boolean salir = false;
		
		System.out.println("selecione la mejor opcion para su seleccion");
		
		while(!salir) {
			System.out.println("opcion 1 de yardas a centimetros");
			
			System.out.println("opcion 2 de pies a centimetros");
			
			System.out.println("opcion 3 de pulgadas a centimetros");
		
			System.out.println("opcion de salir del conversor ");
			System.out.println("ingrese la opcion que mas le convenga");
			op=t.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("A elegido la primera opcion");
				Y=t.nextInt();
				System.out.println("La equivalencia de yarda a centimetros es: "+Y*91.44);
				break;
				
			case 2:
				System.out.println("A elegido la segunda opcion");
				F=t.nextInt();
				System.out.println("la equivalencia de pies a centimetros es de "+F*30.48);
				break;
				
			case 3:
				System.out.println("A elegido la tercera opcion");
				I=t.nextInt();
				System.out.println("La equivalencia de pulgadas a centimetros es de "+I*2.54);
				break;
				
			case 4:
				System.out.println("A optado por salir y no realizar ninguna conversion");
				salir=true;
				System.out.println("Tenga lindo dia");
				break;
				
				default:
					System.out.println("opcion no valida");

				
			}
		}
	}

}
