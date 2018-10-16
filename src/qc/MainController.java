package qc;

public class MainController {
	
	public static void main(String[] args) {
		ConsoleView aView = new ConsoleView();
		Grades myGrades = new Grades(75, 80, 90, 85);
		aView.print(myGrades.toString());
	}
}
