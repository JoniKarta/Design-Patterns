package Observer;

public class MainApplication {
	// The observer pattern define one to many relationship between a set of objects 
	// When the state of object change, all of its dependents gets notified
	public static void main(String[] args) {
		MessageBoard calculusMessageBoard = new MessageBoard();
		MessageBoard physicsMessageBoard = new MessageBoard();
		
		new Student(calculusMessageBoard,"Ron","Kage");
		new Student(calculusMessageBoard, "Jane","Doe");
		new Student(physicsMessageBoard, "David","Copper");
		new Student(physicsMessageBoard, "Julia", "Perish");
		
		calculusMessageBoard.setState("Calculus at class 404 moved to 505");
		physicsMessageBoard.setState("The physics class has been postpone untl futher notice!");
		
	}
}
