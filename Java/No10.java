
public class No10 {

	/**
	 * ��ʵ��һ������������һ��������
	 * ����ö����Ʊ�ʾ��1�ĸ�����
	 * �����9��ʾ�ɶ�������1001�� ��2λ��1��
	 * ����������9���ú������2��
	 */
	public static void main(String[] args) {
		System.out.println(getNum(9));

	}
	public static int getNum(int n) {
		int num=0;
		while(n!=0){
			num++;
			n=(n-1)&n;
		}
		return num;
			
	}

}
