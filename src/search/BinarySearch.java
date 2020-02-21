package search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9};
		doBinarySearch(a,1);
	}

	private static void doBinarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int start=0;
		int end=a.length-1;
		int mid=(start+end)/2;
		int flag=0;
		
		while(start<=end) {
			System.out.println("start "+start+" mid "+mid+" end "+end);
			if(a[mid]==key) {
				System.out.println("key found");
				flag=1;
				break;
			}else if(a[mid]>key) {
				start=mid;
				mid=(start+end)/2;
				
			}else {
				end=mid;
				mid=(start+end)/2;
			}
		}
		if(flag==0) {
			System.out.println("key not found");
		}
	}

}
