import java.util.HashSet;

public class cci2_1 {

    // remove duplicates from a String.
    void removeDups(String s){
        
        HashSet<Character> h = new HashSet<>();

        for(char i: s.toCharArray()){
            if(i != ' '){

                h.add(i);
            }
            
        }
        System.out.println(h);

    }

    public static void main(String[] args) {
        String s = "FOLLOW UP";
        System.out.println(s);

        cci2_1 obj = new cci2_1();
        obj.removeDups(s);
     
  

    }
}
