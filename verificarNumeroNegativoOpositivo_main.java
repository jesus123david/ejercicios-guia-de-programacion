package verificarNumeroNegativoOpositivo;
import java.util.Scanner;
public class verificarNumeroNegativoOpositivo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  caracter= new Scanner(System.in);
		float x;
		short expo1=2, expo2=4;
		
		System.out.println("escriba el numero");
		x=caracter.nextFloat();
		
		if(x < 0) {
			System.out.println(x*expo2);
		}
		else if(x==0) {
			System.out.println("valor no valido");
		}
		else {
			System.out.println(x*expo2);
		}
	}

}
