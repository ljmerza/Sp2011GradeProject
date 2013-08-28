public class Csce146
{
	private double projectGrade, testGrade, hwGrade, quizGrade;
	private double totalPointsMade;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = (850);
		/********************************************************/
		testGrade = 84+103.5;
		hwGrade = 35+35+35+28+35+35+40;
		projectGrade = 20+20+20+19+17+20+20+20+20+20;
		quizGrade = 50+50;
		/********************************************************/
		totalPointsMade = testGrade + hwGrade + projectGrade + quizGrade;
		/********************************************************/
		totalGrade = (totalPointsMade / totalPoints)*100;
		/********************************************************/
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
