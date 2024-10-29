import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

		double Studi = scanner.nextDouble(); double IPK = scanner.nextDouble();
		int EPRT = scanner.nextInt();
		String HKI = scanner.nextLine();
		String Lomba = scanner.nextLine();

		if (Studi >= 3.0 && IPK >= 3.0 - 3.5 && EPRT >= 450) {
			System.out.println("Cumlaude");
		} else {
			System.out.println("Tidak cumlaude");
		}

		scanner.close();
	}
}
