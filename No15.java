
public class No15 {

	/**
	 * ����һ����������������е�����K����㡣
	 * Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β����ǵ�����1����㡣
	 * ����һ��������6����㣬��ͷ��㿪ʼ���ǵ�ֵ������1,2,3,4,5,6��
	 * �������ĵ�����3�������ֵΪ4�Ľ�㡣
	 * ��ע�����³���ԣ����������ָ�룬��������������k�������k����Ϊ0��
	 */
	public static void main(String[] args) {
			Node15 a=new Node15("1");
			Node15 b=new Node15("2");
			Node15 c=new Node15("3");
			Node15 d=new Node15("4");
			Node15 e=new Node15("5");
			Node15 f=new Node15("6");
			a.setNext(b);b.setNext(c);c.setNext(d);
			d.setNext(e);e.setNext(f);
			
			System.out.print(FindDataFromTail(a,5));
	}

	private static String FindDataFromTail(Node15 a, int k) {
		
		if(a==null)
			return null;
		if(k==0){
			System.out.println("kӦ�ô�1��ʼ");
			return null;
		}
		Node15 Node1=a;
		Node15 Node2=null;
		for(int i=0;i<k-1;i++){
			if(Node1.getNext()==null){
				System.out.println("k��Ӧ�ô���������");
				return null;
			}
			Node1=Node1.getNext();
		}
		Node2=a;
		
		while(Node1.getNext()!=null){
			Node1=Node1.getNext();
			Node2=Node2.getNext();
		}
		return Node2.getData();
		
	}
}
 class Node15{
	private String data;
	private Node15 Next;
	public Node15(String data) {
		super();
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node15 getNext() {
		return Next;
	}
	public void setNext(Node15 next) {
		Next = next;
	}
	
}
