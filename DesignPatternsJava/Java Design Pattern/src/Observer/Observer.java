package Observer;

/*
 	All potential observers need to implement the observer interface.
 	This is a functional interface that gets called when the subject's state changes.
 */
public interface Observer {

	void update();
}
