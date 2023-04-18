package ecuacionesLinealesConDosIncognitas;
import java.util.Scanner;
public class ecuacionesLinealesConDosIncognitas_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lineal = new Scanner (System.in);
		float[][] var = new float [3][3];
		float a, b, c, d, x,y,dx,dy,e,f, deter;
		
		//introducir los datos de las filas y columnas de la matriz
		System.out.println("ingrese valor de a");
		a=lineal.nextFloat();	
		
		System.out.println("ingrese valor de b");
		b=lineal.nextFloat();
		
		System.out.println("ingrese valor de c");
		c=lineal.nextFloat();
		
		System.out.println("ingrese el valor de d");
		d=lineal.nextFloat();
		
		System.out.println("ingrese el valor independiente1");
		e=lineal.nextFloat();
		
		System.out.println("ingrese el valor independiente2");
		f=lineal.nextFloat();
		
		//encontrar el determinante de x
		deter=(a*b)-(c*d);
		dx=(e*d)-(b*f);
		x=dx/deter;
		
		//encontrar el determinante de y
		dy=(a*f)-(e*c);
		y=deter/dy;
		
		//sustituir
		System.out.println("el valor de la primera ecuacion es: "+(x=e+b*y));
		x=e+b*y;
		System.out.println("el valor de la segunda ecuacion es: "+(y=f+c*x));
	}

}
