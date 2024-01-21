
public enum DayOfWeek {
	
	MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(5),SATURDAY(7),SUNDAY(1);

	private int day;
	
	 DayOfWeek(int x) { day = x ; }
	 int getDay() { return day ; }
	
}
