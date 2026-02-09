 // CONSTRUCTOR CHAINING USING this().

 public class Course {
        String courseName;
        String courseCode;
        int enrollmentLimit;
        public Course(String courseName) {
            this (courseName, "UNSET", 100);
        }
        public Course (String courseName, String courseCode) {
            this (courseName, courseCode,100);
        }
        public Course (String courseName, String courseCode, int enrollmentLimit) {
            this.courseName = courseName;
            this.courseCode = courseCode;
            this.enrollmentLimit = enrollmentLimit;
        }
        public void displayCourseInfo() {
            System.out.println("Course Name: " +courseName);
            System.out.println("Course Code: " +courseCode);
            System.out.println("Enrollment Limit: " +enrollmentLimit);
        }
}
