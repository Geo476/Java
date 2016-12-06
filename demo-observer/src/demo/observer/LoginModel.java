package demo.observer;

public class LoginModel extends Observable<String>{
	
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
		this.notifyObservers(login);
	}
	
	
	
	
	
	
	
	
	
	

}
