package SinglyLinkedList.StudentRecordManagement;


public class StudentList{
    public Node head;

    // Method to add the student at the beginning
    public void addStudent(int rollNumber, int age, String name, String grade){
        Node newNode = new Node(rollNumber, age, name, grade);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

}
