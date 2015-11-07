import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;
public class ArrayDemo {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
    names.add("XML");
    names.add("HTML");
    names.add("CSS");
    java.util.Iterator<String> i = names.iterator();
    while(i.hasNext())
    	System.out.println(i.next());
    System.out.printf("Size   = %d, Elements   = %s%n %s",
        names.size(), names,names.getClass());
    names.remove("CSS");
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
    names.clear();
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
  }
}
