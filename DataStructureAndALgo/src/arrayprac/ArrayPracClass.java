package arrayprac;

import java.util.Arrays;

public class ArrayPracClass {
public static void main(String[] args) {
	
	int[] arr=new int[] {2,5,2,10,1,4,10,3,10};
	System.out.println(Arrays.toString(arr));
	int rot=8;
	
	//rotation algo for array rotation
	int[] brr=rotate(arr,rot,arr.length);
	System.out.println(Arrays.toString(brr));
	
	
	
	//subset sum prob
	int num=18;
	findSubSetSub(arr,num);
	
	
	//sum of the diagnols
	
	
	int[][] array={ { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 },  
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 } };
	printDiagnolArray(array,4);
	
	
	///second largest elemnt in an array
	//we can also do this by Arrays.sort() also if number are unique
   secondLargestEl(arr);
	
	
}

private static void secondLargestEl(int[] arr) {
	// TODO Auto-generated method stub
	int first=-100;
	int second=-100;


	for(int i=0;i<arr.length;i++) {
		
		
		if(arr[i]>first) {
			second=first;
			first=arr[i];
			
		}
		else if (arr[i]<first&&arr[i]>second) {
			second=arr[i];
		}
	}
	System.out.println("second highest"+second);
	
	
}

private static void printDiagnolArray(int[][] array,int length) {
	int sum1=0,sum2=0;
	// TODO Auto-generated method stub
	for(int i=0;i<4;i++) {
		
		sum1=sum1+array[i][i];
		sum2=sum2+array[i][length-1-i];
		
		
		
	}
	System.out.println("diag 1="+sum1);
	System.out.println("diag 2="+sum2);
	
}

private static void findSubSetSub(int[] arr,int num) {
	System.out.println("arr"+Arrays.toString(arr));
	outerloop:
	for(int i=0;i<arr.length;i++) {
		int sum=0,j=i+1;
		sum=sum+arr[i];
		while(sum<=num&&j<arr.length) {
			sum=sum+arr[j];
			/*System.out.println("j="+j);
			
			System.out.println("i="+i);System.out.println(sum);*/
			if(sum==num) {
				System.out.println("start=="+i);
				System.out.println("end"+j);
				break outerloop;
			}
			if(arr[j]>num) {
				i=j;
				break;
			}
			j++;
		}
		
		
	}
	// TODO Auto-generated method stub
	
}

private static int[] rotate(int[] arr, int rot,int length) {
	int[] brr=new int[length];

	// TODO Auto-generated method stub
for(int i=0;i<length;i++) {
	int v=(i+length-rot%length)%length;System.out.println(v);
		brr[v]=arr[i];
	}
	return brr;
}
}
