package voltaje;
import java.util.Scanner;
public class voltaje_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		 System.out.println("Ingrese la cantidad de voltajes que desea calcular: ");
	      int n = input.nextInt();
	      double[] voltajes = new double[n];
	      double suma = 0;
	      double min = Double.MAX_VALUE;
	      double max = Double.MIN_VALUE;
	      
	      
	      for (int i = 0; i < n; i++) {
	         System.out.println("Ingrese el voltaje #" + (i+1) + ": ");
	         voltajes[i] = input.nextDouble();
	         suma += voltajes[i];
	         if (voltajes[i] < min) {
	            min = voltajes[i];
	         }
	         if (voltajes[i] > max) {
	            max = voltajes[i];
	         }
	      }
	      
	      
	      double promedio = suma / n;
	      
	      
	      System.out.println("El voltaje mínimo es: " + min);
	      System.out.println("El voltaje máximo es: " + max);
	      System.out.println("El promedio de voltajes es: " + promedio);
	}

}
