

public class SolutionLongestSubstring {
    public static void main(String[] args) {
        String str = "tmmzuxtt";
        System.out.print(lengthOfLongestSubstring(str));
    }
    /* lengthOfLongestSubstring- returns the length of the longest substring
     * , sSubstring, in a given string, s.*/
    public static int lengthOfLongestSubstring(String s) {
        //default value of max 0 <- in case when empty string is passed
        int max = 0;
        //save length of string
        int sLength = s.length();
        //parse length of string
        for (int i = 0; i < sLength; i++) {
            //initialize substring, sSubstring
            String sSubstring = "";
            //initialize count to 0
            int count = 0;
            //start character of each iteration (i is incremented by 1 each iteration)
            char c = s.charAt(i);
            //save index of start position
            int tempi = i;
            //condition- sSubString does not contain character
            while (!sSubstring.contains(Character.toString(c))) {
                //char to store
                c = s.charAt(tempi++);
                //store char
                sSubstring += c;
                //increment count
                count++;
                //if- makes sure tempi does not parse passed sLength
                if (tempi < sLength) {
                    //update char
                    c = s.charAt(tempi);
                }
            }
            //set max to largest substring
            max = Math.max(max, count);
        }
        return max; 
    }
}

        
