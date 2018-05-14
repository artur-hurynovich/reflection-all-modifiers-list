import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("java.lang.Object");
			System.out.println("Methods and modifiers of " + c.getName());
			for (Method m : c.getDeclaredMethods()) {
				System.out.println(m.getName() + ": " + ModifiersList.getAllModifiers(m.getModifiers()));
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
