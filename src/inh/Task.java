package inh;

public class Task {

	public static void main(String[] args) {
		Square s = new Square();
		// s.print();
		s.print();
		s.print1();
		s.print2();
	}
}

class Shape {
	void print() {
		System.out.println("this is shape");
	}

	void print1() {
		System.out.println("this is shape");
	}

}

class Rect extends Shape {
	void print() {
		super.print();
		System.out.println("this is rect");
	}

	void print2() {
		System.out.println("this is rect");
	}

}

class Circle extends Shape {
	void print() {
		System.out.println("this is circle");
	}

}

class Square extends Rect {
	void print() {
		System.out.println("Square is a rectangle");
		super.print();// super --> parent --> rect
	}

}
