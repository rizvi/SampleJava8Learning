package von.mon.pon;

interface Showable {
	public void show(String name);
}
public class LambdaDemoWithParams {

	public static void main(String[] args) {

		// Anonymous Inner Class Demo
//		Showable obj;
//		obj = new B(String name) {
//			public void show() {
//				System.out.println("Hello Mr. "+name);
//			}
//		};
//		obj.show();

		// Anonymous Inner Class 2 Lambda Conversion
		Showable obj;
		obj = (name) -> {
			System.out.println("Hello Mr. "+ name);
		};
		obj.show("Ram Krishna");

		// Lambda in short form
		Showable obj2;
		obj2 = name -> System.out.println("Hello Mrs. "+ name);
		obj2.show("Lalita");
	}

}
