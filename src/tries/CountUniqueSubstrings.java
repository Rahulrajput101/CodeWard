package tries;

public class CountUniqueSubstrings {

    public void countSubstringMain(String word){

        for (int i = 0; i<word.length(); i++){
            Tries.insert( word.substring(i));
        }

        System.out.println(Tries.count(Tries.root));
    }
}
