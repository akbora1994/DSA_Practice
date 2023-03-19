import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int romanToInt(String s) {
        
        //defined a Map here which contains all the key value pair..
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        //Now, we'll have a result having the value that corresponds to the last character of the string..
        int result = map.get(s.charAt(s.length()-1));
        
        //Iterating over the string starting from the second last character..
        for(int i = s.length()-2; i>=0; i--){
			/*comparing the values for character at the ith posn & ith + 1 posn
			if the value of ith posn is lesser than the value of ith + 1 posn then 
			we substract from our result otherwise we do addition..*/
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result-=map.get(s.charAt(i));
            }
            else{
                  result+=map.get(s.charAt(i));
            }
        }
          return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "MCMXCIV";
        int res = romanToInt(s);
        System.out.println(res);
	}

}
