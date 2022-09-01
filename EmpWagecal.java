package basics;

public class EmpWagecal {
 

    public static void main( String[] args )
    {
    	int fulltime = 1;
    	double empcheck = Math.floor(Math.random() * 10)% 2;
    	if (empcheck == fulltime)
    		System.out.println("Employee is Present");
    	else
    		System.out.println("Employee is Abscent");
      
    }


	
}

