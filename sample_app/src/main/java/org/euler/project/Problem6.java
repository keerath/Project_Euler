package org.euler.project;

public class Problem6 
{
	long sumofsq=0;
	int sum=0;
	public long calc()
	{
		for(int i=1;i<=100;i++)
		{
			sumofsq+=i*i;
			sum+=i;
		}
		return ((sum*sum)-sumofsq);
	}
}
