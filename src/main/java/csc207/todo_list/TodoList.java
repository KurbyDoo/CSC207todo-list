package main.java.csc207.todo_list;

import javax.swing.*;
import java.util.ArrayList;

public class TodoList {
    final private ArrayList<TodoItem> todoItems;

    public TodoList() {
        this.todoItems = new ArrayList<TodoItem>();
    }

    public void toggleTodo(int i) {
        this.todoItems.get(i).toggleStatus();
    }

    public TodoItem[] getTodos() {
        return this.todoItems.toArray(new TodoItem[0]);
    }

    public int size(){
        return this.todoItems.size();
    }

    public void removeTodo(int i){
        this.todoItems.remove(i);
    }

    public void addTodo(String s){
        this.todoItems.add(new TodoItem());
    }

    public TodoItem getTodo(int i){
        return  this.todoItems.get(i);
    }

}
