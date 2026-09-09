public class Stack {
    private int count;
    private final String[] stackItems;

    public Stack() {
        stackItems = new String[5];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String name) {
        stackItems[count++] = name;
    }

    public String pop() {
        if(isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        return stackItems[--count];
    }

    public String peek() {
        if(isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        String name = stackItems[--count];
        count++;
        return name;
    }

    public int search(String name) {
       for(int index = 0; index < stackItems.length; index++){
           if(stackItems[index] == name){
               return index;
           }
       }
        return -1;
    }
}
