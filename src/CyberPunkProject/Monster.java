package CyberPunkProject;

public class Monster extends MonsterInfo {

	@Override
	public String getName() {
		return "(monster)" + Name;
	}

	Monster() {

	}

	Monster(String monster, int Index) {
		if (monster.equals("Villain")) {
			this.Index = GameData.VillainLIST[Index][0];
			this.Hp = GameData.VillainLIST[Index][1];
			this.Defense = GameData.VillainLIST[Index][2];
			this.Power = GameData.VillainLIST[Index][3];
			this.Exp = GameData.VillainLIST[Index][4];
			this.Money = GameData.VillainLIST[Index][5];

			this.Name = switch (Index) {
			case 1 -> "경위";
			case 2 -> "17살 양아치";
			case 3 -> "마피아1";

			case 4 -> "경감";
			case 5 -> "27살 양아치";
			case 6 -> "마피아2";

			case 7 -> "경정";
			case 8 -> "37살 양아치";
			case 9 -> "마피아3";

			default -> throw new IllegalArgumentException("Unexpected value: " + Index);
			};
		} else {
			this.Index = GameData.BossLIST[Index][0];
			this.Hp = GameData.BossLIST[Index][1];
			this.Exp = GameData.BossLIST[Index][2];
			this.Money = GameData.BossLIST[Index][3];

			this.Name = switch (Index) {
			case 1 -> "경찰총장";
			case 2 -> "맥그리거";
			case 3 -> "장첸";

			case 4 -> "법무부장관";
			case 5 -> "마이크 타이슨";
			case 6 -> "강해상";

			case 7 -> "신재웅";
			case 8 -> "임형빈";
			case 9 -> "김남훈";

			default -> throw new IllegalArgumentException("Unexpected value: " + Index);
			};

		}
	}

}
