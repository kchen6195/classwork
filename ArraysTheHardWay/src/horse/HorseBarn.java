package horse;

public class HorseBarn {
	private Horse[] spaces;
	public HorseBarn(Horse[] Horses)
	{
		this.spaces = Horses;
	}
	
	public int findHorseSpace(String name)
	{
		for(int i = 0; i <this.spaces.length;i++)
		{
			
			if(this.spaces[i]!= null && name.equals(this.spaces[i].getName()))
			{
				return i;
			}
			
		}
		return -1;
	}
	public void consolidate()
	{
		for(int i = 0; i<this.spaces.length-1;i++)
		{
			if(this.spaces[i]== null)
			{
				for(int x = i+1; x<this.spaces.length;x++)
				{
					if(this.spaces[x]!= null)
					{
						this.spaces[i]= this.spaces[x];
						this.spaces[x] = null;
						x = this.spaces.length;
					}
				}
			}
			
		}
	}
	public void print()
	{
		
		
		for(int i = 0; i < this.spaces.length;i++)
		{
			if(this.spaces[i]!= null)
				System.out.print(" [ "+ this.spaces[i].getName()+" ]");
			else
				System.out.print(" [ null ] ");
		}
		System.out.println(" ");
	}
}
