public class cci1_9 {

    boolean isRotation(String s1, String s2){
          // check if the Stings have same length and the first one is not empty.
    if(s1.length() == s1.length() && s1.length() > 0){
        // concate s1 within new  buffer
        String s1s1 = s1 + s1;
        System.out.println(s1s1);
        return isSubstring(s1s1, s2);

    }
    return false;
        
    }

    // given 2 strings find if one is a substing of the other.
   boolean isSubstring(String s1, String s2){

    if(s1.contains(s2)) {
        // System.out.println(s1);
        System.out.println(s2);
        return true;
    }

    return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "bottlewater";

        cci1_9 obj = new cci1_9();

        System.out.println(obj.isRotation(s1, s2));
    }


    
}
