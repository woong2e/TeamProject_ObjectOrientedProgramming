package CyberPunkProject;

public class Jobstory {

	public static void main(String[] args) {
		printJobStory();
	}

	public static void printJobStory() {
		String myJobName = Me.myJobName;
		System.out.println(" ");
		System.out.println("게임 설명 :  ");
		System.out.println(" ");
		System.out.println("HP,MP는 포션으로 회복이 가능합니다. ");
		System.out.println("피로도는 포션으로 회복이 불가능합니다. 피로도가 높은 수치라면, 집에서 휴식을 취해야 합니다.");
		System.out.println("신체 한계치는 파츠와 칩 구입 시 마다 증가하며, 최대 한계치에 도달하면 게임에 불이익을 얻게 됩니다. ");
		System.out.println(" ");

		if (myJobName.equals("NetRunner")) {
			System.out.println(" ");
			// System.out.println("넷러너 스토리");
			System.out.println("NetRunner는 상대방의 머리 회로를 해킹하는 방식을 주로 사용하여 전투에 임합니다.");
			System.out.println("NetRunner는 원거리 공격 타입으로, HP가 낮지만 MP와 피로도에 강한 타입입니다.");
			System.out.println(" ");
			System.out.println("**************************************************************");
		} else if (myJobName.equals("Gunner")) {
			System.out.println(" ");
			// System.out.println("건너 스토리");
			System.out.println("Gunner는 능숙히 총을 다루며 주로 총을 사용하여 전투에 임합니다.");
			System.out.println("Gunner는 원거리 공격 타입으로, HP가 낮지만 총을 사용하기에 데미지가 강한 타입입니다.");
			System.out.println(" ");
			System.out.println("**************************************************************");
		} else if (myJobName.equals("Infighter")) {
			System.out.println(" ");
			// System.out.println("인파이터 스토리");
			System.out.println("Infighter는 근접전에 능숙합니다. 신체 능력이 좋아서 사용할 수 있는 파츠가 다양합니다.");
			System.out.println("Infighter는 근거리 공격 타입으로, HP가 높지만 피로도에 약한 타입입니다.");
			System.out.println(" ");
			System.out.println("**************************************************************");
		}
	}
}