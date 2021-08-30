public class cci1_4 {

    boolean isPlaindromePermutation(String phrase){
        int[] table = charFrequencyTable(phrase);

        // System.out.println("Workig.");

        return checkMaxOneOdd(table);
    }

    //method to check the plaindrome characterestic.
    boolean checkMaxOneOdd(int[] table){

        boolean foundOdd = false;
     

        for(int count: table){
         
            if(count % 2 == 1) {

              
                if(foundOdd){
                    
                    System.out.println("False.");
                    return false;
                }
                foundOdd = true;
            }
        }
        System.out.println("True.");
        return true;
    }



// method to change char to integer value

int getcharNumber(Character c){

    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);

    if(a <= val && val <= z){
        return val - a;
    }
    return - 1;
}

// count char frequency in the given phrase using this method.
    private int[] charFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        
        for(char c: phrase.toCharArray()){
            int x = getcharNumber(c);

            // System.out.println(x);
            if(x != -1){
                table[x]++;
                // System.out.println(table[x]);
            }
        }
        // System.out.println("Frequency Table: ");
        // System.out.print(table);//returns table address.
        return table;
    }


    public static void main(String[] args) {
        
        String phrase = "Tact coa";

        cci1_4 obj = new cci1_4();

        obj.isPlaindromePermutation(phrase);
    
        
    }

}