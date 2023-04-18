package signosPositivosNegativos;
import java.util.Scanner;
public class positivosNegativo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner siu = new Scanner (System.in);
		short n1, n2;
		
		System.out.println("escriba el numero 1");
		n1=siu.nextShort();
		System.out.println("escriba el numero 2");
		n2=siu.nextShort();
		
		if(n1<0 && n2>0) {
			System.out.println("signos opuestos");
		}
		else if(n2<0 && n1>0) {
			System.out.println("signos opuestos");
		}
		else {
			System.out.println("fuera de los parametros");
		}
	}

}
