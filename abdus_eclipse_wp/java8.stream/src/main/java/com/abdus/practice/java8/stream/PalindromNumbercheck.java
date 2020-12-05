package com.abdus.practice.java8.stream;

public class PalindromNumbercheck {
public static void main(String[] args) {
	checkPalindrom(12343201);
}

static int checkPalindrom(int num) {
	
	int temp = num;
	int rev = 0;
	while(temp!= 0) {
	int reminder = temp%10;
	 temp = temp/10;
	rev = rev*10 + reminder;
	
	}
	
	if(num == rev)
		System.out.println("palindrom");
	else
		System.out.println("not a palindrom");
	
	return 0;
}

}
