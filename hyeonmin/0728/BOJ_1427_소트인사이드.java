import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427_��Ʈ�λ��̵� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] A = br.readLine().toCharArray();
		Arrays.sort(A);
		StringBuilder answer = new StringBuilder(new String(A)).reverse();
		System.out.println(answer);
	}
}
