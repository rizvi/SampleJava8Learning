package von.mon.pon;

interface A {
	public void show();
}

class Xyz implements A {
	public void show() {
		System.out.println("Hello World!!!");
	}
}

public class Java7Demo {
	public static void main(String[] args) {
		A obj;
		obj = new Xyz();
		obj.show();
	}
}
