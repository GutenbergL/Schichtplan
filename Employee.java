import java.util.ArrayList;

public class Employee {

	private String name;
	private String day;
	private double date;
	private double time;
	Shift shifts;

	public Employee(String name, String day, double date, double time, Shift shifts) {
		this.name = name;
		this.day = day;
		this.date = date;
		this.time = time;
		this.shifts = shifts;
	}

	public String getName() {
		return name;
	}

	public String getDay() {
		return day;
	}

	public double getDate() {
		return date;
	}

	public double getTime() {
		return time;
	}

	public Shift getShifts() {
		return shifts;
	}

//	Wollte hier nur was austesten
	Employee [] employees = new Employee[5];
}
