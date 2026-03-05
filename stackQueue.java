// Problem 4:
// Implement stack and queue.

import java.util.Scanner;

class Stack {
    int arr[] = new int[5];
    int top = -1;

    void push(int x) {
        if(top == 4)
            System.out.println("Overflow");
        else {
            arr[++top] = x;
        }
    }

    void pop() {
        if(top == -1)
            System.out.println("Underflow");
        else
            System.out.println("Popped = " + arr[top--]);
    }
}

class Queue {
    int arr[] = new int[5];
    int front = 0, rear = -1;

    void insert(int x) {
        if(rear == 4)
            System.out.println("Overflow");
        else
            arr[++rear] = x;
    }

    void delete() {
        if(front > rear)
            System.out.println("Underflow");
        else
            System.out.println("Deleted = " + arr[front++]);
    }
}

public class StackQueueDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.pop();

        Queue q = new Queue();
        q.insert(30);
        q.insert(40);
        q.delete();
    }
}