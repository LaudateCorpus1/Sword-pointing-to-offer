import java.util.Arrays;


public class No44 {

	/**
	 * ���˿����������5���ƣ��ж��ǲ���һ��˳�ӣ�
	 * ����5�����ǲ��������ġ�2~10Ϊ���ֱ���
	 * AΪ1��JΪ11��QΪ12��KΪ13������С�����Կ�����������
	 */
	public static void main(String[] args) {
		int[] array={0,4,6,8,0}; 
		 System.out.println(isContinuous(array));
		
	}

	private static boolean isContinuous(int[] arr) {
		
		if(arr == null || arr.length!= 5)  
            return false;  
		 Arrays.sort(arr); 
		 int numberZero=0; 
		 int numberGap=0;
		 for(int i=0;i<arr.length&&arr[i]==0;i++)
			 numberZero++;
		 
		 int small=numberZero;
		 int big=small+1;
		 while(big<arr.length){
			 if(arr[small]==arr[big])
				 return false;
			 
			 numberGap+=arr[big]-arr[small]-1;
			 small=big;
			 big++;
		 }
		 return (numberGap>numberZero)?false:true;
	}

}
