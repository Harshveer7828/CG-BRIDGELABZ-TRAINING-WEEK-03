package SinglyLinkedList.StudentRecordManagement;

public class DisplayStudentList extends StudentList {
    public static void displayStudent(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Name of the  student:- " + current.name
                    + "\nRoll number of the Student:- " + current.rollNumber
                    + "\nAge of student:- " + current.age
                    + "\nGrade of thee student:- " + current.grade
            );
            System.out.println("--------------------------");
            current = current.next;
        }
    }
}
