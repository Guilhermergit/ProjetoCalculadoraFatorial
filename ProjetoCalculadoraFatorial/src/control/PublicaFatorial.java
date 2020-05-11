package control;

import javax.xml.ws.Endpoint;

public class PublicaFatorial {
		public static void main (String[] args) {
			Endpoint.publish("http://localhost:10000/calculafatorial" , new CalculaFatorial());
		}
}
