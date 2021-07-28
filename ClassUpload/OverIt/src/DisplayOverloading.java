

	class OverLoad
	{
	    public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	    public void disp(String a)  
	    {
	         System.out.println(a);
	    }
	}
	class Sample
	{
	   public static void main(String args[])
	   {
	       OverLoad obj = new OverLoad();
	       obj.disp('a');
	       obj.disp('a',10);
	       obj.disp("Yeah, I get this overriding thing.");
	   }
	}
