public class ThisAndConstructorExamples {

    String name;
    int age;

    // Constructor to initialize object
    public ThisAndConstructorExamples(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void run() {
        ThisAndConstructorExamples person = new ThisAndConstructorExamples("Ziad", 25);
        person.printInfo();
    }
}
