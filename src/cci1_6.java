public class cci1_6 {

    String compress(String s){
        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            count++;

            if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)){
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 0;
            }
           
            
        }

        return compressed.length() < s.length() ? compressed.toString() : s;


    }
    
    public static void main(String[] args) {
        String s = "aabbbbbbbccddeee";

        cci1_6 obj = new cci1_6();


        // obj.compress(s);
        // System.out.println(s);

        System.out.println(s.length());
        System.out.println(obj.compress(s));
        System.out.println("worked!");
    }
}
