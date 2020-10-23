package Observer;

import java.util.ArrayList;

public class MessageBoard implements Subject{
	
	private ArrayList<Observer> observableList; 
	private String state;
	
	public MessageBoard() {
		observableList = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
		observableList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observableList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observableList.forEach(e -> e.update());
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}

}
