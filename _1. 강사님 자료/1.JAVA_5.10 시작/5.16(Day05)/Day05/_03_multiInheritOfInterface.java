package Day05;

public class _03_multiInheritOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Խ��� ��ü ����
		//���� ��� �� �ϳ��� ��ü�� ���� ���� ��� ��밡��
		FreeBoard freeBoard = new FreeBoard();
		
		//�����Խ��� ��ü�� �Խ��� ��� ���
		Board board = freeBoard;
		board.registBoard();
		board.updateBoard();
		board.deleteBoard();
		board.getBoardList();
		System.out.println("-----------------------------\n");
		
		//�����Խ��� ��ü�� ��� ��� ���
		Reply reply = freeBoard;
		reply.registReply();
		reply.updateReply();
		reply.deleteReply();
		reply.getReplyList();
	}

}
