public class Elct101
{
	private int numberofHWs, numberOfTests, numberOfQuizes, numberOfLabs, numberOfAttendance, numberOfThreeZeroTwo;
	private double hwPercent, testPercent, finalPercent, quizPercent, labPercent, attendancePercent, threeZeroTwoPercent;
	private double testGrade, hwGrade, quizGrade, labGrade, attendanceGrade, threeZeroTwoGrade;
	private double testAvg, hwAvg, quizAvg, labAvg, attendanceAvg, threeZeroTwoAverage;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = (66);

		this.hwPercent = 14 / this.totalPoints;
		this.testPercent = 20 / this.totalPoints;
		this.finalPercent = 0 / this.totalPoints;
		this.quizPercent = 6 / this.totalPoints;
		this.attendancePercent = 5 / this.totalPoints;
		this.labPercent = 16 / this.totalPoints;
		this.threeZeroTwoPercent = 5 / this.totalPoints;
		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		this.numberOfTests = 1;
		this.numberofHWs = 3;
		this.numberOfQuizes = 3;
		this.numberOfLabs = 4;
		this.numberOfAttendance = 1;
		this.numberOfThreeZeroTwo = 1;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		this.testGrade = 103;
		this.hwGrade = 86.957+100+146.94;
		this.quizGrade = 77.5+90.7407+72.0588;
		this.labGrade = 94.55+96.67+94.54+92;
		this.attendanceGrade = 100;
		this.threeZeroTwoGrade = 100;

		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = (testGrade / numberOfTests);
		hwAvg = (hwGrade / numberofHWs);
		quizAvg = (quizGrade / numberOfQuizes);
		labAvg = (labGrade / numberOfLabs);
		attendanceAvg = (attendanceGrade / numberOfAttendance);
		this.threeZeroTwoAverage = (this.threeZeroTwoGrade / this.numberOfThreeZeroTwo);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		testAvg = testAvg * testPercent;
		hwAvg = hwAvg * hwPercent;
		quizAvg = quizAvg * quizPercent;
		labAvg = labAvg * labPercent;
		attendanceAvg = attendanceAvg * attendancePercent;
		this.threeZeroTwoAverage = this.threeZeroTwoAverage * this.threeZeroTwoPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = testAvg + hwAvg + quizAvg + labAvg + attendanceAvg + this.threeZeroTwoAverage;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
