package inh;

public class PatelMedia {

	public static void main(String[] args) {

	}
}

class Computer {

}

class Laptop extends Computer {
	String processor;
	String ram;
}

class Desktop extends Computer {

}

class LedDesktop extends Desktop {

}

class TvDesktop extends Desktop {

}

class Gaming extends Laptop {
	String gpu;
	String ssd;
}

class Graphics extends Laptop {
	String ssd;
	String coolingFan;
}

class Basic extends Laptop {

}
