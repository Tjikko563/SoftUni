import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String courseName = data[0];
            String student = data[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new LinkedList<>());
            }
            courses.get(courseName).add(student);

            input = scanner.nextLine();
        }

        courses.entrySet()
                .stream()
                .sorted((f,s) -> s.getValue().size() - f.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(s -> System.out.println("-- " + s));
                });

    }
}
