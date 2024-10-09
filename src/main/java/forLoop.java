public class forLoop {
    public static void main(String[] args) {
        sayHello("David", 32);
        String[] students = {"Leonardo", "Jorge", "Paquito"};
        sayHelloToStudents(students);
    }

    public static void sayHello(String name, int age) {
        String result = String.format("Hello %s you are %s years old", name, age);
        System.out.println(result);
    }

    public static void sayHelloToStudents(String[] names) {
        for(String name:names) {
            String message = String.format("Hello %s", name);
            System.out.println(message);
        }
    }
}
