package wsjava;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "service")
@SOAPBinding(style = Style.RPC)
public class Service {
	@WebResult(name = "resultado")
	public String checkLogin(@WebParam(name = "userName") String userName,
			@WebParam(name = "password") String password) {

		System.out.println("chamou o metodo");
		if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			System.out.println("sucess");
			return "success";
		} else {
			System.out.println("fail");
			return "fail";
		}
	}
}
