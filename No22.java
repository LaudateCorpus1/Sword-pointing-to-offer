import java.util.Stack;


public class No22 {

	/**
	 * .���������������У���һ�����б�ʾջ��ѹ��˳��
	 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	 * ����ѹ��ջ���������־�����ȡ���������1��2��3��4��5��ĳջ
	 * ��ѹջ���У�����4��5��3��2��1�Ǹ�ѹջ���ж�Ӧ��һ����������
	 * ��4��3��5��1��2�Ͳ������Ǹ�ѹջ���еĵ�������
	 */
	public static void main(String[] args) {
		Integer[] pushOrder={1,2,3,4,5};
		Integer[] popOrder={4,5,3,2,1};
		isRight(pushOrder,popOrder,5);
	}

	private static boolean isRight(Integer[] pushOrder, Integer[] popOrder, int n) {
			boolean isRight=false;
			Stack<Integer> stack=new Stack<Integer>();
			for(int i=0;i<popOrder.length;i++){
				
			}
			return isRight;
		
	}

}
