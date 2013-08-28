public class Phys211L
{
	private int numberOfPrelimLabs, numberOfFinalLabs, numberOfOralReports, numberOfOralPres, numberOfClassPart;
	private double prelimLabsPercent, finalLabsPercent, oralReportsPercent, oralPresPercent, classPartPercent;
	private double prelimLabsGrade, finalLabsGrade, oralReportsGrade, oralPresGrade, classPartGrade;
	private double prelimLabsAvg, finalLabsAvg, oralReportsAvg, oralPresAvg, classPartAvg;
	private double totalGrade;
	private double totalPoints;

	//prelimLabs, finalLabs, oralReports, oralPres, classPart

	public void getGrade()
	{
		// enter grading scale
		/********************************************************/
		totalPoints = (120);
		prelimLabsPercent = (60 / totalPoints); 
		finalLabsPercent = (60 / totalPoints);

		/********************************************************/

		// enter number of tests/hws/projects/quizes
		/********************************************************/
		numberOfPrelimLabs = 6;
		numberOfFinalLabs = 2;;
		/********************************************************/

		// enter grades of tests/hws/projects/quizes
		/********************************************************/
		prelimLabsGrade = 100+100+100+100+100+100;
		finalLabsGrade = 93.33 + 90;
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		prelimLabsAvg = (prelimLabsGrade / numberOfPrelimLabs);
		finalLabsAvg = (finalLabsGrade / numberOfFinalLabs);
		/********************************************************/

		// finding averages of grade scales
		/********************************************************/
		prelimLabsAvg = prelimLabsAvg * prelimLabsPercent;
		finalLabsAvg = finalLabsAvg * finalLabsPercent;
		/********************************************************/

		// add all grades and display final grade
		/********************************************************/
		totalGrade = prelimLabsAvg + finalLabsAvg;
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
