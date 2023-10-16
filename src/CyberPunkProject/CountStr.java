package CyberPunkProject;

import java.awt.Toolkit;

public class CountStr extends Thread {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	public static boolean timeAttack = false;

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			toolkit.beep();

			if (InputStr.checkInput) {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		if (InputStr.checkInput) {
			return;
		} else {
			timeAttack = true;
			System.out.println("시간초과로 죽었습니다.");
			System.out.println("아무 키나 입력하시오.");
			return;
		}
	}
}