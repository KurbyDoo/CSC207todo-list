package csc207.todo_list;

public class TodoItem {
    public final String DONE = " (done)";
    private Boolean completed = false;
    private String whatTodo = "";

    public TodoItem(String whatTodo) {
        this.whatTodo = whatTodo;
    }

    public void toggleStatus() {
         completed = true;
    }

    public boolean getStatus() {
        return completed;
    }

    public String toString() {
        return whatTodo + DONE;
    }

    public int hashCode() {
        return whatTodo.hashCode();
    }

    public boolean equals(Object obj) {
        return whatTodo.equals(obj.toString());
    }
}
