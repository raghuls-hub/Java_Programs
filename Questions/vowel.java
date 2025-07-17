package Questions;
import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
        char Ch = sc.next().charAt(0);
        char ch=Character.toLowerCase(Ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') System.out.print("It is a vowel.");
        else System.out.print("It is not a vowel.");
    }
}
