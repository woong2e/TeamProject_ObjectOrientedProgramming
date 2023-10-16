package CyberPunkProject;

import java.util.Random;
import java.util.Scanner;

public class Train extends Skill {
	Random random = new Random();
	int upgradeType;
	int reinforceType;

	// 무기 강화 주문서 선택
	void chooseSpellBook() {
		System.out.println("주문서를 선택하세요.");
		System.out.println("********************");
		System.out.println("1. 30% 주문서");
		System.out.println("(강화 성공률 30%, 170페소) // (성공 시 30% 성능 증가, 실패 시 20% 성능 감소 )");
		System.out.println("2. 60% 주문서");
		System.out.println("(강화 성공률 60%, 150페소) // (성공 시 10% 성능 증가, 실패 시 10% 성능 감소 )");
		System.out.println("3. 90% 주문서");
		System.out.println("(강화 성공률 90%, 100페소) // (성공 시 5% 성능 증가, 실패 시 10% 성능 감소 )");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		upgradeType = in.nextInt();
	}

	// 무기 강화
	void upgradeWeapon() {
		chooseSpellBook();
		switch (upgradeType) {
		case 1 -> {
			if (Me.money < 170) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
				return;
			} else {
				Me.money -= 170;
				if (random.nextDouble() <= 0.3) {
					System.out.println("강화에 성공했어, 축하해!");
					Me.weaponDamage = Me.weaponDamage * (130 / 100);
				} else {
					System.out.println("저런, 강화에 실패했어..");
					Me.weaponDamage = Me.weaponDamage * (80 / 100);
				}
			}
		}
		case 2 -> {
			if (Me.money < 150) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
				return;
			} else {
				Me.money -= 150;
				if (random.nextDouble() <= 0.6) {
					System.out.println("강화에 성공했어, 축하해!");
					Me.weaponDamage += Me.weaponDamage * (110 / 100);
				} else {
					System.out.println("저런, 강화에 실패했어..");
					Me.weaponDamage -= Me.weaponDamage * (90 / 100);
				}
			}
		}
		case 3 -> {
			if (Me.money < 100) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
				return;
			} else {
				Me.money -= 100;
				if (random.nextDouble() <= 0.9) {
					System.out.println("강화에 성공했어, 축하해!");
					Me.weaponDamage += Me.weaponDamage * (105 / 100);
				} else {
					System.out.println("저런, 강화에 실패했어..");
					Me.weaponDamage -= Me.weaponDamage * (90 / 100);
				}
			}
		}
		}
	}

	// 신체 강화 선택
	void chooseReinforce() {
		System.out.println("신체 강화를 선택하세요.");
		System.out.println("********************");
		System.out.println("1. 러닝");
		System.out.println("(HP 최대치 +10, 50페소)");
		System.out.println("2. 스킬 연마");
		System.out.println("(MP 최대치 +10, 50페소)");
		System.out.println("3. 정신 수양");
		System.out.println("(피로도 최대치 +7, 500페소)");
		System.out.println("********************");
		System.out.println("4. 맷집 강화");
		System.out.println("(방어력 +5, 100페소)");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		reinforceType = in.nextInt();
	}

	// 신체 강화 스탯 변화
	void reinforceBody() {
		chooseReinforce();
		switch (reinforceType) {
		case 1 -> {
			if (Me.money < 50) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
			} else {
				Me.money -= 50;
				Me.maxHp += 10;
				System.out.println("HP 최대치가 10 증가했어!");
			}
		}
		case 2 -> {
			if (Me.money < 50) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
			} else {
				Me.money -= 50;
				Me.maxMp += 10;
				System.out.println("MP 최대치가 10 증가했어!");
			}
		}
		case 3 -> {
			if (Me.money < 500) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
			} else {
				Me.money -= 500;
				Me.maxFatigue += 7;
				System.out.println("피로도 최대치가 7 증가했어!");
			}
		}
		case 4 -> {
			if (Me.money < 100) {
				System.out.println("돈이 충분하지 않아. 다음에 다시 오라구!");
			} else {
				Me.money -= 100;
				Me.defense += 5;
				System.out.println("방어도가 7 증가했어!");
			}
		}
		}
	}

}