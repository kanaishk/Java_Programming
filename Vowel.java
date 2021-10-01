import java.util.Scanner;

public class Vowel
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=input.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			switch(str.charAt(i))
			{
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u': 	System.out.println(str.charAt(i)+" is a vowel");
							break;
				default:	if(str.charAt(i)<'A' || str.charAt(i)>'Z' && str.charAt(i)<'a' || str.charAt(i)>'z')
							{
								System.out.println("");
								break;
							}
							System.out.println(str.charAt(i)+" is a consonant");
			}
		}
	}	
}