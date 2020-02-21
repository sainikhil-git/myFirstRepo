package sorting;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
		
		getBubbleSorted(a);

	}

	private static void getBubbleSorted(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					for(int k=0;k<a.length;k++)
						System.out.print(a[k]);
				}
				System.out.println("\n");
			}
		}
		System.out.println(a);
	}

}
