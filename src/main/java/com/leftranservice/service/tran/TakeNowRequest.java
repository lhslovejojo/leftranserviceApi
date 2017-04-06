package com.leftranservice.service.tran;

import java.io.Serializable;
import java.util.Date;

public class TakeNowRequest implements Serializable {

	private static final long serialVersionUID = 5075778179119808658L;
	/** 请求日期 */
	private Date requestTime;
	/** 请求流水号 */
	private String requestId;
	/** 业务单号（防重用） */
	private String serialNo;
	/** 交易所流水号 */
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
	/** 资金账户（清算中心） */
	private String fundAccountClear;
	/** 币种编码 */
	private String moneyType;
	/** 订单总金额 */
	private Long orderAmt;
	/** 出金手续费 */
	private Long outPoundage;
	/** 银行产品代码 */
	private String bankProCode;
	/** 银行账户名 */
	private String accountName;
	/** 银行帐号 */
	private String bankAccount;
	/** 银行代码 */
	private String bankNo;
	/** 是否跨行 */
	private String crossFlag;
	/** 大额行号 */
	private String largeBankId;
	/** 联行号 */
	private String unionBankId;
	/** 付款账户银行名称 */
	private String outAcctIdBankName;
	/** 会员主体类型 */
	private String memberMainType;
	/** 会员全称 */
	private String fullName;
	/** 证件类型 */
	private String idKind;
	/** 证件号码 */
	private String idNo;

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

	public Long getOutPoundage() {
		return outPoundage;
	}

	public void setOutPoundage(Long outPoundage) {
		this.outPoundage = outPoundage;
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

	public String getCrossFlag() {
		return crossFlag;
	}

	public void setCrossFlag(String crossFlag) {
		this.crossFlag = crossFlag;
	}

	public String getLargeBankId() {
		return largeBankId;
	}

	public void setLargeBankId(String largeBankId) {
		this.largeBankId = largeBankId;
	}

	public String getUnionBankId() {
		return unionBankId;
	}

	public void setUnionBankId(String unionBankId) {
		this.unionBankId = unionBankId;
	}

	public String getOutAcctIdBankName() {
		return outAcctIdBankName;
	}

	public void setOutAcctIdBankName(String outAcctIdBankName) {
		this.outAcctIdBankName = outAcctIdBankName;
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

	@Override
	public String toString() {
		return "TakeNowRequest [requestTime=" + requestTime + ", requestId=" + requestId + ", serialNo=" + serialNo
				+ ", tradeSerialNo=" + tradeSerialNo + ", orderId=" + orderId + ", systemCode=" + systemCode
				+ ", busiDate=" + busiDate + ", busiTime=" + busiTime + ", productType=" + productType
				+ ", productCode=" + productCode + ", busiType=" + busiType + ", memCode=" + memCode
				+ ", fundAccountClear=" + fundAccountClear + ", moneyType=" + moneyType + ", orderAmt=" + orderAmt
				+ ", outPoundage=" + outPoundage + ", bankProCode=" + bankProCode + ", accountName=" + accountName
				+ ", bankAccount=" + bankAccount + ", bankNo=" + bankNo + ", crossFlag=" + crossFlag + ", largeBankId="
				+ largeBankId + ", unionBankId=" + unionBankId + ", outAcctIdBankName=" + outAcctIdBankName
				+ ", memberMainType=" + memberMainType + ", fullName=" + fullName + ", idKind=" + idKind + ", idNo="
				+ idNo + "]";
	}

}
