import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = List.of("José", "Martín", "Lutero", "Andrés", "Juana", "Balam");
        printOnlyLongNames(names, 4);
    }

    public static void printOddNames(List<String> names) {
        int counter = 1;
        for(String name : names) {
            if(!(counter % 2 == 0)){
                System.out.println(name);
            }
            counter++;
        }
    }
    public static void printFilteredNames(List<String> names, String search) {
        names.stream()
                .filter(element -> element.contains(search))
                .forEach(System.out::println);
    }
    public static void printOnlyLongNames(List<String> names, int length) {
        names.stream()
                .filter(name -> name.length() > length)
                .forEach(System.out::println);
    }
}
