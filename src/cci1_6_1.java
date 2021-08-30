import java.util.HashMap;
import java.util.Map;

public class cci1_6_1 {

    String compress(String s){

        String compressed = getFrequencyStr(s);
        System.out.println(s.length());
        System.out.println(compressed.length());
        // System.out.println(compressed);

        return compressed.length() < s.length() ? compressed : s;
    }

    private String getFrequencyStr(String s) {
        Map<Character, Integer> freq = new HashMap<Character, Integer>();

        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
        }
        
        String st = freq.toString().replace(",", "");
        st = st.replace(" ", "");
        // StringBuilder sb = new StringBuilder();
        // sb.append(st.replace("=", ""));
        st = st.replace("=", "");
      
        
// System.out.println(freq.toString().replace( ",", ""));
    //    return sb.toString();

    return st;

    }


    public static void main(String[] args) {
        String s = "aabbbbbbbccddeee";

        cci1_6_1 obj = new cci1_6_1();

        System.out.println(obj.compress(s));
    }
    
    
}
