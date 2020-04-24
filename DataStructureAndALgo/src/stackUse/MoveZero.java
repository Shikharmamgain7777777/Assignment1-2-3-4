package stackUse;

import java.util.Arrays;

public class MoveZero {
public static void main(String[] args) {
	int arr[]= {1,0,0,3,4,5,0};
	int j=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=0) {
			arr[j]=arr[i];
			j++;
		}
	}
	for(int i=j;i<arr.length;i++) {
		arr[i]=0;
	}System.out.println(Arrays.toString(arr));
}
}
