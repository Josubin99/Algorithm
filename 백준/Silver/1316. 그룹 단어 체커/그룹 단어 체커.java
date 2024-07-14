import java.util.*;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> words = new ArrayList<String>();
	
	public static Boolean check (String past, String start, String end, int index) {
		char alphabet = end.charAt(index);
		
		if(index!=0 && past.contains(alphabet+"")) {
			if(!((start.charAt(index-1)+"").equals(alphabet+""))) {
				return false;
			}
		}
		
		if(start.equals(end)) {
			return true;
		}
		
		return check(start, start+end.charAt(index+1), end, index+1);
	}
	
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		
		int cnt=0;
		for(int i=0; i<N; i++) {
			String word = sc.next();
			if(check("", word.charAt(0)+"", word, 0)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);	
		
	}

}
