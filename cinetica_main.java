package energiaCinetica;
import java.util.Scanner;
public class cinetica_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner (System.in);
		float expo = 2,altura, masa, gravedad=(float) 9.81, velocidad, energiaT,energiaC;
		
		//energia cinetica calcular primero 
		System.out.println("ingrese los datos para encontrar la energia cinetica");
		System.out.println("ingrese la masa del objeto");
		masa=c.nextFloat();
		System.out.println("ingrese la velocidad del objeto");
		velocidad=c.nextFloat();
		System.out.println("la energia cinetica del objeto es:"+(masa*(Math.pow(velocidad, expo)/2)));
		energiaC = (float)  (masa*(Math.pow(velocidad, expo)/2));
		
		//energia potencial
		System.out.println("ingrese la altura del objeto");
		altura=c.nextFloat();
		System.out.println("la velocidad potencial es: "+masa*gravedad*altura);
		float energiaP = masa*gravedad*altura;
		
		//energia total
		energiaT=energiaC+energiaP;
		System.out.println("la energia total de su objeto es: "+(energiaT));
	}

}
