package basics;

public class EmpWagecal {
 

    public static void main( String[] args )
    {
 	int fulltime = 1;
    	int empRatePH = 20;
    	int empHrs = 0;
    	int empWage = 0;
    	double empcheck = Math.floor(Math.random() * 10)% 2;
    	if (empcheck == fulltime)
    		empHrs = 8;
    	else
    		empHrs = 0;
    	empWage = empHrs*empRatePH;	
    	
    		System.out.println("Employee Wage:" + empWage);
      
    }


	
}

