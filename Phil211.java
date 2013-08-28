public class Phil211
{
	private int    numberOfQuizes, numberOfProjects;
	private double   projectPercent, finalPercent,  quizPercent;
	private double projectGrade,   quizGrade ;
	private double   projectAvg, quizAvg;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = 100;

		finalPercent = 40 / totalPoints;
		quizPercent = 50 / totalPoints;
		projectPercent = 10 / totalPoints;
		/********************************************************/
		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfQuizes = 1;
		numberOfProjects = 1;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		quizGrade = ((8+19+9)/(8+24+16))*100;
		projectGrade = 100;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		quizAvg = (quizGrade / numberOfQuizes);
		projectAvg = (projectGrade / numberOfProjects);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		quizAvg = quizAvg * quizPercent;
		projectAvg = projectAvg * projectPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = (75*.4) + (80*.5) + (100*.1);
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
