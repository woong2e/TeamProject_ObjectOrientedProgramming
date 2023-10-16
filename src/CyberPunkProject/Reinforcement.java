package CyberPunkProject;

import java.util.Scanner;

public class Reinforcement {
	String Parts[] = { "머리강화", "추가팔", "천리안", "다리강화", "산데비스탄", "어깨강화" };
	int PartsPrice[] = { 1000, 1000, 1000, 1000, 1000, 1000 };
	String PartSkill[] = { "비상한 두뇌", "거미 인간", "몽골인의 눈", "축지법", "분신술", "어깨빵" };

	String Chips[] = { "쿵푸", "태권도", "주짓수", "무에타이", "가라데" };
	int ChipsPrice[] = { 1000, 1000, 1000, 1000, 1000 };
	String ChipsSkill[] = { "타이차이", "돌려차기", "관절꺾기", "팔굽치기", "초승달치기" };

	void BuyingParts() {
		while (true) {

			// netrunner

			if (Me.myJobName == "NetRunner") {
				System.out.println("소문의 NetRunner가 너로군! 잘 왔다고! ");
				System.out.println("NetRunner는 머리강화 파츠만 구매가 가능해");
				System.out.println("---------------------------");
				System.out.println("가격표를 보여주지 ! ");

				System.out.print(Parts[0] + " : " + PartsPrice[0]);

				System.out.println("---------------------------");
				System.out.println("원하는 파츠 선택 : ");
				System.out.println("0. 나가기  " + " 1. " + Parts[0]);

				Scanner in = new Scanner(System.in);
				int b = in.nextInt();

				if (b == 0) {
					System.out.println("---------------------------");
					System.out.println("상점에서 나갑니다. ");
					System.out.println("---------------------------");
					break;
				} else if (b == 1) {
					if (Me.money >= PartsPrice[0]) {
						Me.mypartsName[0] = Parts[0];
						Me.myPartsSkill[0] = new partsSkill(0);
						Me.mypartsSkillName[0] = PartSkill[0];
						System.out.println(Parts[0] + "를 구매했습니다 !");
						System.out.println("---------------------------");
						System.out.println(PartSkill[0] + "이 스킬목록에 추가됩니다 !");
						System.out.println("---------------------------");
						Me.money = Me.money - PartsPrice[0];
						Me.mybodyLimit += 20;

					} else {
						System.out.println("---------------------------");
						System.out.println("돈이 부족합니다 ! ");
						System.out.println("---------------------------");
					}
				}
			}

			// gunner
			else if (Me.myJobName == "Gunner") {
				System.out.println("솜씨좋다던 Gunner가 너로군. 잘 왔다고! ");
				System.out.println("거너는 구매할 수 있는 파츠가 적어. ");
				System.out.println("가격표를 보여주지 ! ");
				for (int i = 1; i < 3; i++) {
					System.out.print(Parts[i] + " : " + PartsPrice[i] + " ");
				}

				System.out.println("---------------------------");

				System.out.println("---------------------------");
				System.out.println("원하는 파츠 선택 : ");
				System.out.println("0. 나가기  " + " 1. " + Parts[1] + " 2. " + Parts[2]);

				Scanner in = new Scanner(System.in);
				int b = in.nextInt();

				if (b == 0) {
					System.out.println("---------------------------");
					System.out.println("상점에서 나갑니다. ");
					System.out.println("---------------------------");
					break;
				} else if (b == 1) {
					if (Me.money >= PartsPrice[1]) {
						Me.mypartsName[1] = Parts[1];
						Me.myPartsSkill[1] = new partsSkill(1);
						Me.mypartsSkillName[1] = PartSkill[1];
						System.out.println(Parts[1] + "를 구매했습니다 !");
						System.out.println("---------------------------");
						System.out.println(PartSkill[1] + "이 스킬목록에 추가됩니다 !");
						System.out.println("---------------------------");
						Me.mybodyLimit += 20;
						Me.money = Me.money - PartsPrice[1];
					} else
						System.out.println("돈이 부족합니다 ! ");
				} else if (b == 2) {
					if (Me.money >= PartsPrice[2]) {
						Me.mypartsName[2] = Parts[2];
						Me.myPartsSkill[2] = new partsSkill(2);
						Me.mypartsSkillName[2] = PartSkill[2];
						System.out.println(Parts[2] + "를 구매했습니다 !");
						System.out.println("---------------------------");
						System.out.println(PartSkill[2] + "이 스킬목록에 추가됩니다 !");
						System.out.println("---------------------------");
						Me.mybodyLimit += 20;
						Me.money = Me.money - PartsPrice[2];
					} else {
						System.out.println("---------------------------");
						System.out.println("돈이 부족합니다 ! ");
						System.out.println("---------------------------");
					}
				}

			}

			// infighter
			else if (Me.myJobName == "Infighter") {
				System.out.println("강해보이는 인파이터로군! 잘 왔다 ! ");
				System.out.println("인파이터는 살 수 있는 파츠가 더 많다고 ! ");
				System.out.println("---------------------------");
				System.out.println("가격표를 보여주지 ! ");
				for (int i = 0; i < Parts.length; i++) {
					System.out.print(Parts[i] + " : " + PartsPrice[i] + " ");
					System.out.println("");
				}

				System.out.println("---------------------------");
				System.out.println("원하는 파츠 선택 : ");
				System.out.print("0. 나가기  ");
				for (int i = 3; i < Parts.length; i++)
					System.out.print((i - 2) + ". " + Parts[i] + " ");

				Scanner in = new Scanner(System.in);
				int b = in.nextInt();
				if (b == 0) {
					System.out.println("---------------------------");
					System.out.println("상점에서 나갑니다. ");
					System.out.println("---------------------------");
					break;
				} else if (b <= 3) // category 3,4,5
				{
					if (Me.money >= PartsPrice[b + 2]) {
						Me.mypartsName[b + 2] = (Parts[b + 2]);
						Me.myPartsSkill[b + 2] = new partsSkill(b + 2);
						Me.mypartsSkillName[b + 2] = PartSkill[b + 2];
						System.out.println(Parts[b + 2] + "를 구매했습니다 !");
						System.out.println("---------------------------");
						System.out.println(PartSkill[b + 2] + "가 스킬목록에 추가됩니다 !");
						System.out.println("---------------------------");
						Me.money = Me.money - PartsPrice[b + 2];
						Me.mybodyLimit += 20;
					} else {
						System.out.println("---------------------------");
						System.out.println("돈이 부족합니다 ! ");
						System.out.println("---------------------------");
					}
				}
			}

		}

	}

	void buyingChip() {
		System.out.println("---------------------------");
		System.out.println("소문의 " + Me.myJobName + "가 너로구나 ! " + "칩을 사러 왔군 ! 골라보라고 ");
		System.out.println("---------------------------");
		while (true) {
			System.out.println("가격표를 보여주지 ! ");
			System.out.println("---------------------------");
			for (int i = 0; i < Chips.length; i++) {
				System.out.print(Chips[i] + " : " + ChipsPrice[i] + " ");
				System.out.println("");
			}
			System.out.println("---------------------------");
			System.out.println("원하는 칩 선택 : ");
			System.out.println("---------------------------");
			System.out.print("0. 나가기  ");
			for (int i = 0; i < Chips.length; i++)
				System.out.print((i + 1) + ". " + Chips[i] + " ");

			Scanner in = new Scanner(System.in);
			int b = in.nextInt();
			if (b == 0) {
				System.out.println("---------------------------");
				System.out.println("상점에서 나갑니다. ");
				System.out.println("---------------------------");
				break;
			} else if (0 < b && b <= 5) // category 0,1,2,3,4
			{
				if (Me.money >= ChipsPrice[b - 1]) {
					Me.mychipsName[b - 1] = (Chips[b - 1]);
					Me.myChipSkill[b - 1] = new chipSkill(b - 1);
					Me.mychipsSkillName[b - 1] = ChipsSkill[b - 1];
					System.out.println(Chips[b - 1] + "를 구매했습니다 !");
					System.out.println("---------------------------");
					System.out.println(ChipsSkill[b - 1] + "이 스킬목록에 추가됩니다 !");
					System.out.println("---------------------------");
					Me.money = Me.money - ChipsPrice[b - 1];
					Me.mybodyLimit += 10;
				} else {
					System.out.println("---------------------------");
					System.out.println("돈이 부족합니다 ! ");
					System.out.println("---------------------------");
				}
			}
		}

	}
}