package CyberPunkProject;

import java.util.Scanner;

public class House {
	int restType;

	// 휴식 타입 선택
	void chooseRest() {
		System.out.println("********************");
		System.out.println("1. 책 읽기");
		System.out.println("(Lv0 이상, 피로도 -10)");
		System.out.println("2. TV 보기");
		System.out.println("(Lv10 이상, 피로도 -20)");
		System.out.println("3. 게임하기");
		System.out.println("(Lv30 이상, 피로도 -30)");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		restType = in.nextInt();

	}

	// 휴식 후 피로도 변화
	void rest() {
		chooseRest();
		switch (restType) {
		case 1 -> {
			if (Me.fatigue < 10) {
				Me.fatigue = 0;
			} else
				Me.fatigue -= 10;
			System.out.println("피로도가 10 감소했어!");
		}
		case 2 -> {
			if (Me.level >= 10) {
				if (Me.fatigue < 20) {
					Me.fatigue = 0;
				} else
					Me.fatigue -= 20;
				System.out.println("피로도가 20 감소했어!");
			} else {
				System.out.println("레벨 10부터 사용할 수 있어!");
			}
		}
		case 3 -> {
			if (Me.level >= 20) {
				if (Me.fatigue < 30) {
					Me.fatigue = 0;
				} else
					Me.fatigue -= 30;
				System.out.println("피로도가 30 감소했어!");
			} else {
				System.out.println("레벨 20부터 사용할 수 있어!");
			}
		}
		}
		return;
	}
}