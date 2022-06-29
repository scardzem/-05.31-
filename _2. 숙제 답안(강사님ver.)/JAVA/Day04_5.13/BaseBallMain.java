package Day04;

public class BaseBallMain {
	public static int[] randomNum = new int[3];
	public static void main(String[] args) {
		BaseBallMenu menu = new BaseBallMenu();
		GeneratorThreeNum gen = new GeneratorThreeNum();
		int chkGame = 3; // 3 : 첫 게임 입장
		
		while(true) {
			if(chkGame == 3 || chkGame == 1)
				randomNum = gen.generateThreeNum();
			
			chkGame = menu.menu(randomNum);
			
			if(chkGame == 2)
				break;
		}
	}
}
