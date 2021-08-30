public class cci1_5 {

    boolean oneEditAway(String s1, String s2){
        if(s1.length() == s2.length()){
            return oneEditReplace(s1, s2);
        } else if (s1.length() + 1 == s2.length()){
            return oneEditInsert(s1, s2);
        } else if (s1.length() - 1 == s2.length()) {
            return oneEditInsert(s2, s1);
        }
        return false;

    }

    // check if s1 can be made s2 with 1 char insertion.
    private boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while(index1 < s1.length() && index2 < s2.length()){

                if(s1.charAt(index1) != s2.charAt(index2)){
                    if(index1 != index2){
                        System.out.println("strings are not one edit away.");
                        return false;
                    } 
                    index2++;
                }
                else{
                    index1++;
                    index2++;
                }
            }
        System.out.println("strings are one insert away.");
        return true;
    }

    private boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                
                foundDifference = true;
                System.out.println("Found Difference "+ foundDifference);
            }
        }
        System.out.println("strings are one replace away.");
    return true;
    
    }

    public static void main(String[] args) {
        
        // String s1 = "apple";
        // String s2 = "aple";

        // String ss1 = "pale";
        // String ss2 = "bale";

        String st = "ppl";
        String st2 = "bblq";

        cci1_5 obj = new cci1_5();

        // obj.oneEditAway(s1, s2);
        // obj.oneEditAway(ss1, ss2);

        obj.oneEditAway(st, st2);
    }

}
