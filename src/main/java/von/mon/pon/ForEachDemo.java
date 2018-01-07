package von.mon.pon;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 12, 3, 23, 19);
		values.forEach(i -> System.out.println(i));
	}

}
