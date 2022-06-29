package Day02;

public class _17_middle03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. 20개 배열을 선언하세요
    		 20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
    		 먼저 인덱스의 홀수번째는 앞에서부터 출력하고
    		 짝수번째는 뒤에서부터 출력하세요*/
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
		}
		
		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.println(nums[j]);
			} else {
				System.out.println(nums[nums.length - 1 - j]);
			}
		}
	}

}
