package binarySearchInRotated;

public class BinarySearchInRotated {
	public static void main(String[] args) {
		
		int[] arr= {4,5,1,2,3};
		int num=2;
		int min=0;
		int max=arr.length-1;
		int y=binarySearch(arr,num,min,max);
		
		System.out.println(y);
		
	}

	private static int binarySearch(int[] arr, int num, int min, int max) {
		// TODO Auto-generated method stub
		int mid=(max+min)/2;
		if(max<min) {
			return -1;
		}
		
		if(arr[mid]==num) {
			return mid;
		}
		if(arr[min]<arr[mid]) {
			
			if(arr[min]<num&&arr[mid]>num) {
				return binarySearch(arr,num, min, mid-1);
			}
			else {
				return binarySearch(arr, num, mid+1, max);
				
				
				
			}
			
			
			
			
		}else {
			
			
			
			
			if(arr[mid]<arr[max]) {
				
				if(arr[mid]<num&&arr[max]>num) {
					
					return binarySearch(arr, num, mid+1, max);
					
					
					
					
				}else {
					return binarySearch(arr, num, min, mid-1);
				}
				
				
				
			}
			
			
		}
		
		
		return 0;
	}

}
