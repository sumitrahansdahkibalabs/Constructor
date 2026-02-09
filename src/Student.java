public class Student {
    private String name;
    private int id  = 106;
    private int marks;
    public Student(String a, int c) {
        name = a;
        //id = b;
        marks = c;
    }
    public void eat() {
        System.out.println(name+ " is eating.");
    }
    public void sleep() {
        System.out.println(name+ " is sleeping.");
    }
}
