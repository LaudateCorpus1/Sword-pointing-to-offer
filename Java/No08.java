


public class No08 {
	/**
	 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ��
	 * ���ǳ�֮Ϊ�������ת������һ���������������
	 * ��һ����ת�������ת�������СԪ�ء���������
	 * {3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
	 */
	public static void main(String[] args) {
		int[] arr={3,4,5,1,2};
		System.out.println(findMin(arr));
	}
	public static int findMin(int[] arr){
		int left=0;
		int right=arr.length-1;
		if (arr[right]>arr[left]){
			try {
				throw new Exception("����ת����");
			} catch (Exception e) {	
				e.printStackTrace();
				return -1;
			}
		}
		while(left<right){
			int mid=(left+right)/2;
			//����{1,0,1,1,1}֮������⴦��
			if(arr[mid]==arr[left]&&arr[left]==arr[right]){
				return seachMin(arr,left,right);
			}
			if(right-left==1)
				break;
			if(arr[mid]>=arr[left]){
				left=mid;
			}
			else{
				right=mid;
			}		
		}
		return arr[right];		
	}
	private static int seachMin(int[] arr, int left, int right) {
		int result=arr[left];
		for(int i=left+1;i<=right;++i){
			if(arr[i]<result)
				result=arr[i];
		}
		return result;
	}
	

}
