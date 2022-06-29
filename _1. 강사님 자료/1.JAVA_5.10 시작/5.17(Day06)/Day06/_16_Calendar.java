package Day06;

import java.util.Calendar;

public class _16_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		//�⵵ ���� ����
		int year = now.get(Calendar.YEAR);
		//�� ���� ����(0 ~ 11���� ����)
		int month = now.get(Calendar.MONTH) + 1;
		//�� ���� ����
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		//���� ���� ����(0: �Ͽ��� ~ 6: �����)
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		String strWeekDay = "";
		
		//������ �������� ���ڿ��� ��ȯ
		switch(weekDay) {
			case Calendar.MONDAY:
				strWeekDay = "��";
				break;
			case Calendar.TUESDAY:
				strWeekDay = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeekDay = "��";
				break;
			case Calendar.THURSDAY:
				strWeekDay = "��";
				break;
			case Calendar.FRIDAY:
				strWeekDay = "��";
				break;
			case Calendar.SATURDAY:
				strWeekDay = "��";
				break;
			default:
				strWeekDay = "��";
		}
		
		//����, ���� ���� ����
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		//�ð� ���� ����(0~11�ñ��� ����)
		//HOUR_OF_DAY : 0~23�� ���� ����
		int hour = now.get(Calendar.HOUR);
		if(hour == 0) {
			hour = 12;
		}
		//�� ���� ����
		int minute = now.get(Calendar.MINUTE);
		//�� ���� ����
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "�� " + month + "�� " + day + "��");
		System.out.println(strWeekDay + "���� " + strAmPm);
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
	}

}
