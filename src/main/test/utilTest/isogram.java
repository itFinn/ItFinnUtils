package utilTest;

public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
        if (!str.isEmpty()) {
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (str.indexOf(c) != str.lastIndexOf(c)) {
                    return true;
                }
            }
        }
        return false;
    }
}

