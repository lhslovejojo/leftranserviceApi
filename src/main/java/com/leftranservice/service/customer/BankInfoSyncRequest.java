package com.leftranservice.service.customer;

import java.io.Serializable;

public class BankInfoSyncRequest implements Serializable {

  private static final long serialVersionUID = -8490591198342172785L;
  /** 交易所代码 */
  private String exchangeId;
  /** 银行编码 */
  private String bankNo;
  /** 银行名称 */
  private String bankName;
  /** 银行产品代码 */
  private String bankProCode;
  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }
  /**
   * @param exchangeId the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }
  /**
   * @return the bankNo
   */
  public String getBankNo() {
    return bankNo;
  }
  /**
   * @param bankNo the bankNo to set
   */
  public void setBankNo(String bankNo) {
    this.bankNo = bankNo;
  }
  /**
   * @return the bankName
   */
  public String getBankName() {
    return bankName;
  }
  /**
   * @param bankName the bankName to set
   */
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  /**
   * @return the bankProCode
   */
  public String getBankProCode() {
    return bankProCode;
  }
  /**
   * @param bankProCode the bankProCode to set
   */
  public void setBankProCode(String bankProCode) {
    this.bankProCode = bankProCode;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "BankInfSyncRequest [exchangeId=" + exchangeId + ", bankNo=" + bankNo + ", bankName=" + bankName
        + ", bankProCode=" + bankProCode + "]";
  }

}
