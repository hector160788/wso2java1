package com.apirest.app.dto;




public class Request5G {

	private Long orderId;
	private String subscriberId;
	private String reasonCode;
	private String status;
	@Override
	public String toString() {
		return "Request5G [orderId=" + orderId + ", subscriberId=" + subscriberId + ", reasonCode=" + reasonCode
				+ ", status=" + status + "]";
	}

	
	

}
