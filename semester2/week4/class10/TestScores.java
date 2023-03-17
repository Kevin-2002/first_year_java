public class TestScores
{
	//member var
	private int score;
	private double average;

	public int setScore(int known)
	{
		return score = known;
	}

	public double getAverage()
	{
		return average;
	}

	public double Average(int score1, int score2, int score3)
	{
		average = (score1*score2*score3)/3;

		return average;
	}
}