package Adapters;

import java.time.LocalDate;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			
			boolean result = kpsPublic.TCKimlikNoDogrula(
					Long.valueOf(customer.getNationalityId()),
					customer.getFirstName(),
					customer.getLastName(),
					customer.getDateOfBirth()
					);
			return result;
			
		} catch (Exception e) {
			
		}
		
		return false;
	}

}
