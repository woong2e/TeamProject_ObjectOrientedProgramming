package CyberPunkProject;

import java.util.Scanner;

public class Weapon {
	String Weapons[] = { "쇠파이프", "사스콰치의 망치", "카나보", "뉴로톡신 나이프", "버바의 전기톱", "밀리테크 M-10AF 렉싱턴 (거너 전용)",
			"로스토빅 DB-2 테스테라 (거너 전용)" };
	int WeaponsPrice[] = { 10000, 1500, 2000, 2500, 3000, 2000, 3000 };
	String WeaponSkill[] = { "파이프 휘두르기", "혼신의 일격", "회전 베기", "20연속 찌르기", "무아지경", "총알비", "데스 게틀링" };
	int chooseWeaponType;

	// 구매 무기 선택
	void chooseWeapon() {
		System.out.println("********************");
		System.out.println("0. 나가기");
		System.out.println("1. 쇠파이프");
		System.out.println("(1000페소, 파이프 휘두르기)");
		System.out.println("2. 사스콰치의 망치");
		System.out.println("(1500페소, 혼신의 일격)");
		System.out.println("3. 카나보");
		System.out.println("(2000페소, 회전 베기)");
		System.out.println("4. 뉴로톡신 나이프");
		System.out.println("(2500페소, 20연속 찌르기)");
		System.out.println("5. 버바의 전기톱");
		System.out.println("(3000페소, 무아지경)");
		System.out.println("6. 밀리테크 M-10AF 렉싱턴 (거너 전용)");
		System.out.println("(2000페소, 총알비)");
		System.out.println("7. 로스토빅 DB-2 테스테라 (거너 전용)");
		System.out.println("(3000페소, 데스 게틀링)");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		this.chooseWeaponType = in.nextInt();
	}

	// 무기 및 스킬 습득
	void getWeapon() {
		chooseWeapon();
		switch (chooseWeaponType) {
		case 0 -> {
			return; // 해당 클래스를 호출한 곳으로 돌아감
		}
		case 1 -> {
			if (Me.money < 1000) {
				System.out.println("돈이 충분하지 않습니다.");
				return;
			} else {
				Me.money -= 1000;
				Me.weaponDamage = 100;
				Me.myweaponName[0] = Weapons[0];
				Me.myWeaponSkillName[0] = WeaponSkill[0];
				Me.myWeaponSkill[0] = new weaponSkill(0);
				System.out.println("쇠파이프를 습득하였습니다.");
				System.out.println("파이프 휘두르기를 습득하였습니다.");
			}
		}
		case 2 -> {
			if (Me.money < 1500) {
				System.out.println("돈이 충분하지 않습니다.");
				return;
			} else {
				Me.money -= 1500;
				Me.weaponDamage = 150;
				Me.myweaponName[1] = Weapons[1];
				Me.myWeaponSkillName[1] = WeaponSkill[1];
				Me.myWeaponSkill[1] = new weaponSkill(1);
				System.out.println("사스콰치의 망치를 습득하였습니다.");
				System.out.println("혼신의 일격를 습득하였습니다.");
			}
		}
		case 3 -> {
			if (Me.money < 2000) {
				System.out.println("돈이 충분하지 않습니다.");
				return;
			} else {
				Me.money -= 2000;
				Me.weaponDamage = 200;
				Me.myweaponName[2] = Weapons[2];
				Me.myWeaponSkillName[2] = WeaponSkill[2];
				Me.myWeaponSkill[2] = new weaponSkill(2);
				System.out.println("카나보를 습득하였습니다.");
				System.out.println("회전 베기를 습득하였습니다.");
			}
		}
		case 4 -> {
			if (Me.money < 2500) {
				System.out.println("돈이 충분하지 않습니다.");
				return;
			} else {
				Me.money -= 2500;
				Me.weaponDamage = 250;
				Me.myweaponName[3] = Weapons[3];
				Me.myWeaponSkillName[3] = WeaponSkill[3];
				Me.myWeaponSkill[3] = new weaponSkill(3);
				System.out.println("뉴로톡신 나이프를 습득하였습니다.");
				System.out.println("20연속 찌르기를 습득하였습니다.");
			}
		}
		case 5 -> {
			if (Me.money < 3000) {
				System.out.println("돈이 충분하지 않습니다.");
				return;
			} else {
				Me.money -= 3000;
				Me.weaponDamage = 280;
				Me.myweaponName[4] = Weapons[4];
				Me.myWeaponSkillName[4] = WeaponSkill[4];
				Me.myWeaponSkill[4] = new weaponSkill(4);
				System.out.println("버바의 전기톱를 습득하였습니다.");
				System.out.println("무아지경 습득하였습니다.");
			}
		}
		case 6 -> {
			if (Me.myJobName == "Gunner") {
				if (Me.money < 2000) {
					System.out.println("돈이 충분하지 않습니다.");
					return;
				} else {
					Me.money -= 2000;
					Me.weaponDamage = 300;
					Me.myweaponName[5] = Weapons[5];
					Me.myWeaponSkillName[5] = WeaponSkill[5];
					Me.myWeaponSkill[5] = new weaponSkill(5);
					System.out.println("밀리테크 M-10AF 렉싱턴 (거너 전용)을 습득하였습니다.");
					System.out.println("총알비를 습득하였습니다.");
				}
			} else {
				System.out.println("이 무기는 거너만 구입할 수 있습니다.");
				return;
			}
		}
		case 7 -> {
			if (Me.myJobName == "Gunner") {
				if (Me.money < 3000) {
					System.out.println("돈이 충분하지 않습니다.");
					return;
				} else {
					Me.money -= 3000;
					Me.weaponDamage = 350;
					Me.myweaponName[6] = Weapons[6];
					Me.myWeaponSkillName[6] = WeaponSkill[6];
					Me.myWeaponSkill[6] = new weaponSkill(6);
					System.out.println("로스토빅 DB-2 테스테라 (거너 전용)를 습득하였습니다.");
					System.out.println("데스 게틀링을 습득하였습니다.");
				}
			} else {
				System.out.println("이 무기는 거너만 구입할 수 있습니다.");
				return;
			}
		}
		}
	}

}