public class TransformingAList{
    public static String reverse(String s){
        String str = "";
        for (int i=s.length()-1; i>=0; i--){
            str+=s.substring(i,i+1);
        }
        return str;
    }
    public static String[] reverseAll(String[] strings){
        String[] addingStrings = new String[strings.length];
        for (int i=0;i<=strings.length-1;i++){
            addingStrings[i]=reverse(strings[i]);
        }
        return addingStrings;
    }
    public static void main (String[] args){
        String[] s1 = {"abcd", "xyz"};
        String[] s2 = {"1234", "5678"};
        String[] s3 = {"racecar", "tacocat", "izzi"};
        
        testTransformingAList(s1);
        testTransformingAList(s2);
        testTransformingAList(s3);
    }
    public static void testTransformingAList(String[] in){
        String[] result = reverseAll(in);
        System.out.println ("results: ");
        for (String x : result){
            System.out.println(x);
        }
        System.out.println();
    }
}