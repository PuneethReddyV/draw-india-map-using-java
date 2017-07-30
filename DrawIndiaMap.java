package com.hpe.itio.automation;

public class Test {
public static void main(String[] args) {
	int a = 10, b = 0, c = 10;
	String str = "TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq "+
				"TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBL"+
				"OFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm "+
				"SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
	try{
	while (a != 0)
	{
	a = str.charAt(b++);
		while (a-- > 64)
		{
			if (++c == 90)
			{
				c = 10;	 
				System.out.println();
			}
			else
			{
				if (b % 2 == 0)
					System.out.print('!');
				else
					System.out.print(' ');
			}
		}
	}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
