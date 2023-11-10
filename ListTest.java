import java.util.*;





public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Maria");
        names.add("Tomas");
        System.out.println(names);

        names.add("David");
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);
        List<String> otherNames = new ArrayList<>();
        otherNames.add("ophelia");
        otherNames.add("hamlet");
        System.out.println(Collections.disjoint(names, otherNames));

    }
}
