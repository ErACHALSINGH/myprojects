import java.util.HashMap;
public class MyClass {

	public static void main(String[] args) {
		HashMap<String,String>capitalcities=new HashMap<String,String>();
		capitalcities.put("England","London");
		capitalcities.put("RAj","Jaipur");
		capitalcities.put("Germany","Berlin");
		capitalcities.put("USA","WD");
		capitalcities.put("Norway","Osla");
		for(String i:capitalcities.keySet()) {
		System.out.println("key:-"+i+"-:value:-"+capitalcities.get(i));
	}
	}
}
