package com.leftranservice.service.customer.domain;

import java.io.Serializable;

public class UserInstInfo implements Serializable {
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "UserInstInfo [legalPerson=" + legalPerson + ", businessCert=" + businessCert + ", orgCode=" + orgCode
        + ", taxCert=" + taxCert + ", taxCertType=" + taxCertType + ", regAddr=" + regAddr + ", comAddr=" + comAddr
        + ", contactName=" + contactName + ", contactTel=" + contactTel + ", contactFax=" + contactFax
        + ", contactEmail=" + contactEmail + "]";
  }

  private static final long serialVersionUID = 392783334910725604L;
  /** 法人名称 */
  private String legalPerson;
  /** 工商营业执照 */
  private String businessCert;
  /** 组织机构代码 */
  private String orgCode;
  /** 税务登记证号 */
  private String taxCert;
  /** 税务登记证类型 */
  private String taxCertType;
  /** 注册地址 */
  private String regAddr;
  /** 营业地址 */
  private String comAddr;
  /** 联系人姓名 */
  private String contactName;
  /** 联系人电话 */
  private String contactTel;
  /** 联系人传真 */
  private String contactFax;
  /** 联系人邮箱 */
  private String contactEmail;

  /**
   * @return the legalPerson
   */
  public String getLegalPerson() {
    return legalPerson;
  }

  /**
   * @param legalPerson
   *          the legalPerson to set
   */
  public void setLegalPerson(String legalPerson) {
    this.legalPerson = legalPerson;
  }

  /**
   * @return the businessCert
   */
  public String getBusinessCert() {
    return businessCert;
  }

  /**
   * @param businessCert
   *          the businessCert to set
   */
  public void setBusinessCert(String businessCert) {
    this.businessCert = businessCert;
  }

  /**
   * @return the orgCode
   */
  public String getOrgCode() {
    return orgCode;
  }

  /**
   * @param orgCode
   *          the orgCode to set
   */
  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  /**
   * @return the taxCert
   */
  public String getTaxCert() {
    return taxCert;
  }

  /**
   * @param taxCert
   *          the taxCert to set
   */
  public void setTaxCert(String taxCert) {
    this.taxCert = taxCert;
  }

  /**
   * @return the taxCertType
   */
  public String getTaxCertType() {
    return taxCertType;
  }

  /**
   * @param taxCertType
   *          the taxCertType to set
   */
  public void setTaxCertType(String taxCertType) {
    this.taxCertType = taxCertType;
  }

  /**
   * @return the regAddr
   */
  public String getRegAddr() {
    return regAddr;
  }

  /**
   * @param regAddr
   *          the regAddr to set
   */
  public void setRegAddr(String regAddr) {
    this.regAddr = regAddr;
  }

  /**
   * @return the comAddr
   */
  public String getComAddr() {
    return comAddr;
  }

  /**
   * @param comAddr
   *          the comAddr to set
   */
  public void setComAddr(String comAddr) {
    this.comAddr = comAddr;
  }

  /**
   * @return the contactName
   */
  public String getContactName() {
    return contactName;
  }

  /**
   * @param contactName
   *          the contactName to set
   */
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  /**
   * @return the contactTel
   */
  public String getContactTel() {
    return contactTel;
  }

  /**
   * @param contactTel
   *          the contactTel to set
   */
  public void setContactTel(String contactTel) {
    this.contactTel = contactTel;
  }

  /**
   * @return the contactFax
   */
  public String getContactFax() {
    return contactFax;
  }

  /**
   * @param contactFax
   *          the contactFax to set
   */
  public void setContactFax(String contactFax) {
    this.contactFax = contactFax;
  }

  /**
   * @return the contactEmail
   */
  public String getContactEmail() {
    return contactEmail;
  }

  /**
   * @param contactEmail
   *          the contactEmail to set
   */
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

}
