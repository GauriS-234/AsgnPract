package Inheritance;

class Course {
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;

    public OnlineCourse(String courseName, int duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Platform: " + platform);
    }
}

class CourseTest {
    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse("Java Programming", 8, "Udemy");
        oc.displayCourseInfo();
    }
}

