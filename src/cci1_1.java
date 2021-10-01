public class cci1_1 {

    // method checks if all char in a string are uniqe or not.
    boolean isUniqueChars(String s){
        if(s.length() > 128) return false; //considering ASCII char encoding.

        boolean[] char_set = new boolean[128]; //create a boolean array of size 128.
        
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i);
            if(char_set[c]){
                System.out.println("False");
                return false;
                
            }
            char_set[c] = true;
            
        }
        System.out.println("True");
        return true;

    }

   public static void main(String[] args) {
       String s1 = "I do not have all unique characters";
       String s2 = "Al uniqe";

       cci1_1 obj = new cci1_1();
       System.out.println("If True, all unique. If False, not unique.");

       obj.isUniqueChars(s1);
       obj.isUniqueChars(s2);
        
    }
    
}
