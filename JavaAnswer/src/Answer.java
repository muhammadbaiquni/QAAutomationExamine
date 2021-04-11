import java.util.*;

class Solution {
	
	private String input;
	
	public Solution() {
		
	}
	
	public Solution(String input) {
		this.input = input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public void ask() {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Input: ");
			this.input = scanner.nextLine();
		}
		finally {
			scanner.close();
		}
	}
	
	public void answer() throws Exception {
		if(this.input.length() <= 0) {
			throw new Exception("Input cannot be empty or null");
		}
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < this.input.length(); i++) {
			char key = this.input.charAt(i);
			
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, ++value);
			}
			else {
				map.put(key, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(char key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
	}	
}

public class Answer {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		try {
			solution.ask();
			solution.answer();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
