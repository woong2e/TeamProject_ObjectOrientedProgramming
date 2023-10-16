package CyberPunkProject;

import java.util.Random;
import java.util.Scanner;

public class InputInt extends Thread {
	Random random = new Random();
	Scanner sn = new Scanner(System.in);
	public static boolean checkInput = false;

	@Override
	public void run() {
		int x = random.nextInt(100);
		int y = random.nextInt(100);
		int z = random.nextInt(100);
		int sum = x + y + z;
		int input;
		System.out.printf("%d + %d + %d\n", x, y, z);
		System.out.println("5초 안에 정답을 입력하시오. ");

		while (true) {
			try {
				input = sn.nextInt();
				if (input == sum) {
					checkInput = true;
					break;
				}
				return;
			} catch (Exception e) {
				return;
			}
		}

		System.out.println("잡았다요놈");

	}
}