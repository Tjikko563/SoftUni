package Generic_Scale;

class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("a", "c");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(13, 5);
        System.out.println(integerScale.getHeavier());
    }
}
