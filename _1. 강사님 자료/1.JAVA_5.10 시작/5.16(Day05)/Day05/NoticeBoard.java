package Day05;

public class NoticeBoard implements Board {
	@Override
	//�������� �Խ��� �Խñ� ��� ��ȸ
	public void getBoardList() {
		System.out.println("�������� �Խ��� �Խñ� ��� ��ȸ");
	}
	
	@Override
	//�������� �Խ��� �Խñ� ���
	public void registBoard() {
		System.out.println("�������� �Խ��� �Խñ� ���");
		System.out.println("�������� �Խñ� ��� �� ���� ÷��");
	}
	
	@Override
	//�������� �Խ��� �Խñ� ����
	public void updateBoard() {
		System.out.println("�������� �Խ��� �Խñ� ����");
		System.out.println("�������� �Խñ� ���� �� ÷������ ����");
	}
	
	@Override
	//�������� �Խ��� �Խñ� ����
	public void deleteBoard() {
		System.out.println("�������� �Խ��� �Խñ� ����");
		System.out.println("�������� �Խñ� ���� �� ÷������ ����");
	}
}
