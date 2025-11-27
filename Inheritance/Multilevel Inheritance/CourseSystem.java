public class CourseSystem {
    public static void main(String[] args) {
        // Basic Course
        Course basicCourse = new Course("Intro to Java", 20);
        System.out.println("=== Basic Course ===");
        basicCourse.displayCourseInfo();

        System.out.println();

        // Online Course
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 40, "Udemy", true);
        System.out.println("=== Online Course ===");
        onlineCourse.displayCourseInfo();

        System.out.println();

        // Paid Online Course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Structures", 50, "Coursera", true, 199.99, 20);
        System.out.println("=== Paid Online Course ===");
        paidCourse.displayCourseInfo();
    }
}
