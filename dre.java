
public class dre {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int emprate/hr = 20;
	public static final int no_of_working_days = 2;
	public static final int max_hrs_in_a_month = 10;
	
	
	public static void main(string[] args) {
		int emphrs = 0, total emphrs = 0, totalworkingdays = 0;
		
	
	while (totalemphrs <= max_hrs_in_a_month && totalworkingdays < no_of_working_days)
	{ totalworkingdays++;
	
		
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
		totalemphrs += emphrs;
				
		
		
		system.out.println("day#:" + totalworkingdays + "emphr: " +emphrs);
}
	int totalempwage = totalemphrs * emprate/hr;
	system.out.println("total emp wage: " + totalempwage);
	}
		
}uc6. end
		


