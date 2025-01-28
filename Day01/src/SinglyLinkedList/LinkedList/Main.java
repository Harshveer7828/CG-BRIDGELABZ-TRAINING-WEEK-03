package SinglyLinkedList.LinkedList;

import SinglyLinkedList.StudentRecordManagement.DisplayStudentList;
import SinglyLinkedList.StudentRecordManagement.StudentList;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(21,22,"Harsh veer singh","A");
        list.addStudent(22,22,"Om Tiwari","B");
        DisplayStudentList.displayStudent(list.head);
    }
}
