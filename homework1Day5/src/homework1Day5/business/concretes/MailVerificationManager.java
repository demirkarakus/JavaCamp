package homework1Day5.business.concretes;

import homework1Day5.business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {

	@Override
	public void sendMail(String email) {
		System.out.println("Verification mail sended to : " + email);
	}

	@Override
	public boolean checkVarificated(String email) {
		return false;
	}

}
