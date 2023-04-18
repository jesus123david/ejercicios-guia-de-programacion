package fahrenheitCelsius;
import java.util.Scanner;
public class convertirFahrenheitCelsius_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temperatura=new Scanner(System.in);
		double fahrenheit, celsius = 5.0/9.0;
		
		System.out.println("Ingrese la temperatura deseada en fahrenheit");
		fahrenheit=temperatura.nextDouble();
		
		System.out.println("La temperatura en celsius es:"+(fahrenheit-32)*celsius);
		
	}

}
