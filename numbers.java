// Dhundi Acharya


public class numbers 
{

	public static void main(String []args)
	{
		System.out.println(convertToNames(87));		
	}
	
	
	static String convertToNames(int number)
	{
		String name = null;
	    
	    if (number == 0) { return "zero"; }
	    if (number == 100) { return "one hundred"; }
	    
	    if(number<0 || number>100) 
	    {
	    	name = "Number have to be between 0 and 100";
	    }
	    
	    if(number<10)
	    {
	    	return names[number];
	    	
	    }
	    
	    if(number>10 && number<20)
	    {
	    	number = number%10;
	    	return specialNames[number];
	    	
	    }
	    
	    if(number>20 && number <100)
	    {
	    	name = names[number % 10];
	        number = number/10;
	        
	    	return tensNames[number]  + "-" + name;	
	    }
	    
	    if(number<100 && number>0)
	    {
	    	number = number/10;
	    	return tensNames[number];
	    }
		return name;	
	}
	
	
	 private static final String[] names = 
	 {
		 "",
		 "one",
		 "two",
		 "three",
		 "four",
		 "five",
		 "six",
		 "seven",
		 "eight",
		 "nine",	  
	  };
	 
	private static final String[] tensNames =
	 {
		"",
	    "ten",
	    "twenty",
	    "thirty",
	    "forty",
	    "fifty",
	    "sixty",
	    "seventy",
	    "eighty",
	    "ninety"	
	};
	  
	    
    private static final String[] specialNames = 
     {
   	    " ",
   	    "eleven",
   	    "twelve",
   	    "thirteen",
   	    "fourteen",
   	    "fifteen",
   	    "sixteen",
   	    "seventeen",
   	    "eighteen",
   	    "nineteen"   	 
     };
	
}
