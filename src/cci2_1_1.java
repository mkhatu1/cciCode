import java.util.HashSet;
import java.util.LinkedList;

public class cci2_1_1 {
    // remove duplicate from an unordered LinkedList. Buffor allowed.
    void removeDuplicates(LinkedList<Character> n){
        HashSet<Character> h = new HashSet<>();
        for(char c: n){
            if(c !=' '){
                h.add(c);
            }
        }
        System.out.println(h);
    }

        void removeDuplicatesNoBuffer(LinkedList<Character> n){

            while(n.size()!= 0){

                // if(n.element().equals(obj));
            }


        }
    
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();

        String s = "follow up";

        for (char c: s.toCharArray()){
            ll.add(c);

        }
        // System.out.println(ll);
        cci2_1_1 obj = new cci2_1_1();
        // obj.removeDuplicates(ll);
        obj.removeDuplicatesNoBuffer(ll);
        
    }
    
}
