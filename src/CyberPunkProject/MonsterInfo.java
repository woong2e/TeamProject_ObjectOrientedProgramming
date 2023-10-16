package CyberPunkProject;

public class MonsterInfo {

	public String Name;
	public int Index;
	public double Hp;
	public double Defense;
	public double Power;
	public double Exp;
	public double Money;

	public static void getInfo(MonsterInfo o) {
		System.out.printf("||||               MONSTER NAME    %s\n", o.getName());
		System.out.printf("||||            IND       :      %5d                           ||||\n", o.getIndex());
		System.out.printf("||||            HP        :      %5d                           ||||\n", o.getHp());
		System.out.printf("||||            Defense        :      %5d                           ||||\n", o.getDefense());
		System.out.printf("||||            Power        :      %5d                           ||||\n", o.getPower());
		System.out.printf("||||            Exp       :      %5d                           ||||\n", o.getExp());
		System.out.printf("||||            Money       :      %5d                           ||||\n", o.getMoney());
	}

	public String getName() {
		return Name;
	}

	public int getIndex() {
		return this.Index;
	}

	public double getHp() {
		return this.Hp;
	}

	public double getDefense() {
		return this.Defense;
	}

	public double getPower() {
		return this.Power;
	}

	public double getExp() {
		// TODO Auto-generated method stub
		return this.Exp;
	}

	public double getMoney() {
		// TODO Auto-generated method stub
		return this.Money;
	}
}
////////////////////////////////////////
//	public void setName(String name) {
//		this.Name = name;
//	}
//	
//	public void setIndex(int index) {
//		this.Index = index;
//	}
//
//	public void setHp(int hp) {
//		this.Hp = hp;
//	}
//
//	public void setExp(int exp) {
//		this.Exp = exp;
//	}
//
//	public void setMoney(int money) {
//		this.Money = money;
//	}
//}
