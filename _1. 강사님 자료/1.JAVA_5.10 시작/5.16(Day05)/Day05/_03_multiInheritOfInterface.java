package Day05;

public class _03_multiInheritOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 객체 생성
		//다중 상속 시 하나의 객체로 여러 개의 기능 사용가능
		FreeBoard freeBoard = new FreeBoard();
		
		//자유게시판 객체의 게시판 기능 사용
		Board board = freeBoard;
		board.registBoard();
		board.updateBoard();
		board.deleteBoard();
		board.getBoardList();
		System.out.println("-----------------------------\n");
		
		//자유게시판 객체의 답글 기능 사용
		Reply reply = freeBoard;
		reply.registReply();
		reply.updateReply();
		reply.deleteReply();
		reply.getReplyList();
	}

}
