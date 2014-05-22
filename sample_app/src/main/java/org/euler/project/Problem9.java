package org.euler.project;

public class Problem9 
{
	public void calc()
	{
		for(int a=0;a<=1000;a++)
		{
			for(int b=1;b<=1000;b++)
			{
				for(int c=2;c<=1000;c++)
				{
					if(a*a+b*b==c*c && a+b+c==1000 && a<b && b<c)
						System.out.println(a*b*c);
				}
			}
		}
	}
}
