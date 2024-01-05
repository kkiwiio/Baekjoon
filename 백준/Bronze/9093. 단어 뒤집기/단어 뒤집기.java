import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] sentence = br.readLine().split(" ");
			for(int j = 0; j < sentence.length; j++) {
				StringBuilder sb = new StringBuilder(sentence[j]);
                System.out.print(sb.reverse().toString() + " ");
			}
			
			System.out.println();
		}
	}
}
