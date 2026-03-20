package main;
import java.util.*;
public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int mano_rand = rand.nextInt(3) + 1; int mano = 0; String[] formas_manos = {"0", "👊", "✋", "✌️"};
		
		System.out.println("1. Piedra"); System.out.println("2. Papel"); System.out.println("3. Tijera");
		System.out.print("¿Piedra, papel o tijera? ");
		mano = sc.nextInt();
		if (mano_rand == mano) {
			System.out.println("Uyyyy es empateeee.");
		} else if (((mano == 1) && (mano_rand == 2)) || ((mano == 2) && (mano_rand == 3)) || ((mano == 3) && (mano_rand == 1))) {
			System.out.println("Mal ahi perdisteee.");
		} else if (((mano == 2) && (mano_rand == 1)) || ((mano == 3) && (mano_rand == 2)) || ((mano == 1) && (mano_rand == 3))) {
			System.out.println("Esoo Ganasteeee.");
		} else {
			System.out.println("Ingresaste un dato que no es válido.");
			System.exit(0);
		}
		System.out.print("Vos:" + formas_manos[mano] + "\t PC:" + formas_manos[mano_rand]);
		sc.close();
	}
}
