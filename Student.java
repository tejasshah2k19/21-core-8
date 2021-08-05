/*student	
	name 
	maths sci eng 
	
	result 
	perc grade
 
oop - class / object */

//scope of the variable 
//instance - class --> copy? object/instance 
//static - class  --> copy? 1 and only 1 
//local  - block 
//scope is the visiblity  {  }/

//encapsulation :- class 
//c++ -> 



import java.util.Scanner; 
class Student{
	//c++ -> private 
	//java -> default 
	// private default* protected public - 4
	String name; //instance variable
	int maths,sci,eng;//
	float total,perc;
	char grade;

	static int totalStudents=0; //static variable 500
	

	void input(){
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter name and marks of three subject");
		name = scr.next();
		maths = scr.nextInt();
		sci = scr.nextInt();
		eng = scr.nextInt();
	}

	void calculateResult(){
		total = maths + sci + eng ; 
		perc = (total)/3;

		if(perc > 90 ){
			grade = 'A';
		}else if(perc > 80 ){
			grade = 'B';
		}else if(perc >= 35 ){
			grade = 'C';
		}else{
			grade = 'R';
		}
	
	}

	void printData(){
		System.out.println("Name : "+name);
		System.out.println("Maths : "+maths);
		System.out.println("Sci : "+sci);
		System.out.println("Eng : "+eng);
		System.out.println("Total : "+total);
		System.out.println("Perc : "+perc);
		System.out.println("Grade : "+grade);
	
	}

	void demo(){
		int a=12;//local variable 
		for(int i=1;i<=10;i++){
			// i => block variable { local variable } 
		}
		//
	}
	public static void main(String args[]){
		 
		Student ram = new Student(); 
		ram.input();
		ram.calculateResult();
		ram.printData();
		
	} 

}
















