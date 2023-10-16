package CyberPunkProject;

public class TextRectangle {
	public static void main(String[] args) {
		int width = 55; // 사각형의 가로 길이
		int height = 10; // 사각형의 세로 길이

		String line1 = "돈으로 무엇이든 해결이 가능한 시대가 왔다.";
		String line2 = "억울한 소시민들이여, 기업의 횡포에 맞서라.";
		String line3 = "굴복하면 짓밟히고,";
		String line4 = "자본주의 사회의 하수구 인생을 살게 된다!";
		String line5 = "강한 자는 사이버 펑크에 합류해라.";
		String line6 = "파도에 몸을 맡겨라!";

		// 윗면 출력
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println();

		// 텍스트 출력
		printCenteredText(line1, width);
		printCenteredText(line2, width);
		printCenteredText(line3, width);
		printCenteredText(line4, width);
		printCenteredText(line5, width);
		printCenteredText(line6, width);

		// 아랫면 출력
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
	}

	private static void printCenteredText(String text, int width) {
		int padding = (width - text.length()) / 2;
		String paddedText = " ".repeat(padding) + text + " ".repeat(padding);
		System.out.println(paddedText);
	}
}