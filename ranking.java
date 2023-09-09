import java.util.Scanner;
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
class ranking {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of games you played on the server : ");
		int game = sc.nextInt();
		
		System.out.print("Enter the number of players are on the server : ");
		int n = sc.nextInt();
		sc.close();

		int score[] = new int[game];
		int players[] = new int[n];
		
		System.out.println("Enter the scores of the games you played : ");
		for(int i = 0; i < game; i++)
			score[i] = sc.nextInt();
		
		System.out.println("Enter the scores of the top players : ");
		for(int i = 0; i < n; i++)
			players[i] = sc.nextInt();
		
		int c = 1;
		
		for(int i = 0; i < game; i++) {
			for(int j = 1; j < n; j++) {
				if(players[j] > score[i]) {
					if(players[j] != players[j - 1])
						c++;
					if(j == n - 1 || players[j + 1] < score[i])
						c++;
				}
				else if(players[j] == score[i]) {
					if(players[j] != players[j - 1])
						c++;
				}
				else
					break;
			}
			System.out.println("Rank after game " + i + " : " + c);
			c = 1;
		}
	}
}
