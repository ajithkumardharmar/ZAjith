package Com.practice.July2025;

import java.util.Stack;


public class TestStack {
	public static void main(String[] args) {
		
	}
}

class MinMaxStack {
	
	private Stack<Integer> mainStack;
	private Stack<Integer> minStack ;
	private Stack<Integer> maxStack ;
	
	public MinMaxStack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
		maxStack = new Stack<>();
	}
	
	public void push(Integer num) {
		mainStack.push(num);
		if(minStack.isEmpty() || num <= minStack.peek()) {
			minStack.push(num);
		}
		if(maxStack.isEmpty() || num>= maxStack.peek()) {
			maxStack.push(num);
		}
	}
	
	public int pop() {
		if(mainStack.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		int popId = mainStack.pop();
		
		if(popId == minStack.peek()) {
			minStack.pop();
		}
		if(popId== maxStack.peek()) {
			maxStack.pop();
		}
		return popId;
	}
	
	  // Get Min
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    // Get Max
    public int getMax() {
        if (maxStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return maxStack.peek();
    }

    // Top
    public int top() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return mainStack.peek();
    }
	
}