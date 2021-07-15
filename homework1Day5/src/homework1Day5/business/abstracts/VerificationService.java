package homework1Day5.business.abstracts;

public interface VerificationService {
	void sendMail(String email);
	boolean checkVarificated(String email);
	
}
