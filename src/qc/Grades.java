package qc;

public class Grades {
	private double quiz1;
	private double quiz2;
	private double quiz3;
	private double quiz4;
	
	Grades() {
		this(0, 0, 0, 0);
	}

	Grades(double a) {
		this(a, 0, 0, 0);
	}
	
	Grades(double a, double b) {
		this(a, b, 0, 0);
	}
	
	Grades(double a, double b, double c) {
		this(a, b, c, 0);
	}
	
	Grades(double a, double b, double c, double d) {
		setQuiz1(a);
		setQuiz2(b);
		setQuiz3(c);
		setQuiz4(d);
	}
	
	public double getQuiz1() {
		return this.quiz1;
	}
	
	public void setQuiz1(double newScore) {
		this.quiz1 = newScore;
	}

	public double getQuiz2() {
		return this.quiz2;
	}

	public void setQuiz2(double newScore) {
		this.quiz2 = newScore;
	}

	public double getQuiz3() {
		return this.quiz3;
	}

	public void setQuiz3(double newScore) {
		this.quiz3 = newScore;
	}

	public double getQuiz4() {
		return this.quiz4;
	}

	public void setQuiz4(double newScore) {
		this.quiz4 = newScore;
	}
	
	public double calcTotal() {
		double sum;
		sum = getQuiz1()+getQuiz2()+getQuiz3()+getQuiz4();
		return sum;
	}
	
	public double calcAverage() {
		return (calcTotal()/4);
	}
	
	public char calcLetterGrade() {
		char letter;
		double grade = calcAverage();
		
		letter = (grade>=90) ? 'A' : (grade>=80) ? 'B' : (grade>=70) ? 'C' : (grade>=60) ? 'D' : 'F';

		return letter;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		
		aMessage += "Quiz 1: " + getQuiz1() + "\n";
		aMessage += "Quiz 2: " + getQuiz2() + "\n";
		aMessage += "Quiz 3: " + getQuiz3() + "\n";
		aMessage += "Quiz 4: " + getQuiz4() + "\n";
		aMessage += "Total Score: " + calcTotal() + "\n";
		aMessage += "Average Score: " + calcAverage() + "\n";
		aMessage += "Class Grade: " + calcLetterGrade() + "\n";
		
		return aMessage;
	}
	
}
