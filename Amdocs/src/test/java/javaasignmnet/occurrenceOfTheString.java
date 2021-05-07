package javaasignmnet;

public class occurrenceOfTheString {

	public static void main(String[] args) 
	{
		String s = "man is a good man, but he is not a good man.";
		s=s.toLowerCase().replace(",", "").replace(".", "");
		String [] str = s.split(" ");
		for(int i=0; i<str.length;i++)
		{
			String first =str[i];
			int count=0;
			for(int j=0; j<str.length;j++)
			{
				String second=str[j];
				if(first.equals(second)&& i>j)
				{
					break;
				}
				if(first.equals(second))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(first + " present "+ count + " times.");
			}
		}

	}

}
