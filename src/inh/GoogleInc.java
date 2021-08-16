package inh;

public class GoogleInc {

	public static void main(String[] args) {

	}
}

class Employee {
	int empId;
	String name;


}

class FullTime extends Employee {
	int salary;
	int workingDays;
}

class PartTime extends Employee {
	int wages;
	int workingHours;
}