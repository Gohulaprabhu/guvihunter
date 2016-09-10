import java.util.*;
import java.lang.*;
class hunt35
{
	public static void main (String[] args) 
	{
	Scanner s=new Scanner(System.in);
	char[] a=s.next().toCharArray();
	boolean flag=true;
	for(int i=0,j=a.length/2 ; i<a.length/2||j<a.length;i++,j++)
	 { if(a[i]!=a[j])
	  	{flag=false;
	    	break;}
	    else
		   continue;
  }
  	if(flag)
  	System.out.println("double");
  	else
  	System.out.println("Not double");
}
}
