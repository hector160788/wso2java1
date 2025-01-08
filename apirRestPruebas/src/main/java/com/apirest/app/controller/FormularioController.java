package com.apirest.app.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.service.annotation.GetExchange;

import com.apirest.app.dto.AccountResponse;
import com.apirest.app.dto.DatosPrincipalesDTO;
import com.apirest.app.dto.RequestOrder5G;
import com.apirest.app.dto.ResponseGenerico;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ws.att.impl.AamMethodsImplService;
import com.ws.att.interf.AamMethods;
import com.ws.att.interf.GenericRequestCodeRequest;
import com.ws.att.interf.GenericRequestCodeResponse;

@RestController
public class FormularioController {

	@GetMapping(path = "/saludo")
	public String saludo() {
		return "exito en el llamado";
	}
	
	@PostMapping(value = {"/altadatos"})
	public ResponseEntity<ResponseGenerico> altaDatos(@RequestBody RequestOrder5G datos) {
		System.out.println(datos.toString());
		ResponseGenerico response = new ResponseGenerico();
		response.setCode("00");
		response.setMessageCode("success");

		return ResponseEntity.ok(response);

	}
	
//	@Autowired
//	private RestClient defaultClient;
//	@GetMapping(value = "/K2V_Customer_Search_Digital_Seat/1.0.0/K2V_Customer_Search_Digital_Seat")
////	@GetMapping(value = "/saludo")
//	public Object holaMundo(@RequestParam(value = "MDN") String MDN) throws MalformedURLException {
//		System.out.println("-------------- "+MDN);
//		 ObjectMapper objectMapper = new ObjectMapper();
		
//		Object response = defaultClient.get()
//				.uri("https://gateway-am-uat.mx.att.com:8243/K2V_Customer_Search_Digital_Seat/1.0.0/K2V_Customer_Search_Digital_Seat?MDN=5566237338")
//				.header("Authorization", "Bearer eyJ4NXQiOiJaalV4TVdNM01XRm1aREl6Tm1Wa056UmxOV0V4WXpOaFlXWmtNR1l4TnpnNE1EVmhObUk1TkEiLCJraWQiOiJPV05sWWpVNE5qUTJORFF5TnpRd1kyWm1Zekl3Wm1Ga09XUXdOMlZsWWpBNU1EWXhZemN3WmpGaU9HVmxPRFE1TlROa1lqTmpNVEEyT1dZME9XWXpZZ19SUzI1NiIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJqZjg0OGQiLCJhdXQiOiJBUFBMSUNBVElPTiIsImF1ZCI6Im9IaDJFMmxmd1RGZFpCU2IzcHFuOTRiZmRDRWEiLCJuYmYiOjE3Mjg1OTAwMjIsImF6cCI6Im9IaDJFMmxmd1RGZFpCU2IzcHFuOTRiZmRDRWEiLCJzY29wZSI6ImRlZmF1bHQiLCJpc3MiOiJodHRwczpcL1wvaXMtdWF0Lm14LmF0dC5jb206OTQ0M1wvb2F1dGgyXC90b2tlbiIsImV4cCI6MTcyODU5MzYyMiwiaWF0IjoxNzI4NTkwMDIyLCJqdGkiOiJmMzg0ZmQ4Zi04ZGIxLTRkNzAtOTI5OC0xN2M3NmYxNzI5N2YifQ.Rk9VqIZ89qAQzNfBgX0oVCCCUaEWnxptx-KCdvZBQ4QQS9D6txmPc_vp3mtTUn-AsBA2FgS_-acset6T1N94sNQeYcytVJzeF4k5fghGGOpFFDfPz0DrS2D01iWZMsPw_XSWsZ42XwUVQYMa7o_F51j9oaDRLHsq3C9GRHdB7e2zQKolUmKquRtOivItlNOVL9H2DC8zd76MJmcPO-WjrM2mSjhlJTIMNvSxpncIVNlaAhXdeZxhkMj2v2AHqSwhnHFrAeIzeLxwVak3GxtOVgbM92OaeHVbP-lUjjwMT5VqkXdeafeE2aoGCvMRKVrYQCUXk3P4E2InHXqI2T4HtvqhIYSWQ5G60m5CfTHyAWAfuGiuXx6OdZYMXWuXzQImIITpHL0db_mgj0OfbvsYk1jk4fjfhnTX1dmtQvmafI23fmNxx3ep9nHsudVGVoXAKyLi1B_d38wjI-WdmzPkaaPycOLwUPKQ_u3GWlkSLMBeJaIbMsemh9qowq7vuh-zo420dw5K1i1Gi1Fnpvj7mOpwoTMqLnFJ55S6-oC5cMg3gU_LlBYrpmJ2Y9zfpbHQeiLeoYlaRWYA1IMI7EaaX9CR3XYVS_VrXDieKxYJiYetW1W28ZLupSE2jqDnVa_jG78yJAMkFao1PO6VoSC1fN73R5ru0Q3Ls3SyaOqCmGc")
//				.retrieve()
//				.body(Object.class);
//		Object response2 = defaultClient.post()
//				.uri("https://gateway-am-uat.mx.att.com:8243/K2V_Customer_Search_Digital_Seat/1.0.0/K2V_Customer_Search_Digital_Seat?MDN=5566237338")
//				.header("Authorization", "Bearer eyJ4NXQiOiJaalV4TVdNM01XRm1aREl6Tm1Wa056UmxOV0V4WXpOaFlXWmtNR1l4TnpnNE1EVmhObUk1TkEiLCJraWQiOiJPV05sWWpVNE5qUTJORFF5TnpRd1kyWm1Zekl3Wm1Ga09XUXdOMlZsWWpBNU1EWXhZemN3WmpGaU9HVmxPRFE1TlROa1lqTmpNVEEyT1dZME9XWXpZZ19SUzI1NiIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJqZjg0OGQiLCJhdXQiOiJBUFBMSUNBVElPTiIsImF1ZCI6Im9IaDJFMmxmd1RGZFpCU2IzcHFuOTRiZmRDRWEiLCJuYmYiOjE3Mjg1OTAwMjIsImF6cCI6Im9IaDJFMmxmd1RGZFpCU2IzcHFuOTRiZmRDRWEiLCJzY29wZSI6ImRlZmF1bHQiLCJpc3MiOiJodHRwczpcL1wvaXMtdWF0Lm14LmF0dC5jb206OTQ0M1wvb2F1dGgyXC90b2tlbiIsImV4cCI6MTcyODU5MzYyMiwiaWF0IjoxNzI4NTkwMDIyLCJqdGkiOiJmMzg0ZmQ4Zi04ZGIxLTRkNzAtOTI5OC0xN2M3NmYxNzI5N2YifQ.Rk9VqIZ89qAQzNfBgX0oVCCCUaEWnxptx-KCdvZBQ4QQS9D6txmPc_vp3mtTUn-AsBA2FgS_-acset6T1N94sNQeYcytVJzeF4k5fghGGOpFFDfPz0DrS2D01iWZMsPw_XSWsZ42XwUVQYMa7o_F51j9oaDRLHsq3C9GRHdB7e2zQKolUmKquRtOivItlNOVL9H2DC8zd76MJmcPO-WjrM2mSjhlJTIMNvSxpncIVNlaAhXdeZxhkMj2v2AHqSwhnHFrAeIzeLxwVak3GxtOVgbM92OaeHVbP-lUjjwMT5VqkXdeafeE2aoGCvMRKVrYQCUXk3P4E2InHXqI2T4HtvqhIYSWQ5G60m5CfTHyAWAfuGiuXx6OdZYMXWuXzQImIITpHL0db_mgj0OfbvsYk1jk4fjfhnTX1dmtQvmafI23fmNxx3ep9nHsudVGVoXAKyLi1B_d38wjI-WdmzPkaaPycOLwUPKQ_u3GWlkSLMBeJaIbMsemh9qowq7vuh-zo420dw5K1i1Gi1Fnpvj7mOpwoTMqLnFJ55S6-oC5cMg3gU_LlBYrpmJ2Y9zfpbHQeiLeoYlaRWYA1IMI7EaaX9CR3XYVS_VrXDieKxYJiYetW1W28ZLupSE2jqDnVa_jG78yJAMkFao1PO6VoSC1fN73R5ru0Q3Ls3SyaOqCmGc")
//				.body("aqui si va tu objeto que quieres enviar")
//				.retrieve()
//				.toBodilessEntity()
//				;
		
		
//		 try {
			
//			JsonNode properties = objectMapper.readTree(response.toString());
//			String respData = objectMapper.writeValueAsString(response.toString());
//			String respMap = objectMapper.readValue(respData, String.class);
//			System.out.println(respData.toString());
//		}
//		 catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 JsonNode periods = properties.get("periods");
//		return response;
//	}

}
