import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int T, N;
	static int[][] dp, stickers;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			dp = new int[2][N];
			stickers = new int[2][N];
			
			for(int i=0; i<2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					stickers[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp[0][0] = stickers[0][0];
			dp[1][0] = stickers[1][0];
			
			if(N != 1) {
				dp[0][1] = stickers[0][1] + stickers[1][0];
				dp[1][1] = stickers[0][0] + stickers[1][1];
				
				for(int i=2; i<N; i++) {
					dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2])+stickers[0][i];
					dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2])+stickers[1][i];
				}
			}
			System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));
		}
	}
}
