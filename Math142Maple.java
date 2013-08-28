public class Math142Maple
{
	private int numberOfQuiz, numberofAssignment, numberOfProject, numberOfAttendance;
	private double quizPercent, assignmentPercent, projectPercent, attendancePercent;
	private double quizGrade, assignmentGrade, projectGrade, attendanceGrade;
	private double quizAvg, assignmentAvg, projectAvg, attendanceAvg;
	private double totalGrade;
	private double totalPoints;

	public double getGrade()
	
	{
		// enter grading scale
		/********************************************************/
		totalPoints = 100;

		quizPercent = 30 / totalPoints;
		assignmentPercent = 40 / totalPoints;
		projectPercent = 20 / totalPoints;
		attendancePercent = 10 / totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfQuiz = 2;
		numberofAssignment = 5;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		quizGrade = 90+63.33;
		assignmentGrade = 91.67+100+100+100+91.67;
		projectGrade = 61;
		attendanceGrade = 100;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		quizAvg = (quizGrade / numberOfQuiz);
		assignmentAvg = (assignmentGrade / numberofAssignment);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		quizAvg = quizAvg * quizPercent;
		projectAvg = assignmentAvg * assignmentPercent;
		assignmentAvg = assignmentAvg * projectPercent;
		attendanceAvg = attendanceAvg * attendancePercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = quizAvg + projectAvg + assignmentAvg + attendanceAvg;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println("Maple Grade: " + temp2Total + "." + tempIntTotal);
		return temp2Total;
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
