
 /** 
 * ��Ŀ������n�����������������С��k���� 
 * ��������1��2��3��4��5��6��7��8��8�����֣�����С��4������Ϊ1��2��3��4�� 
 * �������򵥵�˼·Ī���ڰ������n��������������������ǰ���k����������С��k������ֻ������˼·��ʱ�临�Ӷ�ΪO(nlogn)�� 
 * ��Ŀ��û��Ҫ��Ҫ���ҵ�k������������n-k����������ģ���Ȼ��ˣ������ֺαض����е�n����������������? 
       ��ʱ�������뵽����ѡ���������򣬼�����n�������Ȱ����ȱ�������k���������СΪk������֮�У�����k���������������ҵ�k�����е������kmax�� 
  k1<k2,K3<��<kmax��kmax��Ϊk��Ԫ�ص����������Ԫ�أ�����ʱO��k�������ټ���������n-k������x��kmax�Ƚϣ����x<kmax����x����kmax�����ٴ�����k��Ԫ�ص����顣���x>kmax���򲻸������顣 
       ������ÿ�θ��»򲻸�����������õ�ʱ��ΪO��k����O��0���������������ܵ�ʱ�临�Ӷ�ƽ������Ϊ��n*O��k��=O��n*k���� 
3��  ��Ȼ�����õİ취��ά��k��Ԫ�ص����ѣ�ԭ����������3������һ�£���������Ϊk�����Ѵ洢��С��k��������ʱ��k1<k2<...<kmax��kmax��Ϊ�󶥶������Ԫ�أ��� 
����һ�����У�n��ÿ�α���һ��Ԫ��x����Ѷ�Ԫ�رȽϣ�x<kmax�����¶ѣ���ʱlogk�������򲻸��¶ѡ������������ܷ�ʱO��n*logk�����˷����������ڶ��У����ҵȸ������ʱ�临�ӶȾ�Ϊlogk����Ȼ����������˼·2������ֱ��������Ҳ�����ҳ�ǰk��С��Ԫ�أ���ʱO��n*k������ 
 */  
public class No30 {  
  
    /** 
     *  
     * @param krr 
     * @param k 
     * @return 
     */  
    public static int[] minK(int krr[],int k){  
        int arr[] = new int[k];  
        for(int i = 0;i<k;i++)  
            arr[i] = krr[i];  
        buildHeap(arr);  
        for(int j = k;j<krr.length;j++){  
            if(krr[j]<arr[0]){  
                arr[0] = krr[j];  
                maxHeap(arr,1,k);  
            }  
        }  
        return arr;  
    }  
    /** 
     * ������ 
     * @param arr 
     */  
    public static void buildHeap(int arr[]){  
        int heapsize = arr.length;  
        for(int i=arr.length/2;i>0;i--)  
            maxHeap(arr,i,heapsize);  
    }  
    /** 
     * ����Ϊ���� 
     * @param arr 
     * @param i 
     * @param heapsize 
     */  
    public static void maxHeap(int arr[],int i,int heapsize){  
        int largest = i;  
        int left = 2*i;  
        int right = 2*i+1;  
        if(left<=heapsize&&arr[i-1]<arr[left-1])  
            largest = left;  
        if(right<=heapsize&&arr[largest-1]<arr[right-1])  
            largest = right;  
        if(largest!=i){  
            int temp = arr[i-1];  
            arr[i-1] = arr[largest-1];  
            arr[largest-1] = temp;  
            maxHeap(arr,largest,heapsize);  
        }  
    }  
    public static void main(String[] args) {  
        int krr[] = {1,3,4,2,7,8,9,10,14,16};  
        int arr[] = minK(krr,4);  
        for(int i =0;i<arr.length;i++)  
            System.out.println(arr[i]);  
  
    }  
  
} 