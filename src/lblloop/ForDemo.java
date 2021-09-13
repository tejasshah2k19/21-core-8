package lblloop;

public class ForDemo {

	public static void main(String[] args) {
		i:
		for (int i = 1; i <= 5; i++) {
			j:
			for (int j = 1; j <= 5; j++) {
				k:
				for (int k = 1; k <= 5; k++) {

					if (i == j && j == 3 && k == 4) {
							break j;
					}
				}
			}
		}
	}
}
