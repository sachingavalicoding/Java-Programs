import java.util.Scanner;

class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n / 2 || i == n / 2 || (i == n - 1 && j < n / 2)
						|| (i == 0 && j > n / 2) || (j == 0 && i < n / 2)
						|| (j == n - 1 && i > n / 2) || (i == n / 4 && j == n / 4)
						|| (i == (n / 2 + n / 4) && j == (n / 2 + n / 4))
						|| ((i + j == n - 1) && (i == n / 4) || ((i + j == n - 1) && (j == n / 4)))) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
