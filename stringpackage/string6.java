package stringpackage;

public class string6 {
    public static void main(String args[]){
        String s1="shasi";
        String s2="shasi";
        String s3="SHASI";
        String s4="python";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }
}
