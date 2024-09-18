package practice_prev;

public class remove_duplicate {

	static int remove_Dup(int arr[]) {
		if(arr.length==0)
			return 0;
		int j=0;//pointer
		for(int i=0;i<arr.length;i++) {
			while(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		return j+1;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,4,5,6,7};
		int length=remove_Dup(arr);
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}
