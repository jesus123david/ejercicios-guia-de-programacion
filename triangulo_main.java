package areaTriangulo;
import java.util.Scanner;
public class triangulo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lados=new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("Ingrese el lado 1");
		lado1=lados.nextDouble();
		
		System.out.println("Ingrese el lado 2");
		lado2=lados.nextDouble();
		
		System.out.println("Ingrese el lado 3");
		lado3=lados.nextDouble();
		
		System.out.println("El perimetro es igual a:\n"+(lado1+lado2+lado3));
		
		//encontrar el semiperimetro dividiendo entre 2
		Double semi=(lado2+lado2+lado3)/2;
		System.out.println("El semiperimetro es:\n"+semi);
		
		Double area=(semi*(semi-lado1)*(semi-lado2)*(semi-lado3));
		System.out.println("El area del triangulo es:\n"+area);

	}

}
