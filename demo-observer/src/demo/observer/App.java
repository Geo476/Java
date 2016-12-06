package demo.observer;

public class App {

	public static void main(String[] args) {
		LoginModel model = new LoginModel();
		LoginView view = new LoginView();
		model.addObserver(view);
		
		view.print();
		
		
		// un jour
		model.setLogin("Julien");
		model.setLogin("Hugues");

	}

}