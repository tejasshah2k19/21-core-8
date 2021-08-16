import java.util.Scanner;  


//all variable methods and class are "default" by default -- when not specify 
 
class Basic{
	int a,b,ans;
	
	void inputData(){
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = scr.nextInt();
		b = scr.nextInt();
			
	}
	void add(){
		ans = a+b;
		System.out.println("Addition = "+ans);
	}

	void mul(){
		ans = a*b;
		System.out.println("Mul = "+ans);
	}

	void div(){
		ans = a/b;
		System.out.println("Div = "+ans);
	}

	void sub(){
		ans = a-b;
		System.out.println("Sub = "+ans);
	}


	public static void main(String args[]){
		Basic obj = new Basic(); 	
		obj.inputData();
		//menu 
		//choice 
		obj.add();  
		 
	}
}

/*
	Scanner -> nextInt() , nextFloat() , nextDouble() , next() 


	ClassName objectName = new ClassName(); 
	create a class Calc 
		print menu for add , sub , mul , div 
		ask choice to the user 
		perform operation as per user's choice 

	Note: only integers , Scanne
*/







