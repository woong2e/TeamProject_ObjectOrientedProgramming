package CyberPunkProject;

import java.util.Scanner;

public class Job {

	void chooseJob() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("직업을 선택하세요. ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("1. NetRunner  // HP : 100 //  MP : 100 // 피로도 : 100 // 신체 한계치 : 60");
		System.out.println("2. Gunner  // HP : 130 //  MP : 70 // 피로도 : 70 // 신체 한계치 : 60");
		System.out.println("3. Infighter  // HP : 150 //  MP : 60 // 피로도 : 60 // 신체 한계치 : 100");
		System.out.println("번호 입력 : ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();

		while (true) {
			if (i == 1) {
				// netrunner
				Me.myJobName = "NetRunner";
				Me.myJobidx = i;
				Me.hp = 100;
				Me.maxHp = 100;
				Me.mp = 100;
				Me.maxMp = 100;
				Me.defense = 50;
				Me.maxFatigue = 100;
				Me.fatigue = 0;
				Me.maxbodyLimit = 60;
				Me.exp = 0;
				Me.level = 0;
				Me.myBasicSkill[i] = new basicSkill(i);
				System.out.println("NetRunner를 선택하셨습니다 ! ");
				System.out.println("****************************************");
				break;
			} else if (i == 2) {
				// gunner
				Me.myJobName = "Gunner";
				Me.myJobidx = i;
				Me.hp = 130;
				Me.maxHp = 130;
				Me.mp = 70;
				Me.maxMp = 70;
				Me.defense = 60;
				Me.maxFatigue = 70;
				Me.fatigue = 0;
				Me.maxbodyLimit = 60;
				Me.exp = 0;
				Me.level = 0;
				Me.myBasicSkill[i] = new basicSkill(i);
				System.out.println("Gunner를 선택하셨습니다 ! ");
				System.out.println("****************************************");
				break;
			} else if (i == 3) {
				// infighter
				Me.myJobName = "Infighter";
				Me.myJobidx = i;
				Me.hp = 150;
				Me.maxHp = 150;
				Me.mp = 60;
				Me.maxMp = 60;
				Me.defense = 90;
				Me.maxFatigue = 60;
				Me.fatigue = 0;
				Me.maxbodyLimit = 100;
				Me.exp = 0;
				Me.level = 0;
				Me.myBasicSkill[i] = new basicSkill(i);
				System.out.println("Infighter를 선택하셨습니다 ! ");
				System.out.println("****************************************");
				break;
			} else {
				System.out.println("유효한 번호를 입력하세요 . ");
				System.out.println("****************************************");

			}
		}
	}

}