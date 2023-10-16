package CyberPunkProject;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	Random random = new Random();
	Scanner sn = new Scanner(System.in);
	int n;
	int m;

	public static boolean battleOk;
	public static boolean noportion;

	void boss_battle() {
		CountStr.timeAttack = false;
		InputStr.checkInput = false;
		CountInt.timeAttack = false;
		InputInt.checkInput = false;

		if (Me.level < 20) {
			System.out.println("1.경찰총장   2. 맥그리거   3. 장첸");
			System.out.println("전투할 상대를 입력하세요. : ");
			n = sn.nextInt();
			while (true) {
				if (0 < n && n < 4)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				n = sn.nextInt();
			}
		} else if (Me.level < 40) {
			System.out.println("4.법무부장관   5. 마이크 타이슨   6. 강해상");
			System.out.println("전투할 상대를 입력하세요. : ");
			n = sn.nextInt();
			while (true) {
				if (3 < n && n < 7)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				n = sn.nextInt();
			}
		} else {
			System.out.println("7.신재웅   8. 임형빈   9. 김남훈");
			System.out.println("전투할 상대를 입력하세요. : ");
			n = sn.nextInt();
			while (true) {
				if (4 < n && n < 7)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				n = sn.nextInt();
			}
		}
		Monster M = new Monster("Boss", n);

		int x = random.nextInt(2);
		if (x == 0) {
			intBattle(M);
			if (InputInt.checkInput == true) {
				Me.exp += M.Exp;
				Me.money += M.Money;
				if (Me.exp >= 1000) {
					Me.level += 1;
					System.out.println("  _      _____  _   _  _____  _       _   _ ______   _ \r\n"
							+ " | |    |  ___|| | | ||  ___|| |     | | | || ___ \\ | |\r\n"
							+ " | |    | |__  | | | || |__  | |     | | | || |_/ / | |\r\n"
							+ " | |    |  __| | | | ||  __| | |     | | | ||  __/  | |\r\n"
							+ " | |____| |___ \\ \\_/ /| |___ | |____ | |_| || |     |_|\r\n"
							+ " \\_____/\\____/  \\___/ \\____/ \\_____/  \\___/ \\_|     (_)\r\n"
							+ "                                                       \r\n"
							+ "                                                       ");
				}
			} else {
				System.out.println("레벨이 감소했다!");
				Me.level--;
			}
		} else {
			strBattle(M);
			if (InputStr.checkInput == true) {
				Me.exp += M.Exp;
				Me.money += M.Money;
				if (Me.exp >= 1000) {
					Me.level += 1;
					System.out.println("  _      _____  _   _  _____  _       _   _ ______   _ \r\n"
							+ " | |    |  ___|| | | ||  ___|| |     | | | || ___ \\ | |\r\n"
							+ " | |    | |__  | | | || |__  | |     | | | || |_/ / | |\r\n"
							+ " | |    |  __| | | | ||  __| | |     | | | ||  __/  | |\r\n"
							+ " | |____| |___ \\ \\_/ /| |___ | |____ | |_| || |     |_|\r\n"
							+ " \\_____/\\____/  \\___/ \\____/ \\_____/  \\___/ \\_|     (_)\r\n"
							+ "                                                       \r\n"
							+ "                                                       ");
				}
			} else {
				System.out.println("레벨이 감소했다!");
				Me.level--;
			}
		}

	}

	void villain_battle() {
		battleOk = true;
		noportion = false;
		if (Me.level < 10) {
			System.out.println("1.경위   2. 17살 양아치   3. 마피아1");
			System.out.println("전투할 상대를 입력하세요. : ");
			m = sn.nextInt();
			while (true) {
				if (0 < m && m < 4)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				m = sn.nextInt();
			}
		} else if (Me.level < 20) {
			System.out.println("4.경감   5. 27살 양아치   6. 마피아2");
			System.out.println("전투할 상대를 입력하세요. : ");
			m = sn.nextInt();
			while (true) {
				if (3 < m && m < 7)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				m = sn.nextInt();
			}
		} else if (Me.level < 30) {
			System.out.println("7.경정   8. 37살 양아치   9. 마피아3");
			System.out.println("전투할 상대를 입력하세요. : ");
			m = sn.nextInt();
			while (true) {
				if (4 < m && m < 7)
					break;
				System.out.println("전투할 상대를 입력하세요. : ");
				m = sn.nextInt();
			}
		}
		Monster M = new Monster("Villain", m);

		// 전투시작
		System.out.println("*******************");
		while (true) {
			monster_attacked(M, hero_attack(M));
			if (battleOk == false) {
				System.out.println("피로도를 회복하세요!");
				break;
			}
			if (noportion == true) {
				System.out.println("포션을 구매하세요!");
				break;
			}
			if (M.Hp <= 0) {
				Me.exp += M.Exp;
				if (Me.exp >= 1000) {
					Me.level += 1;
					Me.exp = 0;
					System.out.println("  _      _____  _   _  _____  _       _   _ ______   _ \r\n"
							+ " | |    |  ___|| | | ||  ___|| |     | | | || ___ \\ | |\r\n"
							+ " | |    | |__  | | | || |__  | |     | | | || |_/ / | |\r\n"
							+ " | |    |  __| | | | ||  __| | |     | | | ||  __/  | |\r\n"
							+ " | |____| |___ \\ \\_/ /| |___ | |____ | |_| || |     |_|\r\n"
							+ " \\_____/\\____/  \\___/ \\____/ \\_____/  \\___/ \\_|     (_)\r\n"
							+ "                                                       \r\n"
							+ "                                                       ");
				}
				Me.money += M.Money;
				break;
			}
			hero_attacked(M, monster_attack(M));
			if (Me.hp <= 0) {
				System.out.println(Me.name + "이 죽었습니다.");
				Me.hp = 1;
				System.out.println(Me.name + "이 체력" + Me.maxHp + "으로 부활했습니다.");
				break;
			}
		}
	}

	void intBattle(Monster M) {
		System.out.println("-----------------------------");
		System.out.println(M.Name + "와(과) 전투를 시작합니다.");
		Thread th1 = new InputInt();
		Thread th2 = new CountInt();

		try {
			th1.start();
			th2.start();
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
		}

	}

	void strBattle(Monster M) {
		System.out.println("-----------------------------");
		System.out.println(M.Name + "와(과) 전투를 시작합니다.");
		Thread th1 = new InputStr();
		Thread th2 = new CountStr();

		try {
			th1.start();
			th2.start();
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
		}
	}

	double hero_attack(Monster M) {
		Scanner sn = new Scanner(System.in);
		int k;
		Portion P = new Portion();
		double sum = 0;
		System.out.println(Me.name + "의 차례입니다.");

		System.out.println("1.공격   2.포션먹기");
		while (true) {
			k = sn.nextInt();
			if (k == 1 || k == 2)
				break;
		}

		if (k == 1) {
			System.out.println("사용할 스킬 선택");
			System.out.println("1.BasicSkill   2.PartsSkill   3.ChipSkill   4.WeaponSkill");
			k = sn.nextInt();
			while (true) {
				if (1 <= k && k <= 4)
					break;
				System.out.println("1.BasicSkill   2.PartsSkill   3.ChipSkill   4.WeaponSkill");
				k = sn.nextInt();
			}
			if (Me.fatigue < Me.maxFatigue) {
				switch (k) {
				case 1 -> {
					if (Me.mp < Me.myBasicSkill[Me.myJobidx].nmp) {
						System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
						P.takePortion();
						if (Me.countMpPortion == 0) {
							noportion = true;
						}
					} else {

						sum = Me.myBasicSkill[Me.myJobidx].usingBasicSkill(Me.myJobidx);
					}
				}
				case 2 -> {
					int nu = 0;
					for (int i = 0; i < Me.mypartsSkillName.length; i++) {
						if (Me.mypartsSkillName[i] == null) {
							nu += 1;
						}
					}

					if (nu != 10) {
						for (String a : Me.mypartsSkillName) {
							for (int i = 0; i < Me.mypartsSkillName.length; i++) {
								if (Me.mypartsSkillName[i] != null && Me.mypartsSkillName[i].equals(a)) {
									System.out.printf("%d. %s  ", i, a);
								}
							}
						}
						System.out.println();
						int j = sn.nextInt();
						int x = random.nextInt();
						if (Me.mp < Me.myPartsSkill[j].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							if (x == 0) {
								System.out.println("MISS");
							} else {
								sum = Me.myPartsSkill[j].usingPartsSkill(j);
							}
						}
					} else {
						int p = 0;
						while (true) {
							if (p == 1)
								break;
							System.out.println("장착한 파츠가 없습니다.");
							System.out.println("1.BasicSkill");
							p = sn.nextInt();
						}
						if (Me.mp < Me.myBasicSkill[Me.myJobidx].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							sum = Me.myBasicSkill[Me.myJobidx].usingBasicSkill(Me.myJobidx);
						}
					}
				}
				case 3 -> {
					int nu = 0;
					for (int i = 0; i < Me.mychipsSkillName.length; i++) {
						if (Me.mychipsSkillName[i] == null) {
							nu += 1;
						}
					}

					if (nu != 10) {
						for (String a : Me.mychipsSkillName) {
							for (int i = 0; i < Me.mychipsSkillName.length; i++) {
								if (Me.mychipsSkillName[i] != null && Me.mychipsSkillName[i].equals(a)) {
									System.out.printf("%d. %s  ", i, a);
									break;
								}
							}
						}
						System.out.println();
						int j = sn.nextInt();
						int x = random.nextInt();
						if (Me.mp < Me.myChipSkill[j].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							if (x == 0) {
								System.out.println("MISS");
							} else {
								sum = Me.myChipSkill[j].usingChipSkill(j);
							}
						}
					} else {
						int p = 0;
						while (true) {
							if (p == 1)
								break;
							System.out.println("장착한 칩이 없습니다.");
							System.out.println("1.BasicSkill");
							p = sn.nextInt();
						}
						if (Me.mp < Me.myBasicSkill[Me.myJobidx].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							sum = Me.myBasicSkill[Me.myJobidx].usingBasicSkill(Me.myJobidx);
						}
					}
				}
				case 4 -> {
					int nu = 0;
					for (int i = 0; i < Me.myWeaponSkillName.length; i++) {
						if (Me.myWeaponSkillName[i] == null) {
							nu += 1;
						}
					}

					if (nu != 10) {
						for (String a : Me.myWeaponSkillName) {
							for (int i = 0; i < Me.myWeaponSkillName.length; i++) {
								if (Me.myWeaponSkillName[i] != null && Me.myWeaponSkillName[i].equals(a)) {
									System.out.printf("%d. %s  ", i, a);
									break;
								}
							}
						}
						System.out.println();
						int j = sn.nextInt();
						int x = random.nextInt();
						if (Me.mp < Me.myWeaponSkill[j].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							if (x == 0) {
								System.out.println("MISS");
							} else {
								sum = Me.myWeaponSkill[j].usingWeaponSkill(j);
							}
						}
					} else {
						int p = 0;
						while (true) {
							if (p == 1)
								break;
							System.out.println("장착한 무기가 없습니다.");
							System.out.println("1.BasicSkill");
							p = sn.nextInt();
						}
						if (Me.mp < Me.myBasicSkill[Me.myJobidx].nmp) {
							System.out.println("마나가 없습니다. 마나 물약을 사용해 주세요");
							P.takePortion();
							System.out.println("전투에서 도망쳤습니다.");
							if (Me.countMpPortion == 0) {
								noportion = true;
							}
						} else {
							sum = Me.myBasicSkill[Me.myJobidx].usingBasicSkill(Me.myJobidx);
						}
					}
				}
				default -> {
					System.out.println();
				}
				}
				System.out.println(Me.name + "데미지는 " + sum + "입니다.");
				return sum;
			} else {
				System.out.println("피로도가 꽉 차서 전투를 진행할 수 없습니다.");
				battleOk = false;
				return 0;
			}
		} else {
			P.takePortion();
			return 0;
		}
	}

	void monster_attacked(Monster M, double s) {
		if (M.Defense >= s)
			M.Hp = M.Hp - 0;
		else
			M.Hp = M.Hp + M.Defense - s;

		if (M.Hp <= 0) {
			System.out.println(M.Name + "가 죽었습니다.");
		}
	}

	double monster_attack(Monster M) {
		System.out.println(M.Name + "의 공격입니다.");
		return M.Power;

	}

	void hero_attacked(Monster M, double s) {
		if (Me.defense >= M.Power) {
			Me.hp = Me.hp - 0;
			System.out.println(M.Name + "가 공격했습니다. 데미지는" + 0 + "입니다.");
		} else {
			Me.hp = Me.hp + Me.defense - M.Power;
			System.out.println(M.Name + "가 공격했습니다. 데미지는" + (Me.defense - M.Power) + "입니다.");
		}
	}

}