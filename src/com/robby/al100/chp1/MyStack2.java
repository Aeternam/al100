package com.robby.al100.chp1;

import java.util.Stack;


public class MyStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            this.stackMin.push(newNum);
        } else {
            int oldMin = stackMin.peek();
            stackMin.push(oldMin);
        }
        this.stackData.push(newNum);
    }

    public void pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        this.stackData.pop();
        this.stackMin.pop();

    }
    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        System.out.println("chp1");
    }
}
