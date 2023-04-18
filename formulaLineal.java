package formulaLineal;
import java.util.Scanner;
public class formulaLineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tu = new Scanner (System.in);
		float a, b, x;
		
		System.out.println("dijite el valor de a");
		a=tu.nextFloat();
		
		System.out.println("dijite el valor de b");
		b=tu.nextFloat();
		
		System.out.println("dijite el valor de x");
		x=tu.nextFloat();

		if(x > 0 || x < 0) {
			System.out.println("la solucion lineal es "+(x=-b/a));
		}
		else {
			System.out.println("a ingresado que x es igual a cero y no es valido");
		}
		
	}

}
