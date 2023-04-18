package ventaDePantalones;
import java.util.Scanner;
public class pantalones_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jh = new Scanner (System.in);
		byte pantalones, precio=10,precio2=12;
		
		System.out.println("cuantos pantalones desea comprar?");
		pantalones=jh.nextByte();
		
		if(pantalones>4) {
			System.out.println("el costo por los "+pantalones+ " pantalones es de:"+pantalones*precio2);
		}
		else {
			System.out.println("el costo de los "+pantalones+" pantalones es de: "+pantalones*precio);
		}
	}

}
