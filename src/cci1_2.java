public class cci1_2 {
    String sort(String s){
        char[] cArray = s.toCharArray();
        java.util.Arrays.sort(cArray);
        return new String(cArray);
    }

    boolean permutationCheck(String s, String t){
        if(s.length()!= t.length()){
            return false;
        }
        return sort(s).equals(sort(t));

    }

    public static void main(String[] args){
        String s = "abcd";
        String t = "cbda";
        cci1_2 obj = new cci1_2();
        System.out.println(obj.permutationCheck(s,t));

        // obj.permutationCheck(s, t);
        System.out.println("Executed!");




    }
    
}
