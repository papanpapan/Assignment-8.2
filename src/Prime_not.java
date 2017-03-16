
public class Prime_not implements Runnable {
	 public void run()
	    {
	        int n;
	        for(n=1;n<=1000;n++)
	        {
	            int sum=0;
	            for(int a=1;a<=n/2;a++)
	            {
	                if(n%a==0)
	                    sum=sum+a;
	            }
	            if(n==sum)
	                System.out.println(n+" Number is perfect or Not Prime");
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	        
	    }
	}

	class Prime implements Runnable
	{
	    public void run()
	    {
	        int n;
	        for(n=2;n<=1000;n++)
	        {
	            int c=0;
	            for(int a=2;a<=n/2;a++)
	                if(n%a==0)
	                {
	                    c++;
	                    break;
	                }
	            if(c==0)
	                System.out.println(n+" Number is prime");
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	    }
	}


	class PerfectPrime
	{
	    public static void main(String args[])
	    {
	        try
	        {
	            Prime_not p=new Prime_not();
	            Thread t1=new Thread(p);
	            Prime p1=new Prime();
	            Thread t2=new Thread(p1);
	            t1.start();
	            t2.start();
	        }
	        catch(Exception e1){}
	    }
	}

