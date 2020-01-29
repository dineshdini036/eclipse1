package git;

public class Prime {

		 public boolean IsPrime(int n)
		  {
		 int c=2;
		 for(int i=2;i<n/2;i++)
		 {
		 if(n%i==0)
		 c++;
		 }
		 if(c==2)
		 return true;
		 else
		 return false;
		  }

	}


