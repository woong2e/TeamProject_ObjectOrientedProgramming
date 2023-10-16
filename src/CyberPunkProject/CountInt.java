package CyberPunkProject;

import java.awt.Toolkit;

public class CountInt extends Thread {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	public static boolean timeAttack = false;

	@Override
	public void run() {
		for (int i = 5; i >= 0; i--) {
			toolkit.beep();

			if (InputInt.checkInput) {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
		if (InputStr.checkInput) {
			return;
		} else {
			timeAttack = true;
			System.out.println("시간초과로 죽었습니다.");
			System.out.println("아무 문자나 입력하시오.");
			return;
		}
	}
}