import java.util.Stack;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Main {
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args){
		System.out.println(min);
		Stack stack=new Stack();
		stackPush(stack,5);System.out.println(min);
		stackPush(stack,7);System.out.println(min);
		stackPush(stack,4);System.out.println(min);
		stackPush(stack,4);System.out.println(min);
		System.out.println(stackPop(stack));
		System.out.println(stackPop(stack));
		System.out.println(stackPop(stack));
		System.out.println(stackPop(stack));
		
	}

//Design a stack which supports finding the minimum value in O(1) time. 
//pop,push,top should be also O(1)
	public static void stackPush(Stack stack,int x){
		stack.push(x-min);
		if(x<min){
			min=x;
		}
	}
	
	public static int stackPop(Stack stack){
		int x=(int) stack.pop();
		if(x<0){
			min -= x;
		}
		return x+min;
	}
	
}
