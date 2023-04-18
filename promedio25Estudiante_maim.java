package promedio25Estudiante;
import java.util.Scanner;
public class promedio25Estudiante_maim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A = new Scanner (System.in);
		String nombre = null;
		byte alumnos=25, nota1,nota2,nota3,promedio = 0;
		
		
		for(byte i=0; i<=alumnos;i++) {
			
			System.out.println("introduzca su nombre:"+(i+1));
			nombre=A.nextLine();
			System.out.println("ingrese la nota 1");
			nota1=A.nextByte();
			System.out.println("ingrese la nota 2");
			nota2=A.nextByte();
			System.out.println("ingrese la nota 3");
			nota3=A.nextByte();
			
			promedio=(byte) ((nota1+nota2+nota3)/3);
			System.out.println("el promedio de "+nombre+" es de "+promedio);
		}
		
	}

}
