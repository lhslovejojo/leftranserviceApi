package com.leftranservice.service.tran;

import java.util.Date;
import java.util.LinkedHashMap;

import com.leftranservice.service.enums.RequestTypeEnum;

/**
 * 公共参数
 * 
 * @author lihongsong
 *
 */
public abstract class CommonRequest {
	private String systemCode; // 系统统一编号，必须提供，构造函数的方式
	private String instId;// 机构编码
	private Date requestTime;// 请求日期
	private String requestNo;// 外部系统请求账务请求编号
	private LinkedHashMap<String, String> dextension;// 扩展
	private String serviceCode;// 账务服务编码
	private RequestTypeEnum RequestType;// 请求类型，固定填写SUCC

	public CommonRequest(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public LinkedHashMap<String, String> getDextension() {
		return dextension;
	}

	public void setDextension(LinkedHashMap<String, String> dextension) {
		this.dextension = dextension;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public RequestTypeEnum getRequestType() {
		return RequestType;
	}

	public void setRequestType(RequestTypeEnum requestType) {
		RequestType = requestType;
	}
}
