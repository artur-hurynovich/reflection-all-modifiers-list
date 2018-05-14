import java.util.ArrayList;
import java.util.HashMap;

public class ModifiersList {
	static ArrayList<String> getAllModifiers(int m) {
		ArrayList<String> modifiers = new ArrayList<>();
		HashMap<Integer, String> allModifiers = new HashMap<Integer, String>(){
			{
				put(0, "strict");
                put(1, "abstract");
                put(2, "interface");
                put(3, "native");
                put(4, "transient");
                put(5, "volatile");
                put(6, "synchronized");
                put(7, "final");
                put(8, "static");
                put(9, "protected");
                put(10, "private");
                put(11, "public");

			}
		};
		byte [] modifiersFlags = new byte[12];
		for (int i = modifiersFlags.length - 1; i >= 0; i--){
            if (Math.pow(2, i) > m) modifiersFlags[modifiersFlags.length - 1 - i] = 0;
            else {
            	modifiersFlags[modifiersFlags.length - 1 - i] = 1;
                m -= Math.pow(2, i);
            }
        }
		for (int i = 0; i < modifiersFlags.length; i++) {
            if (modifiersFlags[i] == 1) modifiers.add(allModifiers.get(i));
        }
        return modifiers;

	}
}
