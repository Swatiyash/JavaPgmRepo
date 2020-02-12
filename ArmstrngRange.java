
public class ArmstrngRange 
{

	public static void main(String[] args) 
	{
		
		int res=0;
		
		for(int i=1;i<=1000;i++)
		{
			int temp=i,count=0,temp1=i;
			int num=i;
			
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			System.out.println(i+" Number of digits = " +count);
			
			while(temp1>0)
			{
				int rem=temp1%10;
				res=(int) (res+(Math.pow(rem, count)));
				temp1=temp1/10;
				
			}
			System.out.println(i+" Result "+res);
			
			if(num==res)
			{
		    System.out.println(i+" is armstrng");
		  
			}
			
	
		
		}
		
	}
}


