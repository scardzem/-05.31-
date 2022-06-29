package Day05;

public class _01_useOfInterface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 사용하는 클래스
		Board board = new FreeBoard();
		
		board.getBoardList();
		board.registBoard();
		board.updateBoard();
		board.deleteBoard();
	}

}
