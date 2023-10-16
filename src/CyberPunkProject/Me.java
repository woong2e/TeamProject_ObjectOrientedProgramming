package CyberPunkProject;

public class Me {
	static String name;
	static String myJobName;
	static double weaponDamage;
	static double exp;
	static double hp;
	static double maxHp;
	static double mp;
	static double maxMp;
	static double fatigue;
	static double maxFatigue;
	static double money;
	static double countHpPortion;
	static double countMpPortion;
	static double defense;
	static int myJobidx;
	static int level;
	static double mybodyLimit = 0;
	static double maxbodyLimit;
	static String[] mypartsName = new String[10];
	static String[] mychipsName = new String[10];
	static String[] myweaponName = new String[10];
	static String[] mypartsSkillName = new String[10];
	static String[] mychipsSkillName = new String[10];
	static String[] myWeaponSkillName = new String[10];
	static basicSkill[] myBasicSkill = new basicSkill[4];
	static partsSkill[] myPartsSkill = new partsSkill[10];
	static chipSkill[] myChipSkill = new chipSkill[10];
	static weaponSkill[] myWeaponSkill = new weaponSkill[10];
	static double bdamage[] = { 0, 100, 100, 100 };

	void printMyInfo() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("이름 : " + name + " // 직업 : " + myJobName + " // 보유 돈 : " + money + " // hp : " + hp + "/"
				+ maxHp + " // mp : " + mp + "/" + maxMp + " // 피로도 : " + fatigue + "/" + maxFatigue + " // 경험치 : "
				+ exp + " // 방어력 : " + defense + " // 레벨 : " + level);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("보유 파츠 : ");
		for (String x : mypartsName) {
			System.out.print(x + " // ");
			System.out.println("---------------------------------------------------------------------------------");
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("보유 무기 : ");
		for (String x : myweaponName) {
			System.out.print(x + " // ");
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("보유 칩 : ");
		for (String x : mychipsName) {
			System.out.print(x + " // ");
		}

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("보유 포션 : ");
		System.out.println(countHpPortion);
		System.out.println(countMpPortion);
		System.out.println("---------------------------------------------------------------------------------");
	}

}