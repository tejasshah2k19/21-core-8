//encapsulation :-	
//java we can not write anything out side class
//c++ allow us to write out side class

//c++ --> 100% object oriented 
//java --> pure oop

//inheritance :- 
//object of one class can access can access property of another class 

//giver --> parent , super , base 
//take  --> child ,  sub   , derived 

//extends keyword is used to apply inheritance in java 


//

//parent 
class BasicCalc{

	public static void main(String args[]){
		SciCalc sc = new SciCalc();
		sc.sin();
		sc.add();
		 
	}

	void add(){
		System.out.println("add()::BasicCalc");
	}	
	
}
//child --> child will extends parent class, then only child class can access property of parent class 
class SciCalc extends BasicCalc{
	 
	void sin(){	
		System.out.println("sin()::SciCalc");

	}	
}