package Others;

public class ScoreOfString {
    public int scoreOfStringMain(){
        String s = "hello";
        int sum = 0;

        for(int i =1; i<s.length(); i++){
            int prev = (int) s.charAt(i-1);
            int curr = (int) s.charAt(i);
            System.out.println("prev " + prev + "curr "+curr);
            sum = Math.abs(sum + (curr-prev));
            System.out.println(sum);
        }

        return sum;
    }
}
