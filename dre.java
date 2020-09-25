
public class dre {public class UC1 {public class empwagebuilderif {
	public static void main(string[] args) {
		int PART_TIME = 1;
		int FULL_TIME = 2;
		int emprate/hr = 20;
		int emphrs = 0;
		int empwage = 0;
		
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == PART_TIME)
			emphrs = 4;
		else if (empcheck == FULL_TIME)
			emphrs = 8;
		else
			emphrs = 0;
		empwage = emphrs * emprate/hr;
		System.out.println("emp wage:" + empwage);
			
					
		
	}
}
UC3.java(end)



