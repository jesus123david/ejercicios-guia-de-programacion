package aprobadoReprobado;
import java.util.Scanner;
public class aprobadoReprobado_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner (System.in);
		int notaFinal, parcial1, parcial2, parcial3, parcial4;
		
		System.out.println("ingrese la nota del parcial 1");
		parcial1=tec.nextInt();
		System.out.println("ingrese la nota del parcial 2");
		parcial2=tec.nextInt();
		System.out.println("ingrese la nota del parcial 3");
		parcial3=tec.nextInt();
		System.out.println("ingrese la nota del parcial 4");
		parcial4=tec.nextInt();
		
		notaFinal=parcial1+parcial2+parcial3+parcial4;
		
		if(notaFinal>=60) {
			System.out.println("estudiante a aprobado");
		}
		else {
			System.out.println("el estudiante a reprobado");
		}
	}

}
