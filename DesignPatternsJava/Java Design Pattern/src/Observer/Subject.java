package Observer;

/* 	
  	This interface is the subject interface which used to
 	register as observers and also to remove themselves from being observers
 */

public interface Subject {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
	
	String getState();
}
