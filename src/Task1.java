public class Task1 {
	
	static String beginWord = "";
	static String finalWord = "";
	static String alphabet = new String("abcdefghijklmnopqrstuvwxyz");

	public static void main(String[] args) {
		System.out.println(replaceLetter("Hello ."));
	}
	
	public static String replaceLetter(String sentence) {
		beginWord = sentence.toLowerCase();
		char[] beginChar = beginWord.toCharArray();
		
		for(char c: beginChar) {
			String temp = Character.toString(c);
			
			if(!alphabet.contains(temp)) {
				continue;
			} else {
				finalWord += ((alphabet.indexOf(c)+1) + " ");
			}
			
		}
		
		return finalWord;
	}

}
