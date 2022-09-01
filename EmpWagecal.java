package basics;

public class EmpWagecal {
 

    public static void main( String[] args ){
		int empRatePH = 20;
    	int empHrs = 0;
    	int empWage = 0;
    	int totalempWage = 0;
    	for(int day=0; day<=20; day++) {
    	int empcheck = (int) Math.floor(Math.random() * 10)% 3;
    	switch (empcheck) {
    	case 1:
    		empHrs = 4;
    		break;
    	case 2:
    		empHrs = 8;
    		break;
    	default:
    		empHrs = 0;
    	}
    	
    	
    	empWage = empHrs*empRatePH;
    	totalempWage += empWage;
   
    	System.out.println("Employee Wage:" + empWage);
    }
    System.out.println("Toatl Employee Wage: "+ totalempWage);
          

      
    }


	
}

