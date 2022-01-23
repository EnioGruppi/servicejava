package wsjava;

import javax.xml.ws.Endpoint;

public class IniciaService {

	public static void main(String[] args) {
		String port = System.getenv("PORT");
		String host = "http://0.0.0.0:";
		String uri = "/service?WSDL";
		String url = host + port + uri;
		//String url = "http://127.0.0.1:8080/wsjava/service?WSDL";
		Service novoservice = new Service();
		Endpoint.publish(url, novoservice);
	}

}
