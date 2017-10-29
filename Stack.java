
package assignment5;
import java.util.ArrayList;

public class Stack {

	    private ArrayList<Integer> Stack = null;
	  
	    public Stack(){
	        Stack = new ArrayList<Integer>();
	    }
	  
	    public void push(int value){
	        System.out.println("Push " + value + " in Stack");
	        Stack.add(value);
	    }
	  
	    public void pop() {
	        if(!isEmpty()){
	        System.out.println("Pop " + Stack.get(Stack.size() - 1) + " from Stack");
	        Stack.rem(Stack.size() - 1);
	        }
	    }
	  
	    public boolean isEmpty(){
	        if(Stack.size() == 0) return true;
	        else return false;
	    }
	  
	    public int top() {
	        if(!isEmpty()){
	            return Stack.get(Stack.size() - 1);
	        }
			return 0;
	    }
	  
	    public static void main(String[] args) {
	        Stack st = new Stack();
	        st.push(1);
	        st.push(2);
	        st.push(3);
	      
	       
	            System.out.println("Top entry in Stack :" + st.top());
	       
	      
	       
	        st.pop();
	        st.pop();
	        st.pop();
	        st.pop();
	    }
	}

