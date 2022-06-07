package scheduler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Scheduler {

	public static void main(String[] args) {
		Functions function = new Functions();
		Table table = new Table();
		Scheduler schedule = new Scheduler();

		Employee e1 = new Employee("Sandra Bullock");
		Employee e2 = new Employee("Thomas Jeffrey");
		Employee e3 = new Employee("Will Sanders");
		Employee e4 = new Employee("Schmidt Friedrich");
		Employee e5 = new Employee("Peter Eernst");
		Employee e6 = new Employee("Dieter Winfried");
		schedule.getEmployees().add(e1);
		schedule.getEmployees().add(e2);
		schedule.getEmployees().add(e3);
		schedule.getEmployees().add(e4);
		schedule.getEmployees().add(e5);
		schedule.getEmployees().add(e6);

		int breakP = 1;
		System.out.println("Press 1 to start");
		Scanner sc = new Scanner(System.in);
		char startProgramm = sc.next().charAt(0);

		do {
			if (startProgramm == '1') {
				System.out.println("What do you want to do?");
				System.out.println(
						"%-5s| Manage Shifts%n%-5s| Manage Employees%n%-5s| Searchfunction".formatted("1", "2", "3"));
				char inputMainMenu = sc.next().charAt(0);
				switch (inputMainMenu) {
				case '1':
					System.out.println(
							"Insert employee in a shift\t\t|1\nRemove employee from shift\t\t|2\nShow employees in current shifts\t|3\n");
					int shiftMenu = sc.nextInt();
					switch (shiftMenu) {
					case 1:
						function.addToShift();
						break;
					case 2:
						function.removeEmployeeFromShift();
						break;
					case 3:
						table.showEmployeesInShift();
						break;
					}
					break;
				case '2':
					System.out.println(String.format("%-5s| Add new employee", "1"));
					System.out.println(String.format("%-5s| Remove employee", "2"));
					System.out.println(String.format("%-5s| Show current employees", "3"));
					int employeeMenu = sc.nextInt();
					switch (employeeMenu) {
					case 1:
						schedule.addNewEmployee();
						break;
					case 2:
						schedule.removeEmployee();
						break;
					case 3:
						schedule.showCurrentEmployees();
						break;
					}
					break;
				case '3':
					System.out.println("What are you looking for?");
					System.out.println(String.format("%-5s| Search for empty Shift", "1"));
					System.out.println(String.format("%-5s| Search employees in a shift", "2"));
					System.out.println(String.format("%-5s| Search for employee by ID", "3"));
					int searchMenu = sc.nextInt();
					switch (searchMenu) {
					case 1:
						function.showEmptyShift();
						break;
					case 2:
						function.searchEmployeesInShift();
						break;
					case 3:
						function.searchEmployeeById();
					}
					break;
				default:
					System.out.println("Invalid Entry");
				}
			} else {
				System.out.println("Have a good day!");
				breakP++;
			}
		} while (breakP <= 1);
		sc.close();
	}
	

	private ArrayList<Employee> employees = new ArrayList<>();

	private ArrayList<Employee> earlyMo = new ArrayList<>();
	private ArrayList<Employee> lateMo = new ArrayList<>();
	private ArrayList<Employee> nightMo = new ArrayList<>();

	private ArrayList<Employee> earlyTu = new ArrayList<>();
	private ArrayList<Employee> lateTu = new ArrayList<>();
	private ArrayList<Employee> nightTu = new ArrayList<>();

	private ArrayList<Employee> earlyWe = new ArrayList<>();
	private ArrayList<Employee> lateWe = new ArrayList<>();
	private ArrayList<Employee> nightWe = new ArrayList<>();

	private ArrayList<Employee> earlyTh = new ArrayList<>();
	private ArrayList<Employee> lateTh = new ArrayList<>();
	private ArrayList<Employee> nightTh = new ArrayList<>();

	private ArrayList<Employee> earlyFr = new ArrayList<>();
	private ArrayList<Employee> lateFr = new ArrayList<>();
	private ArrayList<Employee> nightFr = new ArrayList<>();

	private ArrayList<ArrayList<Employee>> monday = new ArrayList<>(Arrays.asList(earlyMo, lateMo, nightMo));
	private ArrayList<ArrayList<Employee>> tuesday = new ArrayList<>(Arrays.asList(earlyTu, lateTu, nightTu));
	private ArrayList<ArrayList<Employee>> wednesday = new ArrayList<>(Arrays.asList(earlyWe, lateWe, nightWe));
	private ArrayList<ArrayList<Employee>> thursday = new ArrayList<>(Arrays.asList(earlyTh, lateTh, nightTh));
	private ArrayList<ArrayList<Employee>> friday = new ArrayList<>(Arrays.asList(earlyFr, lateFr, nightFr));

	private ArrayList<ArrayList<ArrayList<Employee>>> days = new ArrayList<>(
			Arrays.asList(monday, tuesday, wednesday, thursday, friday));
	private ArrayList<ArrayList<ArrayList<ArrayList<Employee>>>> employeesInShifts = new ArrayList<>(
			Arrays.asList(days));

//	public void startProgramm() {
//
//		Employee e1 = new Employee("Sandra Bullock");
//		Employee e2 = new Employee("Thomas Jeffrey");
//		Employee e3 = new Employee("Will Sanders");
//		Employee e4 = new Employee("Schmidt Friedrich");
//		Employee e5 = new Employee("Peter Eernst");
//		Employee e6 = new Employee("Dieter Winfried");
//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
//		employees.add(e4);
//		employees.add(e5);
//		employees.add(e6);
//
//		int breakP = 1;
//		System.out.println("Press 1 to start");
//		Scanner sc = new Scanner(System.in);
//		char startProgramm = sc.next().charAt(0);
//
//		do {
//			if (startProgramm == '1') {
//				System.out.println("What do you want to do?");
//				System.out.println(
//						"%-5s| Manage Shifts%n%-5s| Manage Employees%n%-5s| Searchfunction".formatted("1", "2", "3"));
//				char inputMainMenu = sc.next().charAt(0);
//				switch (inputMainMenu) {
//				case '1':
//					System.out.println(
//							"Insert employee in a shift\t\t|1\nRemove employee from shift\t\t|2\nShow employees in current shifts\t|3\n");
//					int shiftMenu = sc.nextInt();
//					switch (shiftMenu) {
//					case 1:
//						addToShift();
//						break;
//					case 2:
//						removeEmployeefromShift();
//						break;
//					case 3:
//						showEmployeesInShift();
//						break;
//					}
//					break;
//				case '2':
//					System.out.println(String.format("%-5s| Add new employee", "1"));
//					System.out.println(String.format("%-5s| Remove employee", "2"));
//					System.out.println(String.format("%-5s| Show current employees", "3"));
//					int employeeMenu = sc.nextInt();
//					switch (employeeMenu) {
//					case 1:
//						addNewEmployee();
//						break;
//					case 2:
//						removeEmployee();
//						break;
//					case 3:
//						showCurrentEmployees();
//						break;
//					}
//					break;
//				case '3':
//					System.out.println("What are you looking for?");
//					System.out.println(String.format("%-5s| Search for empty Shift", "1"));
//					System.out.println(String.format("%-5s| Search employees in a shift", "2"));
//					System.out.println(String.format("%-5s| Search for employee by ID", "3"));
//					int searchMenu = sc.nextInt();
//					switch (searchMenu) {
//					case 1:
//						showEmptyShift();
//						break;
//					case 2:
//						searchEmployeesInShift();
//						break;
//					case 3:
//						searchEmployeeById();
//					}
//					break;
//				default:
//					System.out.println("Invalid Entry");
//				}
//			} else {
//				System.out.println("Have a good day!");
//				breakP++;
//			}
//		} while (breakP <= 1);
//		sc.close();
//	}

//	public void addToShift() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the ID of the employee u want to add to a shift:");
//		int id = sc.nextInt();
//		System.out.println("On which day of the week should the employee work in the early shift?");
//		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
//		int workDay = sc.nextInt();
//		System.out.println("In which shift should the employee work?");
//		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
//		int workShift = sc.nextInt();
//
//		for (ArrayList<ArrayList<ArrayList<Employee>>> days : employeesInShifts) {
//			for (ArrayList<ArrayList<Employee>> shifts : days) {
//				for (ArrayList<Employee> shiftDate : shifts) {
//					for (Employee emp : employees) {
//						switch (workDay) {
//						case 0:
//							switch (workShift) {
//							case 0:
//								if (!earlyMo.contains(emp)) {
//									if (emp.getId() == id) {
//										earlyMo.add(emp);
//									}
//								}
//								break;
//							case 1:
//								if (!lateMo.contains(emp)) {
//									if (emp.getId() == id) {
//										lateMo.add(emp);
//									}
//								}
//								break;
//							case 2:
//								if (!nightMo.contains(emp)) {
//									if (emp.getId() == id) {
//										nightMo.add(emp);
//									}
//								}
//								break;
//							}
//							break;
//						case 1:
//							switch (workShift) {
//							case 0:
//								if (!earlyTu.contains(emp)) {
//									if (emp.getId() == id) {
//										earlyTu.add(emp);
//									}
//								}
//								break;
//							case 1:
//								if (!lateTu.contains(emp)) {
//									if (emp.getId() == id) {
//										lateTu.add(emp);
//									}
//								}
//								break;
//							case 2:
//								if (!nightTu.contains(emp)) {
//									if (emp.getId() == id) {
//										nightTu.add(emp);
//									}
//								}
//								break;
//							}
//							break;
//						case 2:
//							switch (workShift) {
//							case 0:
//								if (!earlyWe.contains(emp)) {
//									if (emp.getId() == id) {
//										earlyWe.add(emp);
//									}
//								}
//								break;
//							case 1:
//								if (!lateWe.contains(emp)) {
//									if (emp.getId() == id) {
//										lateWe.add(emp);
//									}
//								}
//								break;
//							case 2:
//								if (!nightWe.contains(emp)) {
//									if (emp.getId() == id) {
//										nightWe.add(emp);
//									}
//								}
//								break;
//							}
//							break;
//						case 3:
//							switch (workShift) {
//							case 0:
//								if (!earlyTh.contains(emp)) {
//									if (emp.getId() == id) {
//										earlyTh.add(emp);
//									}
//								}
//								break;
//							case 1:
//								if (!lateTh.contains(emp)) {
//									if (emp.getId() == id) {
//										lateTh.add(emp);
//									}
//								}
//								break;
//							case 2:
//								if (!nightTh.contains(emp)) {
//									if (emp.getId() == id) {
//										nightTh.add(emp);
//									}
//								}
//								break;
//							}
//							break;
//						case 4:
//							switch (workShift) {
//							case 0:
//								if (!earlyFr.contains(emp)) {
//									if (emp.getId() == id) {
//										earlyFr.add(emp);
//									}
//								}
//								break;
//							case 1:
//								if (!lateFr.contains(emp)) {
//									if (emp.getId() == id) {
//										lateFr.add(emp);
//									}
//								}
//								break;
//							case 2:
//								if (!nightFr.contains(emp)) {
//									if (emp.getId() == id) {
//										nightFr.add(emp);
//									}
//								}
//								break;
//							}
//							break;
//						}
//
//					}
//				}
//			}
//		}
//	}

//	public void showEmployeesInShift() {
//
//		// MONDAY
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%15s|%-4s|%-20s|".formatted("", "ID", "Name"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%15s|%-25s|".formatted("", "Monday"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
//		for (Employee e : earlyMo) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
//		for (Employee e : lateMo) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
//		for (Employee e : nightMo) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		// TUESDAY
//		System.out.println("|%15s|%-25s|".formatted("", "Tuesday"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
//		for (Employee e : earlyTu) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
//		for (Employee e : lateTu) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
//		for (Employee e : nightTu) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		// WEDNESDAY
//		System.out.println("|%15s|%-25s|".formatted("", "Wednesday"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
//		for (Employee e : earlyWe) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
//		for (Employee e : lateWe) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
//		for (Employee e : nightWe) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		// THURSDAY
//		System.out.println("|%15s|%-25s|".formatted("", "Thursday"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
//		for (Employee e : earlyTh) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
//		for (Employee e : lateTh) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
//		for (Employee e : nightTh) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		// FRIDAY
//		System.out.println("|%15s|%-25s|".formatted("", "Friday"));
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Early Shift", "05:00 - 13:00"));
//		for (Employee e : earlyFr) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Late Shift", "13:00 - 21:00"));
//		for (Employee e : lateFr) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//		System.out.println("|%-15s|%-25s|".formatted("Night Shift", "21:00 - 05:00"));
//		for (Employee e : nightFr) {
//			System.out.println("|%-15s|%-23s|".formatted("", e.toString()));
//		}
//		System.out.println("+---------------+-------------------------+");
//
//	}

//	public void removeEmployeefromShift() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the ID of the employee you want to remove from shift:");
//		int id = scanner.nextInt();
//		for (ArrayList<ArrayList<Employee>> shifts : days) {
//			for (ArrayList<Employee> shiftDate : shifts) {
//				for (Iterator<Employee> itr = shiftDate.iterator(); itr.hasNext();) {
//					Employee e = itr.next();
//					if (e.getId() == id) {
//						itr.remove();
//						System.out.println(e.toString() + " has been removed\n");
//					}
//				}
//			}
//		}
//	}

	public void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the first name of the employee you want to add:");
		String fname = sc.next();
		System.out.println("Type the last name in: ");
		String lname = sc.next();
		String fullName = fname + " " + lname;
		employees.add(new Employee(fullName));
		for (Employee e : employees) {
			if (e.getName() == fullName) {
				System.out.println(e.toString() + " has been added to employees\n");
			}

		}
	}

	public void removeEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the employee you want to remove");
		int id = sc.nextInt();
		for (Iterator<Employee> itr = employees.iterator(); itr.hasNext();) {
			Employee e = itr.next();
			if (e.getId() == id) {
				itr.remove();
				System.out.println(e.toString() + " has been removed\n");
			}
		}
	}

	public void showCurrentEmployees() {
		System.out.println("----+--------------------+");
		System.out.printf("%-4s|%-20s|%n", "ID", "NAME");
		System.out.println("----+--------------------+");
		for (Employee e : employees) {
			System.out.println(e.toString() + "|");
		}
		System.out.println("----+--------------------+\n");
	}

//	public void showEmptyShift() {
//		for (ArrayList<ArrayList<Employee>> shift : days) {
//			for (int i = 0; i < shift.size(); i++) {
//				// MONDAY
//				if (earlyMo.isEmpty() && shift.get(i) == earlyMo) {
//					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Early shift"));
//				} else if (lateMo.isEmpty() && shift.get(i) == lateMo) {
//					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Late shift"));
//				} else if (nightMo.isEmpty() && shift.get(i) == nightMo) {
//					System.out.println("%-10s|%-12s is empty".formatted("Monday", "Night shift"));
//				} // TUESDAY
//				else if (earlyTu.isEmpty() && shift.get(i) == earlyTu) {
//					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Early shift"));
//				} else if (lateTu.isEmpty() && shift.get(i) == lateTu) {
//					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Late shift"));
//				} else if (nightTu.isEmpty() && shift.get(i) == nightTu) {
//					System.out.println("%-10s|%-12s is empty".formatted("Tuesday", "Night shift"));
//				} // WEDNESDAY
//				else if (earlyWe.isEmpty() && shift.get(i) == earlyWe) {
//					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Early shift"));
//				} else if (lateWe.isEmpty() && shift.get(i) == lateWe) {
//					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Late shift"));
//				} else if (nightWe.isEmpty() && shift.get(i) == nightWe) {
//					System.out.println("%-10s|%-12s is empty".formatted("Wednesday", "Night shift"));
//				}
//				// THURSDAY
//				else if (earlyTh.isEmpty() && shift.get(i) == earlyTh) {
//					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Early shift"));
//				} else if (lateTh.isEmpty() && shift.get(i) == lateTh) {
//					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Late shift"));
//				} else if (nightTh.isEmpty() && shift.get(i) == nightTh) {
//					System.out.println("%-10s|%-12s is empty".formatted("Thursday", "Night shift"));
//				}
//				// FRIDAY
//				else if (earlyFr.isEmpty() && shift.get(i) == earlyFr) {
//					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Early shift"));
//				} else if (lateFr.isEmpty() && shift.get(i) == lateFr) {
//					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Late shift"));
//				} else if (nightFr.isEmpty() && shift.get(i) == nightFr) {
//					System.out.println("%-10s|%-12s is empty".formatted("Friday", "Night shift"));
//				}
//			}
//			System.out.println("----------+--------------------+");
//		}
//	}

//	public void searchEmployeesInShift() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("On which day of the week?");
//		System.out.println("0 | Monday\n1 | Tuesday\n2 | Wednesday\n3 | Thursday\n4 | Friday");
//		int workDay = sc.nextInt();
//		System.out.println("In which shift?");
//		System.out.println("0 | Early shift\n1 | Late shift\n2 | Night shift\n");
//		int workShift = sc.nextInt();
//
//		for (ArrayList<ArrayList<ArrayList<Employee>>> days : employeesInShifts) {
//			for (ArrayList<ArrayList<Employee>> shifts : days) {
//				for (ArrayList<Employee> shiftDate : shifts) {
//					for (Employee emp : shiftDate) {
//						switch (workDay) {
//						case 0:
//							switch (workShift) {
//							case 0:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 1:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 2:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							}
//							break;
//						case 1:
//							switch (workShift) {
//							case 0:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 1:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 2:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							}
//							break;
//						case 2:
//							switch (workShift) {
//							case 0:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 1:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 2:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							}
//							break;
//						case 3:
//							switch (workShift) {
//							case 0:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 1:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 2:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							}
//							break;
//						case 4:
//							switch (workShift) {
//							case 0:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 1:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							case 2:
//								System.out.println(emp.toString() + "is working in this shift");
//								break;
//							}
//							break;
//						}
//					}
//				}
//			}
//		}
//	}

//	public void searchEmployeeById() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the ID of the employee u want to search:");
//		int id = sc.nextInt();
//
//		for (ArrayList<ArrayList<Employee>> shifts : days) {
//			for (ArrayList<Employee> shiftDate : shifts) {
//				for (int i = 0; i < shiftDate.size(); i++) {
//					if (shiftDate.get(i).getId() == id) {
//						for (Employee emp : shiftDate) {
//							if (earlyMo.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Monday in early shift");
//							}
//							if (lateMo.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Monday in late shift");
//							}
//							if (nightMo.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Monday in night shift");
//							}
//							if (earlyTu.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in early shift");
//							}
//							if (lateTu.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in late shift");
//							}
//							if (nightTu.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Tuesday in night shift");
//							}
//							if (earlyWe.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in early shift");
//							}
//							if (lateWe.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in late shift");
//							}
//							if (nightWe.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Wednesday in night shift");
//							}
//							if (earlyTh.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Thursday in early shift");
//							}
//							if (lateTh.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Thursday in late shift");
//							}
//							if (nightTh.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Thursday in night shift");
//							}
//							if (earlyFr.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Friday in early shift");
//							}
//							if (lateFr.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Friday in late shift");
//							}
//							if (nightFr.contains(emp) && emp.getId() == id) {
//								System.out.println(shiftDate.get(i).toString() + "works on Friday in night shift");
//							}
//						}
//					}
//				}
//			}
//		}
//	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public ArrayList<Employee> getEarlyMo() {
		return earlyMo;
	}

	public ArrayList<Employee> getLateMo() {
		return lateMo;
	}

	public ArrayList<Employee> getNightMo() {
		return nightMo;
	}

	public ArrayList<Employee> getEarlyTu() {
		return earlyTu;
	}

	public ArrayList<Employee> getLateTu() {
		return lateTu;
	}

	public ArrayList<Employee> getNightTu() {
		return nightTu;
	}

	public ArrayList<Employee> getEarlyWe() {
		return earlyWe;
	}

	public ArrayList<Employee> getLateWe() {
		return lateWe;
	}

	public ArrayList<Employee> getNightWe() {
		return nightWe;
	}

	public ArrayList<Employee> getEarlyTh() {
		return earlyTh;
	}

	public ArrayList<Employee> getLateTh() {
		return lateTh;
	}

	public ArrayList<Employee> getNightTh() {
		return nightTh;
	}

	public ArrayList<Employee> getEarlyFr() {
		return earlyFr;
	}

	public ArrayList<Employee> getLateFr() {
		return lateFr;
	}

	public ArrayList<Employee> getNightFr() {
		return nightFr;
	}

	public ArrayList<ArrayList<Employee>> getMonday() {
		return monday;
	}

	public ArrayList<ArrayList<Employee>> getTuesday() {
		return tuesday;
	}

	public ArrayList<ArrayList<Employee>> getWednesday() {
		return wednesday;
	}

	public ArrayList<ArrayList<Employee>> getThursday() {
		return thursday;
	}

	public ArrayList<ArrayList<Employee>> getFriday() {
		return friday;
	}

	public ArrayList<ArrayList<ArrayList<Employee>>> getDays() {
		return days;
	}

	public ArrayList<ArrayList<ArrayList<ArrayList<Employee>>>> getEmployeesInShifts() {
		return employeesInShifts;
	}

}
