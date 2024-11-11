import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(7);
        set.add(5);
        set.add(9);
        set.add(-8);
        System.out.println("Set: " + set);
        System.out.println(set.contains(0));
        set.remove(5);
        System.out.println(set.size());
        set.clear();
        set.isEmpty();
        System.out.println(set.size());
    }
}
