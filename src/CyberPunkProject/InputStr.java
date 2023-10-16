package CyberPunkProject;

import java.util.Scanner;

public class InputStr extends Thread {
	Scanner sn = new Scanner(System.in);
	public static boolean checkInput = false;

	@Override
	public void run() {
		int t = 0;
		System.out.println("10초 안에 a를 50번 이상 타이핑 해서 상대를 죽이자!");
		String a;
		while (t < 50) {
			a = sn.next();
			for (int k = 0; k < a.length(); k++)
				if (a.charAt(k) == 'a')
					t++;
			if (CountStr.timeAttack) {
				break;
			}
		}

		if (CountStr.timeAttack == false) {
			checkInput = true;
			System.out.println("잡았다요놈");
			return;
		}
	}
}
