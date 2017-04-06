package com.leftranservice.service.customer;

import java.io.Serializable;

public class UserInfoSyncRequest implements Serializable {
	private static final long serialVersionUID = 1884642785092922398L;
	/** 交易所代码 */
	private String exchangeId;
	/** 交易流水 */
	private String serialNo;
	/**业务发生日期*/
	private String busiDate;
	/** 会员编号 */
	private String memCode;
	/** 会员状态 */
	private String exchangeMemberStatus;
	/** 会员全称 */
	private String fullName;
	/** 会员简称 */
	private String shortName;
	/** 英文全称 */
	private String enFullName;
	/** 英文简称 */
	private String enShortName;
	/** 性别 */
	private String gender;
	/** 国籍 */
	private String nationality;
	/** 证件类型 */
	private String idKind;
	/** 证件号码 */
	private String idNo;
	/** 联系电话 */
	private String tel;
	/** 关联会员账号 */
	private String upMemCode;
	/** 经纪会员编号 */
	private String brokerCode;
	private String memCodeClear;
	private String fundAccountClear;
	private String memberMainType;
	private String memberType;
	private String exchangeFundAccount;
	private String tradeAccount;
	private String legalPerson;
	private String businessCert;
	private String orgCode;
	private String taxCert;
	private String taxCertType;
	private String regAddr;
	private String comAddr;
	private String contactName;
	private String contactTel;
	private String contactFax;
	private String contactEmail;

	/**
	 * @return the exchangeId
	 */
	public String getExchangeId() {
		return exchangeId;
	}

	/**
	 * @param exchangeId
	 *            the exchangeId to set
	 */
	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	/**
	 * @return the memCode
	 */
	public String getMemCode() {
		return memCode;
	}

	/**
	 * @param memCode
	 *            the memCode to set
	 */
	public void setMemCode(String memCode) {
		this.memCode = memCode;
	}

	/**
	 * @return the exchangeMemberStatus
	 */
	public String getExchangeMemberStatus() {
		return exchangeMemberStatus;
	}

	/**
	 * @param exchangeMemberStatus
	 *            the exchangeMemberStatus to set
	 */
	public void setExchangeMemberStatus(String exchangeMemberStatus) {
		this.exchangeMemberStatus = exchangeMemberStatus;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName
	 *            the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the enFullName
	 */
	public String getEnFullName() {
		return enFullName;
	}

	/**
	 * @param enFullName
	 *            the enFullName to set
	 */
	public void setEnFullName(String enFullName) {
		this.enFullName = enFullName;
	}

	/**
	 * @return the enShortName
	 */
	public String getEnShortName() {
		return enShortName;
	}

	/**
	 * @param enShortName
	 *            the enShortName to set
	 */
	public void setEnShortName(String enShortName) {
		this.enShortName = enShortName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the idKind
	 */
	public String getIdKind() {
		return idKind;
	}

	/**
	 * @param idKind
	 *            the idKind to set
	 */
	public void setIdKind(String idKind) {
		this.idKind = idKind;
	}

	/**
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @param idNo
	 *            the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel
	 *            the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the upMemCode
	 */
	public String getUpMemCode() {
		return upMemCode;
	}

	/**
	 * @param upMemCode
	 *            the upMemCode to set
	 */
	public void setUpMemCode(String upMemCode) {
		this.upMemCode = upMemCode;
	}

	/**
	 * @return the brokerCode
	 */
	public String getBrokerCode() {
		return brokerCode;
	}

	/**
	 * @param brokerCode
	 *            the brokerCode to set
	 */
	public void setBrokerCode(String brokerCode) {
		this.brokerCode = brokerCode;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getMemCodeClear() {
		return memCodeClear;
	}

	public void setMemCodeClear(String memCodeClear) {
		this.memCodeClear = memCodeClear;
	}

	public String getFundAccountClear() {
		return fundAccountClear;
	}

	public void setFundAccountClear(String fundAccountClear) {
		this.fundAccountClear = fundAccountClear;
	}

	public String getMemberMainType() {
		return memberMainType;
	}

	public void setMemberMainType(String memberMainType) {
		this.memberMainType = memberMainType;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getExchangeFundAccount() {
		return exchangeFundAccount;
	}

	public void setExchangeFundAccount(String exchangeFundAccount) {
		this.exchangeFundAccount = exchangeFundAccount;
	}

	public String getTradeAccount() {
		return tradeAccount;
	}

	public void setTradeAccount(String tradeAccount) {
		this.tradeAccount = tradeAccount;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getBusinessCert() {
		return businessCert;
	}

	public void setBusinessCert(String businessCert) {
		this.businessCert = businessCert;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getTaxCert() {
		return taxCert;
	}

	public void setTaxCert(String taxCert) {
		this.taxCert = taxCert;
	}

	public String getTaxCertType() {
		return taxCertType;
	}

	public void setTaxCertType(String taxCertType) {
		this.taxCertType = taxCertType;
	}

	public String getRegAddr() {
		return regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getComAddr() {
		return comAddr;
	}

	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactFax() {
		return contactFax;
	}

	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getBusiDate() {
		return busiDate;
	}

	public void setBusiDate(String busiDate) {
		this.busiDate = busiDate;
	}

}
