package javaasignmnet;

public class lengthOfTheString {

	public static void main(String[] args) {
		String s = "hello all good morning";
		String [] str = s.split("");
		int count=0;
		for(String s1:str)
		{
			count++;
		}
		System.out.println("Length of string:- " + count);
	}

}
