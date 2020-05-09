import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		List<Word> words = new ArrayList<Word>();
		
		for(int i = 0; i < input; i++) {
			String temp = br.readLine();
			words.add(new Word(temp, temp.length()));
		}
		
		
		Comparator<Word> sortWord = new Comparator<Word>() {
			@Override
			public int compare(Word w1, Word w2) {
				if(w1.getLength() < w2.getLength()) {
					return -1;
				}
				else if(w1.getLength() > w2.getLength()) {
					return 1;
				}
				else { //같을 경우
					return w1.getWord().compareTo(w2.getWord());
				}
			}
			
		};
		
		Collections.sort(words, sortWord);
		
		String prev = "";
		
		for(Word temp : words) {
			String cur = temp.getWord();
			if(!prev.equals(cur))
				System.out.println(cur);
			prev = cur;
		}
		
	}
	
	static class Word{
		private String word;
		private int length;
		
		public Word(String newWord, int newLength){
			this.word = newWord;
			this.length = newLength;
		}
		
		public void setWord(String s) {
			this.word = s;
		}
		
		public void setLength(int l) {
			this.length = l;
		}
		
		public String getWord() {
			return this.word;
		}
		
		public int getLength() {
			return this.length;
		}
	}

}
