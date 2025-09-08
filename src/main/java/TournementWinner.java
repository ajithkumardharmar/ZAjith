import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TournementWinner {
	public static void main(String[] args) {
        List<Integer> potentials = Arrays.asList(1, 3, 2, 4, 5);
        int k = 2;
        System.out.println(findWinner(potentials, k)); // prints 3
    }

	private static int findWinner(List<Integer> potentials, int k) {
		
		int n = potentials.size();
		
		if(k>=n-1) {
			return Collections.max(potentials);
		}
		
		ArrayDeque<Integer> dq = new ArrayDeque<>(potentials);
		
		int champion = dq.pollFirst();
		int consecutiveWin = 0;
		
		while(true) {
			int challenger = dq.pollFirst();
			if(champion>=challenger) {
				consecutiveWin++;
				dq.addLast(challenger);
			}else {
				dq.addLast(champion);
				champion = challenger;
				consecutiveWin =1;
			}
			if(k==consecutiveWin) {
				return champion;
			}
		}
	}
}
