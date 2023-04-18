package numeroDivisiblePor3;
import java.util.Scanner;
public class divisionPor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float caracter;
		
		System.out.println("ingrese el caracter");
		caracter=sc.nextFloat();
		
		if(caracter%3==0) {
			System.out.println("el numero "+caracter+ " es divisible por 3");
		}
		else {
			System.out.println("el numero "+caracter+ " no es divisible por 3");
		}
	}

}
