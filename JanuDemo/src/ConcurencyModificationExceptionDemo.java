import java.util.ArrayList;
import java.util.Collection;

public class ConcurencyModificationExceptionDemo {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
		System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
		names.add("XML");
		names.add("HTML");
		names.add("CSS");
		for (String name : names) {
			names.remove(name);// Throws a ConcurrentModificationException
		}
	}

}
