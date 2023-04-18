package ladosTriangulo;
import java.util.Scanner;
public class ladosTriangulos_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner next = new Scanner (System.in);
		byte lado1, lado2, lado3;
		
		System.out.println("cuanto mide el primer lado del triangulo?");
		lado1=next.nextByte();
		System.out.println("cuanto mide el segundo lado del triangulo?");
		lado2=next.nextByte();
		System.out.println("cuanto mide el tercer lado del triangulo?");
		lado3=next.nextByte();
		
		if(lado1==lado2 && lado1==lado3 && lado2==lado3) {
			System.out.println("El triangulo es equilatero");
		}
		else if(lado1==lado2 && lado1!=lado3 || lado1==lado3 && lado1!=lado2 || lado2==lado3 && lado2!=lado1) {
			System.out.println("El triangulo es isosceles");
		}
		else if(lado1!=lado2 && lado2!=lado3 ) {
			System.out.println("El triangulo es escaleno");
		}
	}

}
