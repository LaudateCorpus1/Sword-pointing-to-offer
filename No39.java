
public class No39 {

	/**
	 * ����һ�Ŷ������ĸ��ڵ㣬���������ȡ�
	 * �Ӹ��ڵ㵽Ҷ�ڵ����ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·����
	 * �·���ĳ���Ϊ������ȡ�
	 */
	public static void main(String[] args) {

	}
	
	 public int treeDepth(BinaryTreeNode root){ 

		  if(root==null)    return 0; 

		  int left=treeDepth(root.getLchildNode()); 

		  int right=treeDepth(root.getRchildNode()); 

		  return (left>right)?left+1:right+1; 

		 }

}
