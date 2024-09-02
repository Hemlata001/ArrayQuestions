package String;
public class StringCompare {
    public static void main(String[] args) {
        String str = "HIMANSHI";
        String str1 = "HIMANSHI";
        String str2 = new String("HIMANSHI");
        if(str == str1){
            System.out.println("String are same");
        }else{
            System.out.println("Not Same");
        }
        if(str == str2){
            System.out.println("String are same");
        }else{
            System.out.println("Not same");
        }
        if(str.equals(str2)){
            System.out.println("String are same");
        }else{
            System.out.println("Not same");
        }
    }
}
