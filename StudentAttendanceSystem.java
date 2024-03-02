import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendanceSystem {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Boolean> attendance = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Attendance System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Mark attendance");
            System.out.println("3. View attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, students, attendance);
                    break;
                case 2:
                    markAttendance(scanner, students, attendance);
                    break;
                case 3:
                    viewAttendance(students, attendance);
                    break;
                case 4:
                    System.out.println("Exiting the Student Attendance System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner, ArrayList<String> students, ArrayList<Boolean> attendance) {
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        students.add(studentName);
        attendance.add(false); // Initialize attendance as false (absent) for the new student
        System.out.println(studentName + " added to the list.");
    }

    private static void markAttendance(Scanner scanner, ArrayList<String> students, ArrayList<Boolean> attendance) {
        System.out.print("Enter student name: ");
        String studentName = scanner.next();

        int index = students.indexOf(studentName);
        if (index != -1) {
            System.out.print("Enter attendance (Present/Absent): ");
            String attendanceStatus = scanner.next();

            if (attendanceStatus.equalsIgnoreCase("Present")) {
                attendance.set(index, true);
                System.out.println(studentName + " marked as present.");
            } else if (attendanceStatus.equalsIgnoreCase("Absent")) {
                attendance.set(index, false);
                System.out.println(studentName + " marked as absent.");
            } else {
                System.out.println("Invalid attendance status. Please enter either Present or Absent.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void viewAttendance(ArrayList<String> students, ArrayList<Boolean> attendance) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
        } else {
            System.out.println("Attendance:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i) + ": " + (attendance.get(i) ? "Present" : "Absent"));
            }
        }
    }
}
