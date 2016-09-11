import java.util.*;
import java.lang.*;
import java.io.*;
class hunt28
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
		String str=s.next();
		String upd="";
		for(int i=0;i<str.length();i++)
		{
			boolean flag=true;
			for(int j=0;j<upd.length();j++)
			{
			if(str.charAt(i)==upd.charAt(j))
			{
				flag=false;
			}
			}
			if(flag)
			{
				upd=upd+str.charAt(i);
			}
		}
System.out.println(upd);
	}
}
