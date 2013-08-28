public class Math142
{
	private double projectGrade, testGrade, hwGrade, quizGrade;
	private double totalPointsMade;
	private double totalGrade;
	private double totalPoints;

	public void getGrade()
	{
		Math142Maple mathMaple = new Math142Maple();
		
		// enter grading scale
		/********************************************************/
		totalPoints = (500);	
		/********************************************************/
		testGrade = 83+80+65;
		projectGrade = mathMaple.getGrade();
		quizGrade = 10+10+9+7+10+10+8+10+10+6;
		/********************************************************/
		totalPointsMade = testGrade + hwGrade + projectGrade + quizGrade;
		/********************************************************/
		totalGrade = (totalPointsMade / totalPoints)*100;
		/********************************************************/
		int temp2Total = (int)totalGrade;
		double tempTotal = totalGrade * 100;
		int tempIntTotal =  (int)tempTotal % 100;
		
		System.out.print("Math142: ");
		System.out.println(temp2Total + "." + tempIntTotal);
		/********************************************************/

	} // ending of getGrade method
} // ending of DefaultClass
