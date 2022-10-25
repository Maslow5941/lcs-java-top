package lcs;

public class LCS3 {

	 public static void main(String[] args)
	    {
		String x = "GATACAAAAAAAAAAAAA";
		String y = "ATCABBBBBBBBBBBBBBB";
		int M = x.length();
		int N = y.length();

		int[][] opt = new int[M + 1][N + 1];

		for (int i = 1; i <= M; i++)
		{
		    for (int j = 1; j <= N; j++)
		    {
			if (x.charAt(i - 1) == y.charAt(j - 1))
			{
			    opt[i][j] = opt[i - 1][j - 1] + 1;
			}
			else
			{
			    opt[i][j] = Math.max(opt[i][j - 1], opt[i - 1][j]);
			}
		    }
		}

		System.out.println(opt[M][N]);
	    }

	}


