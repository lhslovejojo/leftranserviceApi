package com.leftranservice.service.query;

import java.io.Serializable;

public class TradeResponse implements Serializable {

  private static final long serialVersionUID = -7960554590958956481L;
  /** 业务发生日期(YYYYMMDD) */
  private String initDate;
  /** 交易所代码 */
  private String exchangeId;
  /** 资金账号 */
  private String exchangeFundAccount;
  /** 银行产品代码 */
  private String bankProCode;
  /** 银行帐号 */
  private String bankAccount;
  /** 交易所流水号 */
  private String tradeSerialNo;
  /** 清算中心流水号 */
  private String clearSerialNo;
  /** 发起方类型 */
  private String sourceFrom;
  /** 币种 */
  private String moneyType;
  /** 出入金标志 （0-出金1-入金）	 */
  private String inoutFlag;
  /** 发生金额 */
  private String occurAmount;
  /** 备注 */
  private String remark;
  /** 业务时间(HHmmss) */
  private String busiDatetime;

  /**
   * @return the initDate
   */
  public String getInitDate() {
    return initDate;
  }

  /**
   * @param initDate
   *          the initDate to set
   */
  public void setInitDate(String initDate) {
    this.initDate = initDate;
  }

  /**
   * @return the exchangeId
   */
  public String getExchangeId() {
    return exchangeId;
  }

  /**
   * @param exchangeId
   *          the exchangeId to set
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * @return the exchangeFundAccount
   */
  public String getExchangeFundAccount() {
    return exchangeFundAccount;
  }

  /**
   * @param exchangeFundAccount
   *          the exchangeFundAccount to set
   */
  public void setExchangeFundAccount(String exchangeFundAccount) {
    this.exchangeFundAccount = exchangeFundAccount;
  }

  /**
   * @return the bankProCode
   */
  public String getBankProCode() {
    return bankProCode;
  }

  /**
   * @param bankProCode
   *          the bankProCode to set
   */
  public void setBankProCode(String bankProCode) {
    this.bankProCode = bankProCode;
  }

  /**
   * @return the bankAccount
   */
  public String getBankAccount() {
    return bankAccount;
  }

  /**
   * @param bankAccount
   *          the bankAccount to set
   */
  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * @return the clearSerialNo
   */
  public String getClearSerialNo() {
    return clearSerialNo;
  }

  /**
   * @param clearSerialNo
   *          the clearSerialNo to set
   */
  public void setClearSerialNo(String clearSerialNo) {
    this.clearSerialNo = clearSerialNo;
  }

  /**
   * @return the sourceFrom
   */
  public String getSourceFrom() {
    return sourceFrom;
  }

  /**
   * @param sourceFrom
   *          the sourceFrom to set
   */
  public void setSourceFrom(String sourceFrom) {
    this.sourceFrom = sourceFrom;
  }

  /**
   * @return the moneyType
   */
  public String getMoneyType() {
    return moneyType;
  }

  /**
   * @param moneyType
   *          the moneyType to set
   */
  public void setMoneyType(String moneyType) {
    this.moneyType = moneyType;
  }

  /**
   * @return the inoutFlag
   */
  public String getInoutFlag() {
    return inoutFlag;
  }

  /**
   * @param inoutFlag
   *          the inoutFlag to set
   */
  public void setInoutFlag(String inoutFlag) {
    this.inoutFlag = inoutFlag;
  }

  /**
   * @return the occurAmount
   */
  public String getOccurAmount() {
    return occurAmount;
  }

  /**
   * @param occurAmount
   *          the occurAmount to set
   */
  public void setOccurAmount(String occurAmount) {
    this.occurAmount = occurAmount;
  }

  /**
   * @return the remark
   */
  public String getRemark() {
    return remark;
  }

  /**
   * @param remark
   *          the remark to set
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * @return the busiDatetime
   */
  public String getBusiDatetime() {
    return busiDatetime;
  }

  /**
   * @param busiDatetime
   *          the busiDatetime to set
   */
  public void setBusiDatetime(String busiDatetime) {
    this.busiDatetime = busiDatetime;
  }

public String getTradeSerialNo() {
	return tradeSerialNo;
}

public void setTradeSerialNo(String tradeSerialNo) {
	this.tradeSerialNo = tradeSerialNo;
}

}
