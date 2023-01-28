

public class SolutionLongestSubstring {
    
    public static void main(String[] args) {
        String str = "tmmzuxtt";
        System.out.print(lengthOfLongestSubstring(str));
    }
    
    /* lengthOfLongestSubstring- returns the length of the longest substring
     * , sSubstring, in a given string, s.*/
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            String sSubstring = "";
            int count = 0;)
            char c = s.charAt(i);
            int tempi = i;
            while (!sSubstring.contains(Character.toString(c))) {
                c = s.charAt(tempi++);
                sSubstring += c;
                count++;
                if (tempi < sLength) {
                    c = s.charAt(tempi);
                }
            }
            max = Math.max(max, count);
        }
        return max; 
    }
}
