package stack;

public class StackMain {
    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        String strg = simplifyPath.simplifyPath("/../");
        System.out.println(" string is " + strg);
    }
}
