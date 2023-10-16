package CyberPunkProject;

import java.util.Scanner;

public class Portion {
	int choosePortionType;
	int takePortionType;

	// 구매 포션 선택
	void choosePortion() {
		System.out.println("********************");
		System.out.println("1. HP 포션");
		System.out.println("(100페소, HP 회복 20%)");
		System.out.println("2. MP 포션");
		System.out.println("(100페소, MP 회복 100%)");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		choosePortionType = in.nextInt();
//		in.close();
	}

	// 포션 습득
	void getPortion() {
		choosePortion();
		switch (choosePortionType) {
		case 1 -> {
			if (Me.money < 100) {
				System.out.println("돈이 충분하지 않습니다.");
				break;
			} else {
				Me.money -= 100;
				Me.countHpPortion += 1;
				System.out.println("HP 포션을 구입하였습니다.");
			}
		}
		case 2 -> {
			if (Me.money < 100) {
				System.out.println("돈이 충분하지 않습니다.");
				break;
			} else {
				Me.money -= 100;
				Me.countMpPortion += 1;
				System.out.println("MP 포션을 구입하였습니다.");
			}
		}
		}
	}

	// 포션 섭취
	void takePortion() {
		System.out.println("********************");
		System.out.println("현재 물약");
		System.out.printf("HP 포션 개수 : %s\n", Me.countHpPortion);
		System.out.printf("MP 포션 개수 : %s\n", Me.countMpPortion);
		System.out.println("********************");
		System.out.println("1. HP 포션");
		System.out.println("2. MP 포션");
		System.out.println("********************");
		System.out.println("포션을 선택하세요 : ");
		Scanner in = new Scanner(System.in);
		takePortionType = in.nextInt();
		switch (takePortionType) {
		case 1 -> {
			if (Me.countHpPortion <= 0) {
				System.out.println("HP 포션이 없습니다.");
			} else if (Me.maxHp < Me.maxHp + Me.maxHp / 5) {
				Me.hp = Me.maxHp;
				System.out.println("최대치로 회복되었습니다.");
			} else {
				Me.hp += Me.maxHp / 5;
			}
		}
		case 2 -> {
			if (Me.countMpPortion <= 0) {
				System.out.println("MP 포션이 없습니다.");
				System.out.println("전투에서 도망쳤습니다.");
			} else if (Me.maxMp < Me.maxMp + Me.maxMp / 2) {
				Me.mp = Me.maxMp;
				System.out.println("최대치로 회복되었습니다.");
			} else {
				Me.mp += Me.maxMp / 2;
			}
		}
		}
//		in.close();
	}

}