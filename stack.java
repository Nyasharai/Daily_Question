// implement stack using array list
import java.util.ArrayList;


public class stack{
    ArrayList<Integer> stack;
    int p;

    stack(int p){
        stack = new ArrayList<>();
        this.p = p;
    }
    public void push(int n){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            stack.add(n);
        }
    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return stack.remove(stack.size() - 1);
        }
    }

    public boolean isFull(){
        return stack.size() == p;
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return stack.get(stack.size() - 1);
        }
    }

    public void printStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        stack sc = new stack(6);
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        sc.push(60);
        System.out.println("The stack is: ");
        sc.printStack();
        int e = sc.pop();
        System.out.println("Popped element is: "+ e);
        sc.printStack();
        System.out.println("top element is: "+ sc.peek());
        sc.push(70);
        sc.printStack();
        sc.push(80);
    }
}
