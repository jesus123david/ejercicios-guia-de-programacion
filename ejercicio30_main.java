package ejercicio30;
import java.util.Scanner;
public class ejercicio30_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecl = new Scanner (System.in);
		float x, y, expo=2,result=0;
		
		System.out.println("imprima el valor de x ");
		x=tecl.nextFloat();
		System.out.println("imprima el valor de y ");
		y=tecl.nextFloat();
		
		if(x<0 && y<0) {
			System.out.println("se elevan al cuadrado y se suman");
			result=(float) (Math.pow(x,expo)+Math.pow(y, expo));
			System.out.println(result);
			
		}
		else if(x<0 && y>0) {
			System.out.println("se resta el valor de Y y el de X");
			result=y-x;
			System.out.println(result);
		}
		else if(x>0 && y<0) {
			System.out.println("se divide X entre Y");
			result=x/y;
			System.out.println(result);
		}
		else if(x>0 && y>0 && x>y) {
			System.out.println("si X es mayor que Y se suman X+Y, se saca el maximo de X y Y,");
			float mayor=Math.max(x,y);
			float menor=Math.min(x,y);
			System.out.println("el numero menor es: "+menor);
			System.out.println("el numero mayor es: "+mayor);
			result=x+y;
			System.out.println(result);
		}
		else if(y>x) {
			 System.out.println("siendo Y mayor que X,se le sacara raiz cuadrada a X");
			result=(float) Math.sqrt(x);
			System.out.println(result);
		}
		else {
			System.out.println("su opcion no es valida");
		}
	}

}
