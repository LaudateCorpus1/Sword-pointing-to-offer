
public class No09_2 {

	/**
	 * .һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
	 * �����������һ��n��̨���ܹ��ж���������
	 */
	public static void main(String[] args) {
			System.out.println(getMethodNumber(10));
	}

	private static int getMethodNumber(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		return getMethodNumber(n-1)+getMethodNumber(n-2);
	}

}
