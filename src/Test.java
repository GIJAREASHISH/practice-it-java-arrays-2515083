import java.util.Arrays;

public class Test {
	
		public static Integer[] bubbleSort(Integer[] arr){
			
			int temp=0;
			for(int i=0;i<=arr.length-1;i++) {
				
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					}
				}
				
			}
			
			return arr;
		 }
	

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{ 5, 8, 3, 2, 6 };
		bubbleSort(arr);
	
		System.out.println(Arrays.toString(arr));
	
	}

}