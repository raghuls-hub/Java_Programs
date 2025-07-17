package Questions;
import java.util.*;
public class chara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
        char Ch = sc.next().charAt(0);
        if(Character.isLetter(Ch)) System.out.print("It is a Alphabet.");
        else System.out.print("It is not a Alphabet.");
    }
}
