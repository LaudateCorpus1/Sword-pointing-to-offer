
public class No32 {

	/**
	 * ����һ������n�����1��n��n��������ʮ���Ʊ�ʾ��1���ֵĴ�����
	 * ��������12����1��12��Щ�����а���1��������1,10,11��12,1һ������5�Ρ�
	 */
	public static void main(String[] args) {
		System.out.println(countOne(115));
		
	}

	private static long countOne(int n) {
		long count =0;
		long i=1;
		long current=0,after=0,before=0;
		while((n/i)!=0){
			current=(n/i)%10;
			before=n/(i*10);
			after=n-(n/i)*i;
			
			if(current>1)
				count=count+(before+1)*i;
			else if(current==0)
				count=count+before*i;
			else if(current==1)
				count=count+before*i+after+1;			
			i=i*10;						
		}
		return count;
	}

}
