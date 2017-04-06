package com.leftranservice.service.tran;

public class PaymentResult {
	private String responseCode;// 返回码
	private String responseDesc;// 返回消息描述
	private String requestNo;// 外部系统请求编号(支付基础服务号)
	private String evidenceNo;// 记账凭证号
	private String accountingDay;// 记账会计日

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getEvidenceNo() {
		return evidenceNo;
	}

	public void setEvidenceNo(String evidenceNo) {
		this.evidenceNo = evidenceNo;
	}

	public String getAccountingDay() {
		return accountingDay;
	}

	public void setAccountingDay(String accountingDay) {
		this.accountingDay = accountingDay;
	}

}
