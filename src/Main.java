public class Main {
    public static void main(String[] args) {
        Student st = new Student("Preety", 90);
        st.eat();
        st.sleep();
        System.out.println();

        Employee em1 = new Employee("John Doe", 101,"HR");
        Employee em2 = new Employee("Jane Smith", 102, "Finance");
        Employee em3 = new Employee("Alice Johnson", 103,"IT");
        em1.displayDetails();
        System.out.println();
        em2.displayDetails();
        System.out.println();
        em3.displayDetails();
        System.out.println();

        Car c1 = new Car("Blue", "Toyota");
        System.out.println("Car Description: " +c1.color+ " " +c1.model);
        System.out.println();

        Product p1 = new Product("Laptop",1200.5,"Electronics");
        p1.displayDetails();
        System.out.println();

        Book book1 = new Book("The Catcher in the Rye", "J.D Sallinger", 10.99 );
        Book book2 = new Book("To kill a Mocking Bird", "Harper Lee", 12.50);
        Book book3 = new Book("1984", "George Orwell", 15.75);
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
        System.out.println();

        Notification nt1 = new Notification();
        Notification nt2 = new Notification("Meeting at 10 AM.");
        Notification nt3 = new Notification("Submit Report", 2);
        nt1.displayNotification();
        nt2.displayNotification();
        nt3.displayNotification();
        System.out.println();

        Course cs1 = new Course("Introduction to Java");
        Course cs2 = new Course("Advanced Java", "JAVA102");
        Course cs3 = new Course("Data Structures", "COMPSCI303", 30);
        cs1.displayCourseInfo();
        System.out.println();
        cs2.displayCourseInfo();
        System.out.println();
        cs3.displayCourseInfo();
        System.out.println();

        HotelRoom hr1 = new HotelRoom("Standard");
        HotelRoom hr2 = new HotelRoom("Deluxe", 150.0);
        HotelRoom hr3 = new HotelRoom("Suite", 300.0, 101);
        hr1.roomDetails();
        System.out.println();
        hr2.roomDetails();
        System.out.println();
        hr3.roomDetails();
        System.out.println();
    }
}