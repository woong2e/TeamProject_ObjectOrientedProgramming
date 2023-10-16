package CyberPunkProject;

public class Skill {
	Reinforcement sname = new Reinforcement();
	Weapon wname = new Weapon();
	double bdamage, cdamage, pdamage, wdamage;
	double nfatigue, nmp;
	String[] bsname = { "사이코키네시스", "난사", "카운터 펀치" };
	String[] psname = sname.PartSkill;

	String[] csname = sname.ChipsSkill;
	String[] wsname = wname.WeaponSkill;
}

class basicSkill extends Skill {

	public basicSkill(int i) {
		switch (i) {
		case 1 -> {
			nfatigue = 5;
			nmp = 5;
		}
		case 2 -> {
			nfatigue = 5;
			nmp = 5;
		}
		case 3 -> {
			nfatigue = 5;
			nmp = 5;
		}
		}
	}

	double usingBasicSkill(int i) {
		Me.fatigue = Me.fatigue + nfatigue;
		Me.mp = Me.mp - nmp;
		System.out.println("[ " + bsname[i - 1] + " ]" + "스킬을 사용했습니다 ! ");
		return (Me.hp * 2); // Me.bdamage[i];
	}

}

class partsSkill extends Skill {
	public partsSkill(int i) {
		switch (i) {
		case 0 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		case 1 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		case 2 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		case 3 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		case 4 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		case 5 -> {
			pdamage = Me.maxHp * 5;
			nfatigue = 10;
			nmp = 10;
		}
		}
	}

	double usingPartsSkill(int i) {
		Me.fatigue = Me.fatigue + nfatigue;
		Me.mp = Me.mp - nmp;
		System.out.println("[ " + psname[i] + " ]" + "스킬을 사용했습니다 ! ");
		return pdamage;
	}
}

class weaponSkill extends Skill {
	public weaponSkill(int i) {
		switch (i) {
		case 0 -> {
			wdamage = Me.weaponDamage;
			nfatigue = 10;
		}
		case 1 -> {
			wdamage = Me.weaponDamage * 2;
			nfatigue = 15;
		}
		case 2 -> {
			wdamage = Me.weaponDamage * 3;
			nfatigue = 20;
		}
		case 3 -> {
			wdamage = Me.weaponDamage * 4;
			nfatigue = 25;
		}
		case 4 -> {
			wdamage = Me.weaponDamage * 5;
			nfatigue = 30;
		}
		// 거너 전용 스킬
		case 5 -> {
			wdamage = Me.weaponDamage * 8;
			nfatigue = 20;
		}
		// 거너 전용 스킬2
		case 6 -> {
			wdamage = Me.weaponDamage * 10;
			nfatigue = 30;
		}
		}
	}

	double usingWeaponSkill(int i) {
		Me.fatigue = Me.fatigue + nfatigue;
		Me.mp = Me.mp - nmp;
		System.out.println("[ " + wsname[i] + " ]" + "스킬을 사용했습니다 ! ");
		return wdamage;
	}
}

class chipSkill extends Skill {
	public chipSkill(int i) {
		switch (i) {
		case 0 -> {
			cdamage = Me.level * 20;
			nfatigue = 10;
			nmp = 10;
		}
		case 1 -> {
			cdamage = Me.level * 20;
			nfatigue = 10;
			nmp = 10;
		}
		case 2 -> {
			cdamage = Me.level * 20;
			nfatigue = 10;
			nmp = 10;
		}
		case 3 -> {
			cdamage = Me.level * 20;
			nfatigue = 10;
			nmp = 10;
		}
		case 4 -> {
			cdamage = Me.level * 20;
			nfatigue = 10;
			nmp = 10;
		}
		}
	}

	double usingChipSkill(int i) {
		Me.fatigue = Me.fatigue + nfatigue;
		Me.mp = Me.mp - nmp;
		System.out.println("[ " + csname[i] + " ]" + "스킬을 사용했습니다 ! ");
		return cdamage;
	}
}