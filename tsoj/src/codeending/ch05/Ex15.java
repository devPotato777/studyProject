package codeending.ch05;

public class Ex15 {

	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = { ".-", "-...", "-.-.", "-..", "."
						 , "..-.", "--.", "....", "..", ".---"
						 , "-.-", ".-..", "--", "-.", "---"
						 , ".--.", "--.-", ".-.", "...", "-"
						 , "..-", "...-", ".--", "-..-", "-.--"
						 , "--.." };
		
		String result = "";
		
		for(int i=0; i<source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source : "+ source);
		System.out.println("morse : "+ result);
		
	}

}
