package notasEnLetras;
import java.util.Scanner;
public class notasEnLetras_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner soul = new Scanner (System.in);
		byte nota;
		System.out.println(" ingrese la nota del estudiante ");
		nota=soul.nextByte();
		
		if(nota>=90) {
			System.out.println("A");
		}
		else if(nota<90 && nota>=80) {
			System.out.println("B");
		}
		else if(nota>=70 && nota<80) {
			System.out.println("C");
		}
		else if(nota>=65 && nota<70) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}

}
