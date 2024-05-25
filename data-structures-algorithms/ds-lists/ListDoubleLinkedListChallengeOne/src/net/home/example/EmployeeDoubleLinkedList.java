package net.home.example;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = null;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if(head == null) return false;

        EmployeeNode current = head;

        while(current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if(current == null) return false;

        EmployeeNode node = new EmployeeNode(newEmployee);
        //EmployeeNode previousNode = new Employee(existingEmployee);

        node.setPrevious(current.getPrevious());
        node.setNext(current);

        current.setPrevious(node);

        if(head == current) {
            head = node;
        } else {
            node.getPrevious().setNext(node);
        }

        size++;

        return true;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {

        if(isEmpty()) return null;
        EmployeeNode removedNode = head;
        if(head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromEnd() {

        if(isEmpty()) return null;
        EmployeeNode removedNode = tail;
        if(tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;

    }

}
