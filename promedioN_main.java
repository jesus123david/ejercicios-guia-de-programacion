package promedioNotas;
import java.util.Scanner;
public class promedioN_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Ingrese el número de notas a promediar: ");
	        int n = sc.nextInt(); 
	        
	        double[] notas = new double[n]; 
	        
	      
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese la nota " + (i+1) + ": ");
	            notas[i] = sc.nextDouble();
	        }
	        
	       
	        double suma = 0;
	        for (int i = 0; i < n; i++) {
	            suma += notas[i];
	        }
	        double promedio = suma / n;
	        
	        
	        System.out.println("El promedio de las " + n + " notas es " + promedio);
	        
	}

}
