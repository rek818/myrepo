package assignments;

public class ParentEncaps {
	private long validpins[]= {1001, 1234, 1212};
	private long pin;
	
	public void setPins(long pin) {
		this.pin=pin;
		
		
	}
	public long getPins()
	{
		return pin;
	}
	public boolean isValidPin()
	{
		int i=0;
		int count=0;
		int len=validpins.length;
		for (i=0;i<len;i++)
		{
		if (validpins[i]==pin)
		{
			
		count++;
		}
		
			
	}
		if (count!=0)
			return true;
		else
			return false;
		
}
}

	
	


