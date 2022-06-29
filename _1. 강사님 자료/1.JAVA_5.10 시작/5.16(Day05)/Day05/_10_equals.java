package Day05;

public class _10_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreeBoard fBoard1 = new FreeBoard();
		FreeBoard fBoard2 = fBoard1;
		
		//다른 두 객체 생성 시에는 다른 객체로 인식
		//FreeBoard fBoard2 = new FreeBoard();
		
		boolean classChk = fBoard1.equals(fBoard2);
		boolean classChk2 = fBoard1 == fBoard2;
		
		if(classChk2) {
			System.out.println("fBoard1과 fBoard2는 같은 객체입니다.");
		} else {
			System.out.println("fBoard1과 fBoard2는 다른 객체입니다.");
		}
	}

}
