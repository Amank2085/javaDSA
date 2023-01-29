
package patterns;

import java.util.Scanner;

public class quesOne {
	
	/*****************
	
	1234
	1234
	1234
	1234
	
	*********************/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (i < 4) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + "");
			}
			System.out.println();
			i++;

		}
	}

}
