package Day05;

public interface Board {
	//상수 필드
	public int BOARD_COUNT = 10;
	
	//게시글 목록 조회
	public void getBoardList();
	
	//게시글 등록
	public void registBoard();
	
	//게시글 수정
	public void updateBoard();
	
	//게시글 삭제
	public void deleteBoard();
}
