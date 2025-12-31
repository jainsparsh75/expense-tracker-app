public class sample {

//    String s1= "abcd"
//     String s2 = "cdab"

    boolean isRotation(String s1, String s2)   {
        if(s1.length()!=s2.length()){
            return false;
        }
        s1 = s1+s1;

        for(int i=0;i<s1.length();i++){
             return s1.contains(s2);
        }
        return false;
    }



}

public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "cdab";


    sample s = new sample();


}
