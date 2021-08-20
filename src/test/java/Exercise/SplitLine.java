package Exercise;

public class SplitLine {
    public static void main(String[] args) {
        String myStr = "If there is a will, there is a way";
        String[] words = myStr.split("\\s");
        for(String subStr:words) {
            System.out.println(subStr);
        }
    }
}
