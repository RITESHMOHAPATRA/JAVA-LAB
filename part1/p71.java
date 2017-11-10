import java.util.HashMap;
import java.util.HashSet;

class SubString {
    public static String subString(String input) {

        String longesTillNOw = "";
        String longestOverAll = "";
        HashMap<Character,Integer> chars = new HashMap<>();
        char[] array=input.toCharArray();
        int start=0;
        for (int i = 0; i < array.length; i++) {
            char character = array[i];
            if (chars.containsKey(character) ) {
                start=chars.get(character)+1;
                i=start;
                chars.clear();
                longesTillNOw = "";
            } else {
                chars.put(character,i);
                longesTillNOw = longesTillNOw + character;
                if (longesTillNOw.length() > longestOverAll.length()) {
                    longestOverAll = longesTillNOw;
                }
            }
        }
        return longestOverAll;

    }

    public static void main(String[] args) {
        String input = "ABDEFGABEF";
        System.out.println(subString(input));
    }
}