
public class No12 {

	/**
	 * ��������n����˳���ӡ����1����nλʮ��������
	 * ��������3�����ӡ��1��2��3һֱ������3λ����999 
	 */
	public static void main(String[] args) {
		printNum(3);
	}

	private static void printNum(int n) {
		if(n<0)
			return;
		int[] array=new int[n];
		printArray(array,0);
	}

	private static void printArray(int[] array, int n) {
		
		if(n!=array.length){
			for(int i=0;i<10;i++){
				array[n]=i;
				printArray(array, n+1);		
			}
		}
		else{
			boolean flag=false;
			for(int j=0;j<array.length;j++){
				if(array[j]!=0){
					flag=true;
				}
				if(flag){
					System.out.print(array[j]);
				}
			}
			if(flag)    //ȥ���հ���
			System.out.println();
		}
		
	}

}
