package determinanteOrden2;
import java.util.Scanner;
public class determinante_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner log = new Scanner (System.in);
		
		System.out.println("ingrese los datos");
		short[][] determinante = new short [2][2];
		short a, b, c, d;
		
		System.out.println("ingrese el valor de a");
		a=log.nextShort();
		
		System.out.println("ingrese el valor de b");
		b=log.nextShort();
		
		System.out.println("ingrese el valor de c");
		c=log.nextShort();
		
		System.out.println("ingrese el valor de d");
		d=log.nextShort();
		
		System.out.println("el resultado de la multiplicacion en x es: "+((a*b)-(c*d)));
  }

}
