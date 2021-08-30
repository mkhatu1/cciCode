public class cci1_3 {

    void replaceSpaces(char[] s, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++){
            if(s[i] == ' ') 
            spaceCount++;
        }
        System.out.println(s);
        System.out.println("Space count: "+ spaceCount);

        index = trueLength + spaceCount * 2;
        
        if(trueLength < s.length) {
            s[trueLength] = '\0'; //end of array
            }

        for(i = trueLength - 1; i >= 0; i--) {
            if (s[i] == ' '){
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';

                index = index - 3;
            }
            else{
                s[index - 1] = s[i];
                index--;
            }
            
        }
        System.out.println(s);
    }

    public static void main(String[] args){
        String str = "Mr John Smith      "; //true lenght = 13.
        // str = toCharArray(str);
        char[] carray = str.toCharArray();

        cci1_3 obj = new cci1_3();

        obj.replaceSpaces(carray, 13);

        System.out.println("It worked!");
        //System.out.println(str);
       


    }
    
}
