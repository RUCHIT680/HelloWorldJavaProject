
public class dre {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int emprate/hr = 20;
	public static final int no_of_working_days = 2;
	
	public static void main(string[] args) {
		int emphrs = 0;
	   int empwage = 0;
	total empwage = 0;
	for (int day = 0; day < no_of_working_days; day++)
	{ 
		
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case PART_TIME:
			emphrs = 4;
			break;
		case PART_TIME:
			emphrs = 8;
			break;
			default:
				emphrs = 0;
		}
		empwage = emphrs * emprate/hr;
				total empwage += empwage;
		
		
		system.out.println("emp wage :" + empwage);
}
	system.out.println("empwage: " + empwage);
	}
		
}uc5. end
		


