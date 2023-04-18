package leerNotasAlumnosAprobadosDesaprobados;
import java.util.Scanner;
public class leerNotasAlumnosAprobadosDesaprobados_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		byte alumno;
		float nota1,nota2,nota3,nota4,resultado;
		
		System.out.println("ingrese el numero de alumnos");
		alumno=input.nextByte();
		
		for(float i=1; i<=alumno;i++) {
			
			System.out.println("ingrese la nota 1");
			nota1=input.nextFloat();
			System.out.println("ingrese la nota 2");
			nota2=input.nextFloat();
			System.out.println("ingrese la nota 3");
			nota3=input.nextFloat();
			System.out.println("ingrese la nota 4");
			nota4=input.nextFloat();
			resultado=(nota1+nota2+nota3+nota4);
			
			if(resultado>=60) {
				System.out.println("alumno aprobado");
			}
			else {
				System.out.println("alumno desaprobado");
			}
		}
	}

}
