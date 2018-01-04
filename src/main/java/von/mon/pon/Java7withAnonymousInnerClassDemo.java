package von.mon.pon;

interface B {
	public void show();
}

//class Mno implements B {
//	public void show() {
//		System.out.println("Hello World!!!");
//	}
//}

public class Java7withAnonymousInnerClassDemo {

	public static void main(String[] args) {
		B obj;
		obj = new B() {
			public void show() {
				System.out.println("Hello World!!!");
			}
		};
		obj.show();
	}
}
