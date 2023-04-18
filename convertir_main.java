package kilogramosAlibras;
import java.util.Scanner;
public class convertir_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl=new Scanner(System.in);
		int kilogr;
		
		System.out.println("Introduzca la cantidad de kilogramos");
		kilogr=tecl.nextInt();
		
		System.out.println("Su equivalente en libras es:"+kilogr*2.2046);
	}

}
