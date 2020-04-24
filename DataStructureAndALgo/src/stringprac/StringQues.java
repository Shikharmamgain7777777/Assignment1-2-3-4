package stringprac;

import java.util.Arrays;
import java.util.HashSet;

public class StringQues {
public static void main(String[] args) {
	
	
	String a="abcd";
	//to reverse a string
	
String b=	StringQues.reverse(a);
System.out.println(b);
String first="abcd";
String second="cbda";


//find a anagram
Boolean ans=anagram(first,second);
System.out.println(ans);
//find  a first not repeating character


String ss="aabbbcscsscmdddmxllv";
char c=nonRepChar(ss);
System.out.println(c);


}

private static char nonRepChar(String ss) {
	
	char ret='0';
	for(int i=0;i<ss.length();i++) {
		char c=ss.charAt(i);
		if((ss.lastIndexOf(c)==i)&&(ss.indexOf(c)==i)) {
			
			System.out.println(c);
			System.out.println(ss.lastIndexOf(c));
			System.out.println(i);
			ret= c;
			break;
		}
		
		
	}
	// TODO Auto-generated method stub
	return ret;
}

private static String reverse(String a) {
	// TODO Auto-generated method stub
 String tem="";
 for(int i=0;i<a.length();i++) {
	 tem=a.charAt(i)+tem;
	 
 }
	return tem;
}


///to check a anagram




public static Boolean anagram(String first2, String second2) {
	// TODO Auto-generated method stub
	if(first2.length()!=second2.length()) {
		System.out.println("yo");
		return false;
	}
	char[] arr=first2.toLowerCase().toCharArray();
	char[] arr2=second2.toLowerCase().toCharArray();
	Arrays.sort(arr);
	Arrays.sort(arr2);
	if(Arrays.equals(arr2,arr)) {
		return true;
	}
	else {
		System.out.println(arr);
		System.out.println(arr2);
	return false;}
}





}
