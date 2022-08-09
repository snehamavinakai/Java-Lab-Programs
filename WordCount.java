//(14).Program to accept a message from the keyboard and display the no.of words and non alphabetical characters.

import java.util.Scanner;
class WordCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message : ");
		String line = sc.nextLine();
		char ch;

		int wc=0,alph=0,digi=0,spl=0;
		String words[] = line.split("");
		wc = wc + words.length;
		for(int i=0;i<line.length();i++)
		{
			ch = line.charAt(i);

			if(ch >='a' && ch <='z' || ch >='A' && ch <='Z')
            {
            	alph++;
            }
            else if(ch >='0' && ch <='9')
            {
            	digi++;
            }
            else 
            {
            	spl++;
            }
		}
		System.out.println("Number of words = "+wc);
		System.out.println("Number of Alphabet Characters = "+alph);
		System.out.println("Number of Digits = "+digi);
		System.out.println("Number of Special Characters = "+spl);
	}
}