// You will still use the hash array in case of the strings

// There are two ways we solve this make size of 256 of hash but if only lower alphatets then take size as 26.
import java.util.Arrays;

public class H02CountChar {
    public static void main(String[] args) {
        String s = "sarthak";
        char[] characters = s.toCharArray();
        char[] find = {'s','a','r','t','q','j'};
        
        int[] hash = new int[26];
        int[] newArr = new int[find.length];

        for(int i=0; i<characters.length; i++){
            hash[characters[i] - 'a']++;
        }

        for(int i=0; i<newArr.length; i++){
            newArr[i] = hash[find[i] - 'a'];
        }

        System.out.println(Arrays.toString(newArr));

    }
}
