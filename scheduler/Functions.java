package scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Functions {
	//SEARCHFUNCTIONS
	public void searchEmployeesInShift() {
		Scheduler schedule = new Scheduler();
		Scanner sc = new Scanner(System.in);
		System.out.println("On which day of the week?");
		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
		int workDay = sc.nextInt();
		System.out.println("In which shift?");
		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
		int workShift = sc.nextInt();

		for (ArrayList<ArrayList<ArrayList<Employee>>> days : schedule.getEmployeesInShifts()) {
			for (ArrayList<ArrayList<Employee>> shifts : days) {
				for (ArrayList<Employee> shiftDate : shifts) {
					for (Employee emp : shiftDate) {
						switch (workDay) {
						case 0:
							switch (workShift) {
							case 0:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 1:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 2:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							}
							break;
						case 1:
							switch (workShift) {
							case 0:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 1:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 2:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							}
							break;
						case 2:
							switch (workShift) {
							case 0:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 1:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 2:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							}
							break;
						case 3:
							switch (workShift) {
							case 0:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 1:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 2:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							}
							break;
						case 4:
							switch (workShift) {
							case 0:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 1:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							case 2:
								System.out.println(emp.toString() + "is working in this shift");
								break;
							}
							break;
						}
					}
				}
			}
		}
	}
	
	public void searchEmployeeById() {
		Scheduler schedule = new Scheduler();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the employee u want to search:");
		int id = sc.nextInt();

		for (ArrayList<ArrayList<Employee>> shifts : schedule.getDays()) {
			for (ArrayList<Employee> shiftDate : shifts) {
				for (int i = 0; i < shiftDate.size(); i++) {
					if (shiftDate.get(i).getId() == id) {
						for (Employee emp : shiftDate) {
							if (schedule.getEarlyMo().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Monday in early shift");
							}
							if (schedule.getLateMo().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Monday in late shift");
							}
							if (schedule.getNightMo().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Monday in night shift");
							}
							if (schedule.getEarlyTu().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in early shift");
							}
							if (schedule.getLateTu().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in late shift");
							}
							if (schedule.getNightTu().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in night shift");
							}
							if (schedule.getEarlyWe().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in early shift");
							}
							if (schedule.getLateWe().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in late shift");
							}
							if (schedule.getNightWe().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in night shift");
							}
							if (schedule.getEarlyTh().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Thursday in early shift");
							}
							if (schedule.getLateTh().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Thursday in late shift");
							}
							if (schedule.getNightTh().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Thursday in night shift");
							}
							if (schedule.getEarlyFr().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Friday in early shift");
							}
							if (schedule.getLateFr().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Friday in late shift");
							}
							if (schedule.getNightFr().contains(emp) && emp.getId() == id) {
								System.out.println(shiftDate.get(i).toString() + "works on Friday in night shift");
							}
						}
					}
				}
			}
		}
	}
	
	public void showEmptyShift() {
		Scheduler schedule = new Scheduler();
		for (ArrayList<ArrayList<Employee>> shift : schedule.getDays()) {
			for (int i = 0; i < shift.size(); i++) {
				// MONDAY
				if (schedule.getEarlyMo().isEmpty() && shift.get(i) == schedule.getEarlyMo()) {
					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Early shift"));
				} else if (schedule.getLateMo().isEmpty() && shift.get(i) == schedule.getLateMo()) {
					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Late shift"));
				} else if (schedule.getNightMo().isEmpty() && shift.get(i) == schedule.getNightMo()) {
					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Night shift"));
				} // TUESDAY
				else if (schedule.getEarlyTu().isEmpty() && shift.get(i) == schedule.getEarlyTu()) {
					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Early shift"));
				} else if (schedule.getLateTu().isEmpty() && shift.get(i) == schedule.getLateTu()) {
					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Late shift"));
				} else if (schedule.getNightTu().isEmpty() && shift.get(i) == schedule.getNightTu()) {
					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Night shift"));
				} // WEDNESDAY
				else if (schedule.getEarlyWe().isEmpty() && shift.get(i) == schedule.getEarlyWe()) {
					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Early shift"));
				} else if (schedule.getLateWe().isEmpty() && shift.get(i) == schedule.getLateWe()) {
					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Late shift"));
				} else if (schedule.getNightWe().isEmpty() && shift.get(i) == schedule.getNightWe()) {
					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Night shift"));
				}
				// THURSDAY
				else if (schedule.getEarlyTh().isEmpty() && shift.get(i) == schedule.getEarlyTh()) {
					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Early shift"));
				} else if (schedule.getLateTh().isEmpty() && shift.get(i) == schedule.getLateTh()) {
					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Late shift"));
				} else if (schedule.getNightTh().isEmpty() && shift.get(i) == schedule.getNightTh()) {
					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Night shift"));
				}
				// FRIDAY
				else if (schedule.getEarlyFr().isEmpty() && shift.get(i) == schedule.getEarlyFr()) {
					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Early shift"));
				} else if (schedule.getLateFr().isEmpty() && shift.get(i) == schedule.getLateFr()) {
					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Late shift"));
				} else if (schedule.getNightFr().isEmpty() && shift.get(i) == schedule.getNightFr()) {
					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Night shift"));
				}
			}
			System.out.println("----------+--------------------+");
		}
	}
	//FUNCTIONS EMPLOYEES
	public void addToShift() {
		Scheduler schedule = new Scheduler();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the employee u want to add to a shift:");
		int id = sc.nextInt();
		System.out.println("On which day of the week should the employee work in the early shift?");
		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
		int workDay = sc.nextInt();
		System.out.println("In which shift should the employee work?");
		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
		int workShift = sc.nextInt();

		for (ArrayList<ArrayList<ArrayList<Employee>>> days : schedule.getEmployeesInShifts()) {
			for (ArrayList<ArrayList<Employee>> shifts : days) {
				for (ArrayList<Employee> shiftDate : shifts) {
					for (Employee emp : schedule.getEmployees()) {
						switch (workDay) {
						case 0:
							switch (workShift) {
							case 0:
								if (!schedule.getEarlyMo().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getEarlyMo().add(emp);
									}
								}
								break;
							case 1:
								if (!schedule.getLateMo().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getLateMo().add(emp);
									}
								}
								break;
							case 2:
								if (!schedule.getNightMo().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getNightMo().add(emp);
									}
								}
								break;
							}
							break;
						case 1:
							switch (workShift) {
							case 0:
								if (!schedule.getEarlyTu().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getEarlyTu().add(emp);
									}
								}
								break;
							case 1:
								if (!schedule.getLateTu().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getLateTu().add(emp);
									}
								}
								break;
							case 2:
								if (!schedule.getNightTu().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getNightTu().add(emp);
									}
								}
								break;
							}
							break;
						case 2:
							switch (workShift) {
							case 0:
								if (!schedule.getEarlyWe().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getEarlyWe().add(emp);
									}
								}
								break;
							case 1:
								if (!schedule.getLateWe().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getLateWe().add(emp);
									}
								}
								break;
							case 2:
								if (!schedule.getNightWe().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getNightWe().add(emp);
									}
								}
								break;
							}
							break;
						case 3:
							switch (workShift) {
							case 0:
								if (!schedule.getEarlyTh().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getEarlyTh().add(emp);
									}
								}
								break;
							case 1:
								if (!schedule.getLateTh().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getLateTh().add(emp);
									}
								}
								break;
							case 2:
								if (!schedule.getNightTh().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getNightTh().add(emp);
									}
								}
								break;
							}
							break;
						case 4:
							switch (workShift) {
							case 0:
								if (!schedule.getEarlyFr().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getEarlyFr().add(emp);
									}
								}
								break;
							case 1:
								if (!schedule.getLateFr().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getLateFr().add(emp);
									}
								}
								break;
							case 2:
								if (!schedule.getNightFr().contains(emp)) {
									if (emp.getId() == id) {
										schedule.getNightFr().add(emp);
									}
								}
								break;
							}
							break;
						}

					}
				}
			}
		}
	}
	
	public void removeEmployeeFromShift() {
		Scheduler schedule = new Scheduler();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID of the employee you want to remove from shift:");
		int id = scanner.nextInt();
		for (ArrayList<ArrayList<Employee>> shifts : schedule.getDays()) {
			for (ArrayList<Employee> shiftDate : shifts) {
				for (Iterator<Employee> itr = shiftDate.iterator(); itr.hasNext();) {
					Employee e = itr.next();
					if (e.getId() == id) {
						itr.remove();
						System.out.println(e.toString() + " has been removed\n");
					}
				}
			}
		}
	}
}
