package von.mon.pon;

public class AnonymousInnerClass2LambdaDemo {
	public static void main(String[] args) {

		// Anonymous Inner Class Demo
//		B obj;
//		obj = new B() {
//			public void show() {
//				System.out.println("Hello World!!!");
//			}
//		};
//		obj.show();

		// Anonymous Inner Class 2 Lambda Conversion
		B obj;
		obj = () -> {
			System.out.println("Hello World!!!");
		};
		obj.show();

		// Lambda in short form
		B obj2;
		obj2 = () -> System.out.println("Hello Mr Rizvi...");
		obj2.show();
	}
}
