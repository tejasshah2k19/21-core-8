package inh;

public class OverrRiding {

	public static void main(String[] args) {
		// add()
		Child c =new Child();
		
	}
}

//private , default*** ,protected , public 
class Parent {
	protected void add() {
		System.out.println("add()::Parent");
	}

	protected void add(int a) {
		System.out.println("add(int)::Parent");
	}

	protected void add(String x) {
		System.out.println("add(String)::Parent");
	}

	protected void add(int a, int b) {
		System.out.println("add(int,int)::Parent");
	}

}

class Child extends Parent {
//	public void add() {
//		System.out.println("add():Child");
//	}

	protected void add(int a, int b) {
		System.out.println("add(int,int)::Child");
	}

	void accessParentAdd() {
		super.add(1,1);
	}
 
	protected void add(float a, float b, float c) {
		System.out.println("add(float,float,float)::Parent");
	}

	void addition() {

	}
}



