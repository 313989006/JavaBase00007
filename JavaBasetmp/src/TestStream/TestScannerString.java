package TestStream;

import java.util.Scanner;

public class TestScannerString
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner("aa:bb:cc:dd");
		in.useDelimiter(":");
		String info =null;
		while (in.hasNext())
		{
			info=in.next();
			System.out.println(info);
			
		}in.close();
	}

}
