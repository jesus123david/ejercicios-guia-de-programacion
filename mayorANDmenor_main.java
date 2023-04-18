package mayorANDmenor;
import java.util.Scanner;
public class mayorANDmenor_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tr = new Scanner (System.in);
		short x, y;
		
		System.out.println("ingrese el valor 1");
		x=tr.nextShort();
		System.out.println("ingrese el valor 2");
		y=tr.nextShort();
		
		 short mayor=(short) Math.max(x,y);
		short menor = (short) Math.min(x,y);
		short diferencia=  ((short) (mayor-menor));
		
		System.out.println("la diferencia entre "+mayor+" y "+menor+" es de: "+diferencia);
	}

}
