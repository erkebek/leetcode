package level1;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("b", "c"));
        System.out.println(new IsSubsequence().isSubsequence("abc", "acb"));
        System.out.println(new IsSubsequence().isSubsequence("b", "abc"));
    }

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int k = 0;
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) == s.charAt(k)) {
                k++;
                if(k == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
