package demo.observer;

public class LoginView implements Observer<String>{

	public void print() {
		System.out.println("Je suis LoginView, Ok ?");
	}

	@Override
	public void update(String obj) {
		System.out.println("--------------------");
		System.out.println("LoginView : " + obj);
		System.out.println("\\o/");
		System.out.println("--------------------");

	}

	
	
	

}
