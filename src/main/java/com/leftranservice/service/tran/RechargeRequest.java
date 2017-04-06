package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class RechargeRequest implements Serializable {
  private static final long serialVersionUID = 3721848462086749682L;
  /** 请求日期 */
  private Date requestTime;
  /** 请求流水号 */
  private String requestId;
  /** 清算中心流水号（防重用） */
  private String serialNo;
  /** 交易所流水 */
  private String tradeSerialNo;
  /** 订单号 */
  private String orderId;
  /** 发起方编号，本接口写交易所编码 */
  private String systemCode;
  /** 业务发生日期(YYYYMMDD) */
  private String busiDate;
  /** 业务发生时间YYYYMMDDHHmmdd */
  private String busiTime;
  /** 产品分类 */
  private String productType;
  /** 产品编码 */
  private String productCode;
  /** 业务类型 */
  private String busiType;
  /** 会员编码 */
  private String memCode;
  /** 资金账户 */
  private String fundAccountClear;
  /** 币种编码 */
  private String moneyType;
  /** 订单总金额 */
  private Long orderAmt;
  /** 银行产品代码 */
  private String bankProCode;
  /** 银行账户名 */
  private String accountName;
  /** 银行帐号 */
  private String bankAccount;
  /** 银行代码 */
  private String bankNo;
  /** 会员主体类型 */
  private String memberMainType;
  /** 会员全称 */
  private String fullName;
  /** 证件类型 */
  private String idKind;
  /** 证件号码 */
  private String idNo;
  /**手续费 主要用于拷贝FundFlow的报错*/
  private Double outPoundage;
public Date getRequestTime() {
	return requestTime;
}
public void setRequestTime(Date requestTime) {
	this.requestTime = requestTime;
}
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getSerialNo() {
	return serialNo;
}
public void setSerialNo(String serialNo) {
	this.serialNo = serialNo;
}
public String getTradeSerialNo() {
	return tradeSerialNo;
}
public void setTradeSerialNo(String tradeSerialNo) {
	this.tradeSerialNo = tradeSerialNo;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getSystemCode() {
	return systemCode;
}
public void setSystemCode(String systemCode) {
	this.systemCode = systemCode;
}
public String getBusiDate() {
	return busiDate;
}
public void setBusiDate(String busiDate) {
	this.busiDate = busiDate;
}
public String getBusiTime() {
	return busiTime;
}
public void setBusiTime(String busiTime) {
	this.busiTime = busiTime;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getBusiType() {
	return busiType;
}
public void setBusiType(String busiType) {
	this.busiType = busiType;
}
public String getMemCode() {
	return memCode;
}
public void setMemCode(String memCode) {
	this.memCode = memCode;
}
public String getFundAccountClear() {
	return fundAccountClear;
}
public void setFundAccountClear(String fundAccountClear) {
	this.fundAccountClear = fundAccountClear;
}
public String getMoneyType() {
	return moneyType;
}
public void setMoneyType(String moneyType) {
	this.moneyType = moneyType;
}
public Long getOrderAmt() {
	return orderAmt;
}
public void setOrderAmt(Long orderAmt) {
	this.orderAmt = orderAmt;
}
public String getBankProCode() {
	return bankProCode;
}
public void setBankProCode(String bankProCode) {
	this.bankProCode = bankProCode;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getBankAccount() {
	return bankAccount;
}
public void setBankAccount(String bankAccount) {
	this.bankAccount = bankAccount;
}
public String getBankNo() {
	return bankNo;
}
public void setBankNo(String bankNo) {
	this.bankNo = bankNo;
}
public String getMemberMainType() {
	return memberMainType;
}
public void setMemberMainType(String memberMainType) {
	this.memberMainType = memberMainType;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getIdKind() {
	return idKind;
}
public void setIdKind(String idKind) {
	this.idKind = idKind;
}
public String getIdNo() {
	return idNo;
}
public void setIdNo(String idNo) {
	this.idNo = idNo;
}
public Double getOutPoundage() {
	return outPoundage;
}
public void setOutPoundage(Double outPoundage) {
	this.outPoundage = outPoundage;
}
@Override
public String toString() {
	return "RechargeRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", serialNo=" + serialNo
			+ ", tradeSerialNo=" + tradeSerialNo + ", orderId=" + orderId + ", systemCode=" + systemCode + ", busiDate="
			+ busiDate + ", busiTime=" + busiTime + ", productType=" + productType + ", productCode=" + productCode
			+ ", busiType=" + busiType + ", memCode=" + memCode + ", fundAccountClear=" + fundAccountClear
			+ ", moneyType=" + moneyType + ", orderAmt=" + orderAmt + ", bankProCode=" + bankProCode + ", accountName="
			+ accountName + ", bankAccount=" + bankAccount + ", bankNo=" + bankNo + ", memberMainType=" + memberMainType
			+ ", fullName=" + fullName + ", idKind=" + idKind + ", idNo=" + idNo + ", outPoundage=" + outPoundage + "]";
}

  

}
