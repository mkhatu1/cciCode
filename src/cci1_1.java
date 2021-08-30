public class cci1_1 {
    boolean isUniqueChars(String s){
        if(s.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        
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

    //    String os = String.valueOf(obj.isUniqueChars(s1));
    //    System.out.println(os);

        obj.isUniqueChars(s1);
        obj.isUniqueChars(s2);

       System.out.println("If True all unique. If False not unique.");
        
    }
    
}
