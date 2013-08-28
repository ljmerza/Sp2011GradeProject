public class Phys211
{
	private int numberOfProjects, numberofHWs, numberOfTests, numberOfQuizes;
	private double hwPercent, testPercent, projectPercent, finalPercent, quizPercent;
	private double projectGrade, testGrade, hwGrade, quizGrade;
	private double testAvg, hwAvg, projectAvg, quizAvg;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = (76);

		hwPercent = 25 / totalPoints;
		testPercent = 36 / totalPoints;
		projectPercent = 0 / totalPoints;
		finalPercent = 0 / totalPoints;
		quizPercent = 15 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfTests = 3;
		numberofHWs = 13;
		numberOfProjects = 1;
		numberOfQuizes = 1;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		testGrade = 30+80+55.55;
		hwGrade = 100+100+100+100+100+100+100+100+100+100+100+95.83+78.95;
		projectGrade = 0;
		quizGrade = 69.60;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		projectAvg = (projectGrade / numberOfProjects);
		quizAvg = (quizGrade / numberOfQuizes);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		projectAvg = projectAvg * projectPercent;
		quizAvg = quizAvg * quizPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + projectAvg + quizAvg;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
