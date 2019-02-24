/*
 * Nanda Pandian
 * CIS 22C
 */
package createTriangle;

public class createTriangle {
	
	public static void main(String[] args) 
	{
		createTriangle x = new createTriangle();
		x.displayRowOfCharacters("*",10);
	}

	private void displayRowOfCharacters(String val, int num) {
		if(num != 0)
			displayRowOfCharacters(val, num-1);
		for(int i = 0 ; i < num; i++)
		{
			System.out.print(val);
		}
		System.out.println();
	}
}