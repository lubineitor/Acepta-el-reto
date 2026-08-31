package aceptaelreto;

import java.util.Scanner;

class Movil {
	
	int pi, di, pd, dd;
	Movil left, right;

	public Movil(int pi, int di, int pd, int dd) {
		this.pi = pi;
		this.di = di;
		this.pd = pd;
		this.dd = dd;
		this.left = null;
		this.right = null;
	}
}

public class Moviles_104 {
	
	private static Scanner sc = new Scanner(System.in);

	private static boolean isBalanced(Movil movil) {
		if (movil == null) {
			return true;
		}

		boolean leftBalanced = true;
		if (movil.pi == 0) {
			movil.left = readMovil();
			leftBalanced = isBalanced(movil.left);
			movil.pi += movil.left.pi + movil.left.pd;
		}

		boolean rightBalanced = true;
		if (movil.pd == 0) {
			movil.right = readMovil();
			rightBalanced = isBalanced(movil.right);
			movil.pd += movil.right.pi + movil.right.pd;
		}

		boolean currentBalanced = (movil.pi * movil.di == movil.pd * movil.dd);

		return leftBalanced && rightBalanced && currentBalanced;
	}

	private static Movil readMovil() {
		int pi = sc.nextInt();
		int di = sc.nextInt();
		int pd = sc.nextInt();
		int dd = sc.nextInt();
		return new Movil(pi, di, pd, dd);
	}

	public static void main(String[] args) {
		while (true) {
			Movil movil = readMovil();
			if (movil.pi == 0 && movil.di == 0 && movil.pd == 0 && movil.dd == 0) {
				break;
			}
			System.out.println(isBalanced(movil) ? "SI" : "NO");
		}
	}
}