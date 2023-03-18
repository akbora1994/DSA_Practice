import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
	
	public static boolean isValid(String s) {

		//I have defined a Map here which contains all the key value pairs..
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        //defined an empty stack here
        Stack<Character> st = new Stack<>();

        //Iterating over the given string..
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i); //taking the current character into a variable here..
            
            //checking here that if the current char is open bracket thn pushing it into the stack..
            if(map.containsValue(c)){
                st.push(c);
            }
            else{
            	//checking if we have a closing bracket but our stack is already empty that means there is no opening bracket for the closed one..
                if(st.isEmpty() || map.get(c)!=st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();

   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		boolean x = isValid(s);
		System.out.println(x);
		
	}

}
