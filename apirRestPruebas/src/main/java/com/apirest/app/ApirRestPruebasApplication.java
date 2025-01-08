package com.apirest.app;

import java.net.URL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ws.att.impl.AamMethodsImplService;
import com.ws.att.interf.AamMethods;
import com.ws.att.interf.GenericRequestCodeRequest;
import com.ws.att.interf.GenericRequestCodeResponse;

@SpringBootApplication
public class ApirRestPruebasApplication 
implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(ApirRestPruebasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//AamMethodsImplService llamado =  new AamMethodsImplService(new URL("https://appsaservices.mx.att.com/AamWS/AamMethodsImpl?wsdl"));
//		AamMethods llamado =  new AamMethodsImplService(new URL("https://appsaservices.mx.att.com/AamWS/AamMethodsImpl?wsdl")).getAamMethodsImplPort();
//		GenericRequestCodeRequest genericRequestCodeRequest = new GenericRequestCodeRequest();
//		genericRequestCodeRequest.setMaxIntentosR(-1);
//		genericRequestCodeRequest.setMaxIntentosV(-1);
//		genericRequestCodeRequest.setNombreSistema("ACPM");
//		genericRequestCodeRequest.setNumeroDn("5566237338");
//		genericRequestCodeRequest.setTipoNotificacion("SMS");
//		genericRequestCodeRequest.setTxtMsg("El codigo para validar es : ######");
//		genericRequestCodeRequest.setUsuario("");
//		genericRequestCodeRequest.setVigencia(5);
//		GenericRequestCodeResponse response = llamado.genericRequestCode(genericRequestCodeRequest);
//		System.out.println(response.toString());
		
	}

}
