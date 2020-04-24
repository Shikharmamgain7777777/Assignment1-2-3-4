package arrayprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
public static void main(String[] args) {
	int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	        List<Integer> l = new ArrayList<>();
	     
	     int row1=0,row2=arr.length-1,col1=0,col2=arr.length-1;
	        while (row1<=row2&&col1<=col2) {
	            for (int i=col1;i<=col2;i++) 
	            	l.add(arr[row1][i]);
	            for (int j=row1 + 1;j<=row2;j++) 
	            	l.add(arr[j][col2]);
	            if (row1<row2&&col1<col2) {
	                for (int c=col2-1;c>col1;c--)
	                	l.add(arr[row2][c]);
	                for (int r=row2;r>row1;r--) 
	                	l.add(arr[r][col1]);
	            }
	            row1++;
	            row2--;
	            col1++;
	            col2--;
	        }
System.out.println(l);	   
}
}
