package SinglyLinkedList.StudentRecordManagement;

import java.util.ArrayList;

// Node class represents the user
public class Node {
    // Attributes or the data which contains node data
    int rollNumber;
    int age;
    String name;
    String grade;
    Node next;

    Node(int rollNumber,int age, String name, String grade){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.next = null;
    }
}
