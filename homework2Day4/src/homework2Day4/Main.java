package homework2Day4;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "VEHBİ ERBİL", "KARAKUŞ", 1986, "111111111111"));
		
		System.out.println("");
		
		/*
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("46072366712"),
				"VEHBİ ERBİL",
				"KARAKUŞ",
				1986);
		System.out.println("Doğrulama : " + (result ? "Başarılı Giriş" : "Başarısız Giriş"));
		*/

	}

}
