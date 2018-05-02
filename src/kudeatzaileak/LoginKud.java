package kudeatzaileak;


public class LoginKud {

private static final LoginKud loginKud = new LoginKud();
	
	public static LoginKud getInstantzia(){
		return loginKud;
	}

	private LoginKud() {
		// Singleton patroia
	}
	
}
